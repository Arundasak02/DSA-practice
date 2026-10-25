package dev.practice.dsa.binary_search;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Tag("practice")
@Timeout(5)
class SearchRotatedTest {

  private final SearchRotated sut = new SearchRotated();

  @Test
  void case1() {
    assertEquals(4, sut.find(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
  }

  @Test
  void case2() {
    assertEquals(-1, sut.find(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
  }

  @Test
  void case3() {
    assertEquals(-1, sut.find(new int[]{}, 1));
  }

  @Test
  void case4() {
    assertEquals(0, sut.find(new int[]{1}, 1));
  }

  @Test
  void case5() {
    assertEquals(2, sut.find(new int[]{1, 2, 3}, 3));
  }
}
