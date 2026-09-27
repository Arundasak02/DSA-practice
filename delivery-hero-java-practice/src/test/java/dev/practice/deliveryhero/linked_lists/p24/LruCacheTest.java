package dev.practice.deliveryhero.linked_lists.p24;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("linked_lists")
@Timeout(10)
class LruCacheTest {
    private final LruCache sut = new LruCache(2);
    @Test
    void eviction() throws Exception {
        sut.put(1,10);sut.put(2,20);assertEquals(OptionalInt.of(10),sut.get(1));sut.put(3,30);assertEquals(OptionalInt.empty(),sut.get(2));assertEquals(OptionalInt.of(30),sut.get(3));
    }

    @Test
    void update() throws Exception {
        sut.put(1,1);sut.put(2,2);sut.put(1,9);sut.put(3,3);assertEquals(OptionalInt.of(9),sut.get(1));assertTrue(sut.get(2).isEmpty());
    }

    @Test
    void missing() throws Exception {
        assertTrue(sut.get(7).isEmpty());
    }

    @Test
    void zero() throws Exception {
        var c=new LruCache(0);c.put(1,1);assertTrue(c.get(1).isEmpty());
    }

    @Test
    void minusOneValue() throws Exception {
        sut.put(1,-1);assertEquals(OptionalInt.of(-1),sut.get(1));
    }

    @Test
    void capacityBoundary() throws Exception {
        sut.put(1,10);sut.put(2,20);assertEquals(OptionalInt.of(10),sut.get(1));assertEquals(OptionalInt.of(20),sut.get(2));
    }
}
