package dev.practice.patterns.exercises;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.atomic.*;
@Tag("practice")
@Tag("design-patterns")
@Timeout(5)
class CheckoutFacadeTest {
    @Test void constructsFamilyOnce() {
        var events=new ArrayList<String>();
        var f=new CheckoutFacade.Factory(){public CheckoutFacade.Payments payments(){events.add("payments");
                return (id,c)->{events.add("charge:"+id+":"+c);
                    return "p1";
                };
            } public CheckoutFacade.Receipts receipts(){events.add("receipts");
                return (id,p)->{events.add("receipt:"+id+":"+p);
                    return "r1";
                };
            }};
        var c=CheckoutFacade.checkout(f);
        assertEquals(List.of("payments","receipts"),events);
        assertEquals("r1",c.place("o1",10));
        assertEquals(List.of("payments","receipts","charge:o1:10","receipt:o1:p1"),events);
    }
    @Test void validatesBeforeCalls() {
        var c=CheckoutFacade.checkout(factory((id,n)->{fail("charge");
            return "";
        },(id,p)->{fail("receipt");
            return "";
        }));
        assertThrows(IllegalArgumentException.class,()->c.place("x",0));
        assertThrows(IllegalArgumentException.class,()->c.place("x",-1));
    }
    @Test void chargeFailureStopsWorkflow() {
        var failure=new IllegalStateException();
        var c=CheckoutFacade.checkout(factory((id,n)->{throw failure;
        },(id,p)->{fail("receipt");
            return "";
        }));
        assertSame(failure,assertThrows(IllegalStateException.class,()->c.place("x",1)));
    }
    @Test void receiptFailureDoesNotRetryPayment() {
        var count=new AtomicInteger();
        var failure=new IllegalStateException();
        var c=CheckoutFacade.checkout(factory((id,n)->{count.incrementAndGet();
            return "p";
        },(id,p)->{throw failure;
        }));
        assertSame(failure,assertThrows(IllegalStateException.class,()->c.place("x",1)));
        assertEquals(1,count.get());
    }
    @Test void familyCanBeReplaced() {
        var c=CheckoutFacade.checkout(factory((id,n)->"sandbox",(id,p)->p+":"+id));
        assertEquals("sandbox:o",c.place("o",5));
    }
    private static CheckoutFacade.Factory factory(CheckoutFacade.Payments p, CheckoutFacade.Receipts r) {
        return new CheckoutFacade.Factory() {
            public CheckoutFacade.Payments payments() { return p;
            }
            public CheckoutFacade.Receipts receipts() { return r;
            }
        };
    }
}
