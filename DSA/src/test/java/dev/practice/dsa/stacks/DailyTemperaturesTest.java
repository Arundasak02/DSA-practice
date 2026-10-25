package dev.practice.dsa.stacks;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Tag("practice")
@Timeout(5)
class DailyTemperaturesTest {

  private final DailyTemperatures sut = new DailyTemperatures();

  @Test
  void case1() {
    assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0},
        sut.waits(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
  }

  @Test
  void case2() {
    assertArrayEquals(new int[]{0, 0, 0}, sut.waits(new int[]{3, 2, 1}));
  }

  @Test
  void case3() {
    assertArrayEquals(new int[]{2, 1, 0}, sut.waits(new int[]{2, 2, 3}));
  }

  @Test
  void case4() {
    assertArrayEquals(new int[]{}, sut.waits(new int[]{}));
  }
}
