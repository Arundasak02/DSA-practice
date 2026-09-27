package dev.practice.deliveryhero.graphs.p56;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("graphs")
@Timeout(10)
class WeightedShortestPathTest {
    private final WeightedShortestPath sut = new WeightedShortestPath();
    @Test
    void indirectCheaper() throws Exception {
        assertEquals(5L,sut.distance(3,new int[][]{{0,2,10},{0,1,2},{1,2,3}},0,2));
    }

    @Test
    void directed() throws Exception {
        assertEquals(-1L,sut.distance(2,new int[][]{{0,1,2}},1,0));
    }

    @Test
    void zeroWeight() throws Exception {
        assertEquals(0L,sut.distance(3,new int[][]{{0,1,0},{1,2,0}},0,2));
    }

    @Test
    void largeTotal() throws Exception {
        assertEquals(4294967294L,sut.distance(3,new int[][]{{0,1,Integer.MAX_VALUE},{1,2,Integer.MAX_VALUE}},0,2));
    }

    @Test
    void parallelAndStale() throws Exception {
        assertEquals(3L,sut.distance(4,new int[][]{{0,1,10},{0,2,1},{2,1,1},{1,3,1},{0,1,20}},0,3));
    }

    @Test
    void same() throws Exception {
        assertEquals(0L,sut.distance(1,new int[0][],0,0));
    }
}
