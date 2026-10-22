package dev.practice.dsa.two_pointers;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

@Tag("practice")
@Timeout(5)
class ThreeSumTest {
    private final ThreeSum sut = new ThreeSum();
    @Test void case1() { assertEquals(List.of(List.of(-1,-1,2),List.of(-1,0,1)),sut.find(new int[]{-1,0,1,2,-1,-4})); }
    @Test void case2() { assertEquals(List.of(List.of(0,0,0)),sut.find(new int[]{0,0,0,0})); }
    @Test void case3() { assertEquals(List.of(),sut.find(new int[]{1,2})); }
    @Test void case4() { assertEquals(List.of(),sut.find(new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE,2})); }
}
