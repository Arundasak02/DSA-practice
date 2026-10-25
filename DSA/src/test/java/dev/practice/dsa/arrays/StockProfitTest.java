package dev.practice.dsa.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Tag("practice")
@Timeout(5)
class StockProfitTest {

  private final StockProfit sut = new StockProfit();

  @Test
  void case1() {
    assertEquals(5L, sut.maximum(new int[]{7, 1, 5, 3, 6, 4}));
  }

  @Test
  void case2() {
    assertEquals(0L, sut.maximum(new int[]{7, 6, 4, 3}));
  }

  @Test
  void case3() {
    assertEquals(0L, sut.maximum(new int[]{}));
  }

  @Test
  void case4() {
    assertEquals(0L, sut.maximum(new int[]{5}));
  }
}
