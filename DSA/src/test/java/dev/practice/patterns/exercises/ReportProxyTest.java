package dev.practice.patterns.exercises;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.atomic.*;
@Tag("practice")
@Tag("design-patterns")
@Timeout(5)
class ReportProxyTest {
    @Test void cachesSuccessfulLoads() {
        var loads=new AtomicInteger();
        var auth=new AtomicInteger();
        var p=ReportProxy.create((u,r)->"v"+loads.incrementAndGet(),(u,r)->{auth.incrementAndGet();
            return true;
        });
        assertEquals("v1",p.fetch("a","r"));
        assertEquals("v1",p.fetch("a","r"));
        assertEquals(1,loads.get());
        assertEquals(2,auth.get());
    }
    @Test void rechecksRevokedAccess() {
        var allowed=new AtomicBoolean(true);
        var p=ReportProxy.create((u,r)->"secret",(u,r)->allowed.get());
        p.fetch("a","r");
        allowed.set(false);
        assertThrows(SecurityException.class,()->p.fetch("a","r"));
    }
    @Test void separatesUserAndReport() {
        var n=new AtomicInteger();
        var p=ReportProxy.create((u,r)->"v"+n.incrementAndGet(),(u,r)->true);
        assertEquals("v1",p.fetch("a","b:c"));
        assertEquals("v2",p.fetch("a:b","c"));
        assertEquals("v3",p.fetch("a","c"));
    }
    @Test void doesNotCacheFailures() {
        var n=new AtomicInteger();
        var failure=new IllegalStateException();
        var p=ReportProxy.create((u,r)->{if(n.incrementAndGet()==1)throw failure;
            return "ok";
        },(u,r)->true);
        assertSame(failure,assertThrows(IllegalStateException.class,()->p.fetch("a","r")));
        assertEquals("ok",p.fetch("a","r"));
        assertEquals(2,n.get());
    }
    @Test void deniesBeforeDelegate() {
        var p=ReportProxy.create((u,r)->{fail("delegate must not run");
            return "";
        },(u,r)->false);
        assertThrows(SecurityException.class,()->p.fetch("a","r"));
    }
}
