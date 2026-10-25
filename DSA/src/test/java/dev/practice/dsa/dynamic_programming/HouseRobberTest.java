package dev.practice.dsa.dynamic_programming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Tag("practice")
@Timeout(5)
class HouseRobberTest {

  private final HouseRobber sut = new HouseRobber();

  @Test
  void case1() {
    assertEquals(12L, sut.maximum(new int[]{2, 7, 9, 3, 1}));
  }

  @Test
  void case2() {
    assertEquals(0L, sut.maximum(new int[]{}));
  }

  @Test
  void case3() {
    assertEquals(5L, sut.maximum(new int[]{5}));
  }

  @Test
  void case4() {
    assertEquals(4294967294L, sut.maximum(new int[]{Integer.MAX_VALUE, 0, Integer.MAX_VALUE}));
  }
}
