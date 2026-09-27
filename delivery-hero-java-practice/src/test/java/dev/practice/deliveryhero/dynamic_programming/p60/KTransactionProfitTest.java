package dev.practice.deliveryhero.dynamic_programming.p60;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("dynamic_programming")
@Timeout(10)
class KTransactionProfitTest {
    private final KTransactionProfit sut = new KTransactionProfit();
    @Test
    void twoTrades() throws Exception {
        assertEquals(7L,sut.maximum(new int[]{3,2,6,5,0,3},2));
    }

    @Test
    void oneTrade() throws Exception {
        assertEquals(4L,sut.maximum(new int[]{3,2,6,5,0,3},1));
    }

    @Test
    void zero() throws Exception {
        assertEquals(0L,sut.maximum(new int[]{1,5},0));
    }

    @Test
    void unlimitedEquivalent() throws Exception {
        assertEquals(4L,sut.maximum(new int[]{1,3,2,4},1000));
    }

    @Test
    void falling() throws Exception {
        assertEquals(0L,sut.maximum(new int[]{5,4,3},2));
    }

    @Test
    void largeProfit() throws Exception {
        assertEquals(4294967294L,sut.maximum(new int[]{0,Integer.MAX_VALUE,0,Integer.MAX_VALUE},2));
    }

    @Test
    void empty() throws Exception {
        assertEquals(0L,sut.maximum(new int[0],2));
    }
}
