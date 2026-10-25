package dev.practice.dsa.bits;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Tag("practice")
@Timeout(5)
class CountingBitsTest {

  private final CountingBits sut = new CountingBits();

  @Test
  void case1() {
    assertArrayEquals(new int[]{0}, sut.count(0));
  }

  @Test
  void case2() {
    assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, sut.count(5));
  }

  @Test
  void case3() {
    assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1}, sut.count(8));
  }
}
