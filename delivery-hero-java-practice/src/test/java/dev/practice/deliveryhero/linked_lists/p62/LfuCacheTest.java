package dev.practice.deliveryhero.linked_lists.p62;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

@Tag("practice")
@Tag("linked_lists")
@Timeout(10)
class LfuCacheTest {
    @Test void leastFrequentEviction() { var c=new LfuCache(2); c.put(1,10); c.put(2,20); assertEquals(OptionalInt.of(10),c.get(1)); c.put(3,30); assertTrue(c.get(2).isEmpty()); assertEquals(OptionalInt.of(10),c.get(1)); assertEquals(OptionalInt.of(30),c.get(3)); }
    @Test void leastRecentBreaksFrequencyTie() { var c=new LfuCache(2); c.put(1,10); c.put(2,20); c.get(1); c.get(2); c.put(3,30); assertTrue(c.get(1).isEmpty()); assertEquals(OptionalInt.of(20),c.get(2)); }
    @Test void updateCountsAsAccess() { var c=new LfuCache(2); c.put(1,10); c.put(2,20); c.put(1,99); c.put(3,30); assertEquals(OptionalInt.of(99),c.get(1)); assertTrue(c.get(2).isEmpty()); }
    @Test void zeroCapacity() { var c=new LfuCache(0); c.put(1,10); assertTrue(c.get(1).isEmpty()); }
    @Test void missingAndNegativeValue() { var c=new LfuCache(1); assertTrue(c.get(99).isEmpty()); c.put(-2,-1); assertEquals(OptionalInt.of(-1),c.get(-2)); }
    @Test void resetsMinimumFrequencyAfterEviction() { var c=new LfuCache(2); c.put(1,1); c.put(2,2); c.get(1); c.get(2); c.put(3,3); c.put(4,4); assertTrue(c.get(1).isEmpty()); assertTrue(c.get(3).isEmpty()); assertEquals(OptionalInt.of(2),c.get(2)); assertEquals(OptionalInt.of(4),c.get(4)); }
    @Test void negativeCapacityRejected() { assertThrows(IllegalArgumentException.class, () -> new LfuCache(-1)); }
}
