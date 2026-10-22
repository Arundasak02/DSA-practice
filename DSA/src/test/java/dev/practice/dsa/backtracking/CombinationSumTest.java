package dev.practice.dsa.backtracking;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

@Tag("practice")
@Timeout(5)
class CombinationSumTest {
    private final CombinationSum sut = new CombinationSum();
    @Test void case1() { var out=sut.find(new int[]{2,3,6,7},7); assertEquals(2,out.size()); assertEquals(Set.of(List.of(2,2,3),List.of(7)),new HashSet<>(out)); }
    @Test void case2() { assertEquals(List.of(),sut.find(new int[]{2},3)); }
    @Test void case3() { assertEquals(List.of(List.of()),sut.find(new int[]{2},0)); }
    @Test void case4() { assertEquals(List.of(List.of(2,3)),sut.find(new int[]{3,2},5)); }
}
