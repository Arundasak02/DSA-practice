package dev.practice.patterns.exercises;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.atomic.*;
@Tag("practice")
@Tag("design-patterns")
@Timeout(5)
class PriceSubscriptionsTest {
    @Test void deliversInOrder() {
        var h=PriceSubscriptions.create();
        var seen=new ArrayList<String>();
        h.subscribe("a",t->seen.add("a:"+t.symbol()));
        h.subscribe("b",t->seen.add("b:"+t.cents()));
        assertEquals(List.of(),h.publish(new PriceSubscriptions.Tick("X",10)));
        assertEquals(List.of("a:X","b:10"),seen);
    }
    @Test void replacementKeepsPosition() {
        var h=PriceSubscriptions.create();
        var seen=new ArrayList<String>();
        h.subscribe("a",t->seen.add("old"));
        h.subscribe("b",t->seen.add("b"));
        h.subscribe("a",t->seen.add("new"));
        h.publish(new PriceSubscriptions.Tick("X",1));
        assertEquals(List.of("new","b"),seen);
    }
    @Test void snapshotDuringCallback() {
        var h=PriceSubscriptions.create();
        var seen=new ArrayList<String>();
        h.subscribe("a",t->{seen.add("a");
            h.unsubscribe("b");
            h.subscribe("c",x->seen.add("c"));
        });
        h.subscribe("b",t->seen.add("b"));
        h.publish(new PriceSubscriptions.Tick("X",1));
        assertEquals(List.of("a","b"),seen);
        seen.clear();
        h.publish(new PriceSubscriptions.Tick("X",2));
        assertEquals(List.of("a","c"),seen);
    }
    @Test void isolatesListenerFailures() {
        var h=PriceSubscriptions.create();
        var seen=new ArrayList<String>();
        h.subscribe("a",t->{throw new IllegalStateException();
        });
        h.subscribe("b",t->seen.add("ok"));
        assertEquals(List.of("a"),h.publish(new PriceSubscriptions.Tick("X",1)));
        assertEquals(List.of("ok"),seen);
    }
    @Test void emptyAndIndependent() {
        var a=PriceSubscriptions.create();
        a.subscribe("a",t->{throw new IllegalStateException();
        });
        var b=PriceSubscriptions.create();
        b.unsubscribe("absent");
        assertEquals(List.of(),b.publish(new PriceSubscriptions.Tick("X",1)));
    }
}
