package dev.practice.deliveryhero.intervals.p17;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("intervals")
@Timeout(10)
class MergeIntervalsTest {
    private final MergeIntervals sut = new MergeIntervals();
    @Test
    void overlap() throws Exception {
        assertArrayEquals(new int[][]{{1,6},{8,10}},sut.merge(new int[][]{{1,3},{2,6},{8,10}}));
    }

    @Test
    void touch() throws Exception {
        assertArrayEquals(new int[][]{{1,4}},sut.merge(new int[][]{{1,2},{2,4}}));
    }

    @Test
    void nested() throws Exception {
        assertArrayEquals(new int[][]{{1,10}},sut.merge(new int[][]{{2,3},{1,10}}));
    }

    @Test
    void empty() throws Exception {
        assertArrayEquals(new int[0][],sut.merge(new int[0][]));
    }

    @Test
    void extremes() throws Exception {
        assertArrayEquals(new int[][]{{Integer.MIN_VALUE,-1},{0,Integer.MAX_VALUE}},sut.merge(new int[][]{{0,Integer.MAX_VALUE},{Integer.MIN_VALUE,-1}}));
    }

    @Test
    void preservesInput() throws Exception {
        int[][] a={{3,4},{1,2}};sut.merge(a);assertArrayEquals(new int[][]{{3,4},{1,2}},a);
    }
}
