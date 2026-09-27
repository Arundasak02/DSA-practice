package dev.practice.deliveryhero.arrays.p07;

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
class ChunkSortTest {
    private final ChunkSort sut = new ChunkSort();
    @Test
    void chunks() throws Exception {
        assertArrayEquals(new int[]{1,3,2,4,0},sut.sort(new int[]{3,1,4,2,0},2));
    }

    @Test
    void tail() throws Exception {
        assertArrayEquals(new int[]{2,3,4,0,1},sut.sort(new int[]{4,3,2,1,0},3));
    }

    @Test
    void largeK() throws Exception {
        assertArrayEquals(new int[]{1,2,3},sut.sort(new int[]{3,1,2},8));
    }

    @Test
    void one() throws Exception {
        assertArrayEquals(new int[]{3,2,1},sut.sort(new int[]{3,2,1},1));
    }

    @Test
    void empty() throws Exception {
        assertArrayEquals(new int[0],sut.sort(new int[0],2));
    }

    @Test
    void copy() throws Exception {
        int[] a={2,1}; int[] b=sut.sort(a,2);assertNotSame(a,b);assertArrayEquals(new int[]{2,1},a);
    }
}
