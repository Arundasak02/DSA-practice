package dev.practice.dsa.backtracking;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

@Tag("practice")
@Timeout(5)
class WordSearchTest {
    private final WordSearch sut = new WordSearch();
    @Test void case1() { assertTrue(sut.exists(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCCED")); }
    @Test void case2() { assertFalse(sut.exists(new char[][]{{'A','B'}},"ABA")); }
    @Test void case3() { assertFalse(sut.exists(new char[0][0],"A")); assertTrue(sut.exists(new char[0][0],"")); }
    @Test void case4() { char[][] b={{'A','B'},{'C','D'}}; assertFalse(sut.exists(b,"AD")); assertTrue(sut.exists(b,"ABD")); assertArrayEquals(new char[]{'A','B'},b[0]); assertArrayEquals(new char[]{'C','D'},b[1]); }
}
