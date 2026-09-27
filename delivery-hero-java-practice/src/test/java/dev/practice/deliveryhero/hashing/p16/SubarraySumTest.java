package dev.practice.deliveryhero.hashing.p16;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("hashing")
@Timeout(10)
class SubarraySumTest {
    private final SubarraySum sut = new SubarraySum();
    @Test
    void normal() throws Exception {
        assertEquals(2L,sut.count(new int[]{1,1,1},2));
    }

    @Test
    void negative() throws Exception {
        assertEquals(3L,sut.count(new int[]{1,-1,0},0));
    }

    @Test
    void zero() throws Exception {
        assertEquals(6L,sut.count(new int[]{0,0,0},0));
    }

    @Test
    void empty() throws Exception {
        assertEquals(0L,sut.count(new int[0],0));
    }

    @Test
    void largeCount() throws Exception {
        assertEquals(5000050000L,sut.count(new int[100000],0));
    }

    @Test
    void largeSum() throws Exception {
        assertEquals(1L,sut.count(new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE},4294967294L));
    }
}
