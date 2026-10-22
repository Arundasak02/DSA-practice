package dev.practice.dsa.backtracking;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

@Tag("practice")
@Timeout(5)
class SubsetsTest {
    private final Subsets sut = new Subsets();
    @Test void case1() { var out=sut.generate(new int[]{1,2}); assertEquals(4,out.size()); assertEquals(Set.of(List.of(),List.of(1),List.of(2),List.of(1,2)),new HashSet<>(out)); }
    @Test void case2() { assertEquals(List.of(List.of()),sut.generate(new int[]{})); }
    @Test void case3() { var out=sut.generate(new int[]{3,1,2}); assertEquals(8,out.size()); assertEquals(8,new HashSet<>(out).size()); assertTrue(out.contains(List.of(3,1,2))); }
}
