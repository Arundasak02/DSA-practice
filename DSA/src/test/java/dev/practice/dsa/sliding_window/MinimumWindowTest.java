package dev.practice.dsa.sliding_window;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

@Tag("practice")
@Timeout(5)
class MinimumWindowTest {
    private final MinimumWindow sut = new MinimumWindow();
    @Test void case1() { assertEquals("BANC",sut.find("ADOBECODEBANC","ABC")); }
    @Test void case2() { assertEquals("aa",sut.find("baa","aa")); }
    @Test void case3() { assertEquals("",sut.find("a","aa")); }
    @Test void case4() { assertEquals("",sut.find("abc","")); }
    @Test void case5() { assertEquals("ab",sut.find("abxba","ab")); }
}
