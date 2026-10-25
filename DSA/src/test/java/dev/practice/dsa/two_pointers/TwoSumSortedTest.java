package dev.practice.dsa.two_pointers;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Tag("practice")
@Timeout(5)
class TwoSumSortedTest {

  private final TwoSumSorted sut = new TwoSumSorted();

  @Test
  void case1() {
    assertArrayEquals(new int[]{0, 3}, sut.find(new int[]{1, 2, 4, 8}, 9));
  }

  @Test
  void case2() {
    assertArrayEquals(new int[]{0, 1}, sut.find(new int[]{3, 3}, 6));
  }

  @Test
  void case3() {
    assertArrayEquals(new int[]{0, 2}, sut.find(new int[]{-5, 0, 2}, -3));
  }

  @Test
  void case4() {
    assertArrayEquals(new int[]{0, 1},
        sut.find(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE}, 4294967294L));
  }
}
