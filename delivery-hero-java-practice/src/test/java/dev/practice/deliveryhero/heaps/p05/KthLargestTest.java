package dev.practice.deliveryhero.heaps.p05;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("heaps")
@Timeout(10)
class KthLargestTest {
    private final KthLargest sut = new KthLargest();
    @Test
    void maximum() throws Exception {
        assertEquals(9, sut.find(new int[]{3,9,1},1));
    }

    @Test
    void second() throws Exception {
        assertEquals(5, sut.find(new int[]{3,5,9},2));
    }

    @Test
    void duplicate() throws Exception {
        assertEquals(9, sut.find(new int[]{9,9,4},2));
    }

    @Test
    void last() throws Exception {
        assertEquals(-8, sut.find(new int[]{0,-8,3},3));
    }

    @Test
    void preservesInput() throws Exception {
        int[] a={3,1,2}; assertEquals(2,sut.find(a,2)); assertArrayEquals(new int[]{3,1,2},a);
    }
}
