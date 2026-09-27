package dev.practice.deliveryhero.graphs.p38;

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
class ShortestUnweightedPathTest {
    private final ShortestUnweightedPath sut = new ShortestUnweightedPath();
    @Test
    void shortest() throws Exception {
        assertEquals(1,sut.distance(4,new int[][]{{0,1},{1,2},{2,3},{0,3}},0,3));
    }

    @Test
    void chain() throws Exception {
        assertEquals(3,sut.distance(4,new int[][]{{0,1},{1,2},{2,3}},0,3));
    }

    @Test
    void unreachable() throws Exception {
        assertEquals(-1,sut.distance(3,new int[][]{{0,1}},0,2));
    }

    @Test
    void same() throws Exception {
        assertEquals(0,sut.distance(1,new int[0][],0,0));
    }

    @Test
    void cycle() throws Exception {
        assertEquals(2,sut.distance(4,new int[][]{{0,1},{1,2},{2,0},{2,3}},0,3));
    }

    @Test
    void duplicates() throws Exception {
        assertEquals(1,sut.distance(2,new int[][]{{0,0},{0,1},{0,1}},1,0));
    }
}
