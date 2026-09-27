package dev.practice.deliveryhero.dynamic_programming.p30;

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
class CoinChangeTest {
    private final CoinChange sut = new CoinChange();
    @Test
    void normal() throws Exception {
        assertEquals(3,sut.minimum(new int[]{1,2,5},11));
    }

    @Test
    void impossible() throws Exception {
        assertEquals(-1,sut.minimum(new int[]{2},3));
    }

    @Test
    void zero() throws Exception {
        assertEquals(0,sut.minimum(new int[]{2},0));
    }

    @Test
    void greedyTrap() throws Exception {
        assertEquals(2,sut.minimum(new int[]{1,3,4},6));
    }

    @Test
    void empty() throws Exception {
        assertEquals(-1,sut.minimum(new int[0],7));
    }

    @Test
    void largeCoin() throws Exception {
        assertEquals(-1,sut.minimum(new int[]{100},3));
    }
}
