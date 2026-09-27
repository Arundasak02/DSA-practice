package dev.practice.deliveryhero.backtracking.p31;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("backtracking")
@Timeout(10)
class WordSearchTest {
    private final WordSearch sut = new WordSearch();
    @Test
    void found() throws Exception {
        assertTrue(sut.exists(new char[][]{"ABCE".toCharArray(),"SFCS".toCharArray(),"ADEE".toCharArray()},"ABCCED"));
    }

    @Test
    void reuseForbidden() throws Exception {
        assertFalse(sut.exists(new char[][]{{'A','B'}},"ABA"));
    }

    @Test
    void emptyWord() throws Exception {
        assertTrue(sut.exists(new char[0][],""));
    }

    @Test
    void emptyBoard() throws Exception {
        assertFalse(sut.exists(new char[0][],"A"));
    }

    @Test
    void diagonal() throws Exception {
        assertFalse(sut.exists(new char[][]{{'A','X'},{'X','B'}},"AB"));
    }

    @Test
    void restored() throws Exception {
        char[][] b={{'A','B'},{'C','D'}};assertTrue(sut.exists(b,"ABD"));assertArrayEquals(new char[][]{{'A','B'},{'C','D'}},b);
    }
}
