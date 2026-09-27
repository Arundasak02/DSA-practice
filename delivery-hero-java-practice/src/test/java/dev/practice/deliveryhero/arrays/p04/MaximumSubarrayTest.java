package dev.practice.deliveryhero.arrays.p04;

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
class MaximumSubarrayTest {
    private final MaximumSubarray sut = new MaximumSubarray();
    @Test
    void mixed() throws Exception {
        assertEquals(6L, sut.maxSum(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    @Test
    void negative() throws Exception {
        assertEquals(-2L, sut.maxSum(new int[]{-8,-2,-5}));
    }

    @Test
    void single() throws Exception {
        assertEquals(7L, sut.maxSum(new int[]{7}));
    }

    @Test
    void zeros() throws Exception {
        assertEquals(0L, sut.maxSum(new int[]{0,0,0}));
    }

    @Test
    void overflow() throws Exception {
        assertEquals(4294967294L, sut.maxSum(new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE}));
    }
}
