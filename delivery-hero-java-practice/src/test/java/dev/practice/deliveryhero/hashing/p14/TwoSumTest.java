package dev.practice.deliveryhero.hashing.p14;

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
class TwoSumTest {
    private final TwoSum sut = new TwoSum();
    @Test
    void normal() throws Exception {
        assertArrayEquals(new int[]{0,1},sut.find(new int[]{2,7,11,15},9));
    }

    @Test
    void duplicates() throws Exception {
        assertArrayEquals(new int[]{0,1},sut.find(new int[]{3,3},6));
    }

    @Test
    void negative() throws Exception {
        assertArrayEquals(new int[]{0,2},sut.find(new int[]{-5,8,2},-3));
    }

    @Test
    void zeros() throws Exception {
        assertArrayEquals(new int[]{0,1},sut.find(new int[]{0,0,3},0));
    }

    @Test
    void overflow() throws Exception {
        assertArrayEquals(new int[]{0,1},sut.find(new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE},4294967294L));
    }
}
