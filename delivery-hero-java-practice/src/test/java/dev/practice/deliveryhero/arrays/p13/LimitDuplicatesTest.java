package dev.practice.deliveryhero.arrays.p13;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("arrays")
@Timeout(10)
class LimitDuplicatesTest {
    private final LimitDuplicates sut = new LimitDuplicates();
    @Test
    void threeCopies() throws Exception {
        int[] a={1,1,1,2,2,3};int n=sut.compact(a);assertEquals(5,n);assertArrayEquals(new int[]{1,1,2,2,3},Arrays.copyOf(a,n));
    }

    @Test
    void allSame() throws Exception {
        int[] a={4,4,4,4};assertEquals(2,sut.compact(a));assertArrayEquals(new int[]{4,4},Arrays.copyOf(a,2));
    }

    @Test
    void empty() throws Exception {
        assertEquals(0,sut.compact(new int[0]));
    }

    @Test
    void single() throws Exception {
        int[] a={7};assertEquals(1,sut.compact(a));assertEquals(7,a[0]);
    }

    @Test
    void negative() throws Exception {
        int[] a={-2,-2,-2,0,0,0};int n=sut.compact(a);assertEquals(4,n);assertArrayEquals(new int[]{-2,-2,0,0},Arrays.copyOf(a,n));
    }
}
