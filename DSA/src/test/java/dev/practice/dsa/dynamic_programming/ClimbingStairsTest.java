package dev.practice.dsa.dynamic_programming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Tag("practice")
@Timeout(5)
class ClimbingStairsTest {

  private final ClimbingStairs sut = new ClimbingStairs();

  @Test
  void case1() {
    assertEquals(1L, sut.count(0));
  }

  @Test
  void case2() {
    assertEquals(2L, sut.count(2));
  }

  @Test
  void case3() {
    assertEquals(8L, sut.count(5));
  }

  @Test
  void case4() {
    assertEquals(2971215073L, sut.count(46));
  }
}
