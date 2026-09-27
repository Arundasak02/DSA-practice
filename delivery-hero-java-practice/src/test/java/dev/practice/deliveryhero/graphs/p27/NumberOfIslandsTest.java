package dev.practice.deliveryhero.graphs.p27;

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
class NumberOfIslandsTest {
    private final NumberOfIslands sut = new NumberOfIslands();
    @Test
    void multiple() throws Exception {
        assertEquals(3,sut.count(new char[][]{"11000".toCharArray(),"11000".toCharArray(),"00100".toCharArray(),"00011".toCharArray()}));
    }

    @Test
    void diagonal() throws Exception {
        assertEquals(2,sut.count(new char[][]{{'1','0'},{'0','1'}}));
    }

    @Test
    void water() throws Exception {
        assertEquals(0,sut.count(new char[][]{{'0','0'}}));
    }

    @Test
    void empty() throws Exception {
        assertEquals(0,sut.count(new char[0][]));assertEquals(0,sut.count(new char[][]{{}}));
    }

    @Test
    void unchanged() throws Exception {
        char[][] g={{'1','1'}};assertEquals(1,sut.count(g));assertArrayEquals(new char[]{'1','1'},g[0]);
    }

    @Test
    void longIsland() throws Exception {
        char[][] g=new char[1][100000];Arrays.fill(g[0],'1');assertEquals(1,sut.count(g));
    }
}
