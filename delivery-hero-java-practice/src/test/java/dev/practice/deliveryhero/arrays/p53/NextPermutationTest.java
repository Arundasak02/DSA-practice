package dev.practice.deliveryhero.arrays.p53;

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
class NextPermutationTest {
    private final NextPermutation sut = new NextPermutation();
    @Test
    void ascending() throws Exception {
        int[] a={1,2,3};sut.next(a);assertArrayEquals(new int[]{1,3,2},a);
    }

    @Test
    void descending() throws Exception {
        int[] a={3,2,1};sut.next(a);assertArrayEquals(new int[]{1,2,3},a);
    }

    @Test
    void duplicate() throws Exception {
        int[] a={1,1,5};sut.next(a);assertArrayEquals(new int[]{1,5,1},a);
    }

    @Test
    void suffix() throws Exception {
        int[] a={1,3,2};sut.next(a);assertArrayEquals(new int[]{2,1,3},a);
    }

    @Test
    void empty() throws Exception {
        int[] a={};sut.next(a);assertArrayEquals(new int[0],a);
    }

    @Test
    void extremes() throws Exception {
        int[] a={Integer.MAX_VALUE,Integer.MIN_VALUE};sut.next(a);assertArrayEquals(new int[]{Integer.MIN_VALUE,Integer.MAX_VALUE},a);
    }
}
