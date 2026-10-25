package dev.practice.dsa.hashing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Tag("practice")
@Timeout(5)
class LongestConsecutiveTest {

  private final LongestConsecutive sut = new LongestConsecutive();

  @Test
  void case1() {
    assertEquals(4, sut.length(new int[]{100, 4, 200, 1, 3, 2, 2}));
  }

  @Test
  void case2() {
    assertEquals(0, sut.length(new int[]{}));
  }

  @Test
  void case3() {
    assertEquals(3, sut.length(new int[]{-1, 0, 1}));
  }

  @Test
  void case4() {
    assertEquals(1, sut.length(new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE}));
  }
}
