package dev.practice.dsa.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Tag("focus")
@Timeout(10)
class ReverseWordsTest {

  private final ReverseWords sut = new ReverseWords();

  @Test
  void reverse() {
    assertEquals("high sell low buy", sut.reverse("buy low sell high"));
  }

  @Test
  void spaces() {
    assertEquals("low buy", sut.reverse("  buy   low  "));
  }

  @Test
  void empty() {
    assertEquals("", sut.reverse(""));
    assertEquals("", sut.reverse("   "));
    assertEquals("buy", sut.reverse("buy"));
  }
}
