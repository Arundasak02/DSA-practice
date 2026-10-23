package dev.practice.patterns.exercises;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.atomic.*;
@Tag("practice")
@Tag("design-patterns")
@Timeout(5)
class WatchlistPrototypeTest {
    @Test void copiesValuesAndIdentity() {
        var r=new WatchlistPrototype.Rule("X",10);
        var original=new WatchlistPrototype.Watchlist("w",new ArrayList<>(List.of(r)));
        var copy=WatchlistPrototype.copyOf(original);
        assertNotSame(original,copy);
        assertNotSame(original.rules,copy.rules);
        assertNotSame(r,copy.rules.get(0));
        assertEquals("w",copy.name);
        assertEquals("X",copy.rules.get(0).symbol);
        assertEquals(10,copy.rules.get(0).threshold);
    }
    @Test void copyMutationIsIndependent() {
        var original=new WatchlistPrototype.Watchlist("w",new ArrayList<>(List.of(new WatchlistPrototype.Rule("X",10))));
        var copy=WatchlistPrototype.copyOf(original);
        copy.rules.get(0).threshold=99;
        copy.rules.add(new WatchlistPrototype.Rule("Y",1));
        copy.name="other";
        assertEquals(10,original.rules.get(0).threshold);
        assertEquals(1,original.rules.size());
        assertEquals("w",original.name);
    }
    @Test void originalMutationIsIndependent() {
        var original=new WatchlistPrototype.Watchlist("w",new ArrayList<>(List.of(new WatchlistPrototype.Rule("X",10))));
        var copy=WatchlistPrototype.copyOf(original);
        original.rules.get(0).symbol="Y";
        original.rules.clear();
        assertEquals("X",copy.rules.get(0).symbol);
    }
    @Test void copiesEmptyList() {
        var copy=WatchlistPrototype.copyOf(new WatchlistPrototype.Watchlist("w",List.of()));
        assertTrue(copy.rules.isEmpty());
        copy.rules.add(new WatchlistPrototype.Rule("X",1));
        assertEquals(1,copy.rules.size());
    }
    @Test void breaksRepeatedMutableAliases() {
        var rule=new WatchlistPrototype.Rule("X",1);
        var copy=WatchlistPrototype.copyOf(new WatchlistPrototype.Watchlist("w",List.of(rule,rule)));
        assertNotSame(copy.rules.get(0),copy.rules.get(1));
        copy.rules.get(0).threshold=2;
        assertEquals(1,copy.rules.get(1).threshold);
    }
}
