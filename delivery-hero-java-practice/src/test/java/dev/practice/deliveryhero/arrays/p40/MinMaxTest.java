package dev.practice.deliveryhero.arrays.p40;

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
class MinMaxTest {
    private final MinMax sut = new MinMax();
    @Test
    void mixed() throws Exception {
        assertEquals(new MinMax.Bounds(-2,9),sut.find(new int[]{4,-2,9,0}));
    }

    @Test
    void single() throws Exception {
        assertEquals(new MinMax.Bounds(7,7),sut.find(new int[]{7}));
    }

    @Test
    void negative() throws Exception {
        assertEquals(new MinMax.Bounds(-9,-1),sut.find(new int[]{-1,-9,-3}));
    }

    @Test
    void extremes() throws Exception {
        assertEquals(new MinMax.Bounds(Integer.MIN_VALUE,Integer.MAX_VALUE),sut.find(new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE}));
    }

    @Test
    void unchanged() throws Exception {
        int[] a={2,1};sut.find(a);assertArrayEquals(new int[]{2,1},a);
    }
}
