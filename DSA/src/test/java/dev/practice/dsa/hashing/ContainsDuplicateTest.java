package dev.practice.dsa.hashing;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

@Tag("practice")
@Timeout(5)
class ContainsDuplicateTest {
    private final ContainsDuplicate sut = new ContainsDuplicate();
    @Test void case1() { assertTrue(sut.contains(new int[]{1,2,1})); }
    @Test void case2() { assertFalse(sut.contains(new int[]{1,2,3})); }
    @Test void case3() { assertFalse(sut.contains(new int[]{})); }
    @Test void case4() { assertTrue(sut.contains(new int[]{Integer.MIN_VALUE,Integer.MIN_VALUE})); }
}
