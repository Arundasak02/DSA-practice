package dev.practice.dsa.bits;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

@Tag("practice")
@Timeout(5)
class CountingBitsTest {
    private final CountingBits sut = new CountingBits();
    @Test void case1() { assertArrayEquals(new int[]{0},sut.count(0)); }
    @Test void case2() { assertArrayEquals(new int[]{0,1,1,2,1,2},sut.count(5)); }
    @Test void case3() { assertArrayEquals(new int[]{0,1,1,2,1,2,2,3,1},sut.count(8)); }
}
