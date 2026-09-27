package dev.practice.deliveryhero.practical.p43;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("practical")
@Timeout(10)
class InsertionOrderedSetTest {
    private final InsertionOrderedSet sut = new InsertionOrderedSet();
    @Test
    void insertionAndDuplicates() throws Exception {
        sut.push(2);sut.push(1);sut.push(2);assertEquals(List.of(2,1),sut.orderedValues());assertEquals(Set.of(1,2),sut.values());assertEquals(OptionalInt.of(1),sut.pop());
    }

    @Test
    void empty() throws Exception {
        assertTrue(sut.pop().isEmpty());assertFalse(sut.remove(8));assertTrue(sut.values().isEmpty());
    }

    @Test
    void removeReadd() throws Exception {
        sut.push(1);sut.push(2);assertTrue(sut.remove(1));sut.push(1);assertEquals(List.of(2,1),sut.orderedValues());
    }

    @Test
    void intersection() throws Exception {
        sut.push(3);sut.push(1);sut.push(2);var other=new InsertionOrderedSet();other.push(2);other.push(3);var r=sut.intersect(other);assertEquals(List.of(3,2),r.orderedValues());assertEquals(List.of(3,1,2),sut.orderedValues());assertEquals(List.of(2,3),other.orderedValues());r.remove(3);assertTrue(sut.values().contains(3));
    }

    @Test
    void snapshots() throws Exception {
        sut.push(1);var a=sut.values();var b=sut.orderedValues();sut.push(2);assertEquals(Set.of(1),a);assertEquals(List.of(1),b);
    }

    @Test
    void popAfterMiddleRemoval() throws Exception {
        sut.push(1);sut.push(2);sut.push(3);sut.remove(2);assertEquals(OptionalInt.of(3),sut.pop());assertEquals(OptionalInt.of(1),sut.pop());assertTrue(sut.pop().isEmpty());
    }
}
