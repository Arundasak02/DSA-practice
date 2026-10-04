package dev.practice.deliveryhero.arrays.p40;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumElementTest {
    private final MaximumElement subject = new MaximumElement();
    @Test void singleton() { assertEquals(7, subject.find(new int[]{7})); }
    @Test void allNegative() { assertEquals(-2, subject.find(new int[]{-8,-2,-5})); }
    @Test void maximumAtEitherEnd() {
        assertEquals(9, subject.find(new int[]{9,2,3}));
        assertEquals(9, subject.find(new int[]{2,3,9}));
    }
    @Test void duplicatesAndZero() { assertEquals(0, subject.find(new int[]{-1,0,0,-2})); }
    @Test void extremesAndNoMutation() {
        int[] a={Integer.MIN_VALUE, Integer.MAX_VALUE, -1}; int[] copy=a.clone();
        assertEquals(Integer.MAX_VALUE, subject.find(a)); assertArrayEquals(copy,a);
    }
}
