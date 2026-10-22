package dev.practice.dsa.two_pointers;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

@Tag("practice")
@Timeout(5)
class ContainerWaterTest {
    private final ContainerWater sut = new ContainerWater();
    @Test void case1() { assertEquals(49L,sut.maximum(new int[]{1,8,6,2,5,4,8,3,7})); }
    @Test void case2() { assertEquals(0L,sut.maximum(new int[]{})); }
    @Test void case3() { assertEquals(0L,sut.maximum(new int[]{0,0})); }
    @Test void case4() { assertEquals(4294967294L,sut.maximum(new int[]{Integer.MAX_VALUE,0,Integer.MAX_VALUE})); }
}
