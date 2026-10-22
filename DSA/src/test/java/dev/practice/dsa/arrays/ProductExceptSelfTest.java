package dev.practice.dsa.arrays;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

@Tag("practice")
@Timeout(5)
class ProductExceptSelfTest {
    private final ProductExceptSelf sut = new ProductExceptSelf();
    @Test void case1() { assertArrayEquals(new long[]{24,12,8,6},sut.products(new int[]{1,2,3,4})); }
    @Test void case2() { assertArrayEquals(new long[]{0,0,8,0},sut.products(new int[]{1,2,0,4})); }
    @Test void case3() { assertArrayEquals(new long[]{0,0,0},sut.products(new int[]{0,2,0})); }
    @Test void case4() { assertArrayEquals(new long[]{-6,3,-2},sut.products(new int[]{-1,2,-3})); }
}
