package dev.practice.dsa.sliding_window;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Tag("practice")
@Tag("sliding_window")
@Timeout(10)
class LongestUniqueSubstringTest {

  private final LongestUniqueSubstring sut = new LongestUniqueSubstring();

  @Test
  void normal() throws Exception {
    assertEquals(3, sut.length("abcabcbb"));
  }

  @Test
  void same() throws Exception {
    assertEquals(1, sut.length("bbbb"));
  }

  @Test
  void empty() throws Exception {
    assertEquals(0, sut.length(""));
  }

  @Test
  void leftBoundary() throws Exception {
    assertEquals(2, sut.length("abba"));
  }

  @Test
  void spaces() throws Exception {
    assertEquals(3, sut.length("a b a"));
  }

  @Test
  void allUnique() throws Exception {
    assertEquals(6, sut.length("abcdef"));
  }
}
