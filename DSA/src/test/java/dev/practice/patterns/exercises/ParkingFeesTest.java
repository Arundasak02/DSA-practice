package dev.practice.patterns.exercises;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.atomic.*;
@Tag("practice")
@Tag("design-patterns")
@Timeout(5)
class ParkingFeesTest {
    @Test void roundsStartedHours() {
        var p=ParkingFees.hourly(100);
        assertEquals(0,p.cents(0));
        assertEquals(100,p.cents(1));
        assertEquals(100,p.cents(60));
        assertEquals(200,p.cents(61));
    }
    @Test void supportsNewPolicy() {
        var calls=new AtomicInteger();
        var s=ParkingFees.service(Map.of("EV",m->{calls.incrementAndGet();
            return 77;
        }));
        assertEquals(77,s.quote("EV",15));
        assertEquals(1,calls.get());
    }
    @Test void rejectsBeforeDelegation() {
        var calls=new AtomicInteger();
        var s=ParkingFees.service(Map.of("car",m->{calls.incrementAndGet();
            return 1;
        }));
        assertThrows(IllegalArgumentException.class,()->s.quote("CAR",1));
        assertThrows(IllegalArgumentException.class,()->s.quote("car",-1));
        assertEquals(0,calls.get());
    }
    @Test void snapshotsRegistry() {
        var map=new HashMap<String,ParkingFees.FeePolicy>();
        map.put("car",m->10);
        var s=ParkingFees.service(map);
        map.put("car",m->99);
        assertEquals(10,s.quote("car",5));
    }
    @Test void rejectsInvalidRatesAndOverflow() {
        assertThrows(IllegalArgumentException.class,()->ParkingFees.hourly(-1));
        var p=ParkingFees.hourly(Long.MAX_VALUE);
        assertThrows(ArithmeticException.class,()->p.cents(61));
        assertThrows(IllegalArgumentException.class,()->p.cents(-1));
        assertEquals(153722867280912931L,ParkingFees.hourly(1).cents(Long.MAX_VALUE));
    }
}
