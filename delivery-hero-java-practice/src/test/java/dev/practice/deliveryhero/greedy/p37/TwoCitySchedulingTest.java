package dev.practice.deliveryhero.greedy.p37;

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
class TwoCitySchedulingTest {
    private final TwoCityScheduling sut = new TwoCityScheduling();
    @Test
    void normal() throws Exception {
        assertEquals(110L,sut.minimum(new int[][]{{10,20},{30,200},{400,50},{30,20}}));
    }

    @Test
    void two() throws Exception {
        assertEquals(3L,sut.minimum(new int[][]{{1,100},{100,2}}));
    }

    @Test
    void ties() throws Exception {
        assertEquals(20L,sut.minimum(new int[][]{{10,10},{10,10}}));
    }

    @Test
    void empty() throws Exception {
        assertEquals(0L,sut.minimum(new int[0][]));
    }

    @Test
    void longTotal() throws Exception {
        assertEquals(4000000000L,sut.minimum(new int[][]{{1000000000,1000000000},{1000000000,1000000000},{1000000000,1000000000},{1000000000,1000000000}}));
    }
}
