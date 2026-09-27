package dev.practice.deliveryhero.greedy.p54;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("greedy")
@Timeout(10)
class MinimumJumpsTest {
    private final MinimumJumps sut = new MinimumJumps();
    @Test
    void normal() throws Exception {
        assertEquals(2,sut.minimum(new int[]{2,3,1,1,4}));
    }

    @Test
    void unreachable() throws Exception {
        assertEquals(-1,sut.minimum(new int[]{3,2,1,0,4}));
    }

    @Test
    void zeroStart() throws Exception {
        assertEquals(-1,sut.minimum(new int[]{0,1}));
    }

    @Test
    void single() throws Exception {
        assertEquals(0,sut.minimum(new int[]{0}));
    }

    @Test
    void empty() throws Exception {
        assertEquals(-1,sut.minimum(new int[0]));
    }

    @Test
    void hugeJump() throws Exception {
        assertEquals(1,sut.minimum(new int[]{Integer.MAX_VALUE,0,0}));
    }
}
