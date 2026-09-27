package dev.practice.deliveryhero.arrays.p33;

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
class SingleTradeProfitTest {
    private final SingleTradeProfit sut = new SingleTradeProfit();
    @Test
    void normal() throws Exception {
        assertEquals(5L,sut.maximum(new int[]{7,1,5,3,6,4}));
    }

    @Test
    void falling() throws Exception {
        assertEquals(0L,sut.maximum(new int[]{7,6,4,3,1}));
    }

    @Test
    void single() throws Exception {
        assertEquals(0L,sut.maximum(new int[]{7}));
    }

    @Test
    void empty() throws Exception {
        assertEquals(0L,sut.maximum(new int[0]));
    }

    @Test
    void orderMatters() throws Exception {
        assertEquals(1L,sut.maximum(new int[]{9,1,2}));
    }

    @Test
    void max() throws Exception {
        assertEquals(2147483647L,sut.maximum(new int[]{0,Integer.MAX_VALUE}));
    }
}
