package dev.practice.deliveryhero.binary_search.p20;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("binary_search")
@Timeout(10)
class MinimumProcessingRateTest {
    private final MinimumProcessingRate sut = new MinimumProcessingRate();
    @Test
    void normal() throws Exception {
        assertEquals(4,sut.minimumRate(new int[]{3,6,7,11},8));
    }

    @Test
    void tight() throws Exception {
        assertEquals(30,sut.minimumRate(new int[]{30,11,23,4,20},5));
    }

    @Test
    void slack() throws Exception {
        assertEquals(1,sut.minimumRate(new int[]{2,3},10));
    }

    @Test
    void ceil() throws Exception {
        assertEquals(3,sut.minimumRate(new int[]{5},2));
    }

    @Test
    void overflow() throws Exception {
        assertEquals(Integer.MAX_VALUE,sut.minimumRate(new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE},2));
    }
}
