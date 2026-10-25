package dev.practice.dsa.strings;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Tag("focus")
@Timeout(10)
class PalindromeTest {

  private final Palindrome sut = new Palindrome();

  @Test
  void trueCases() {
    assertTrue(sut.check("A man, a plan, a canal: Panama"));
    assertTrue(sut.check("abba"));
  }

  @Test
  void falseCases() {
    assertFalse(sut.check("race a car"));
    assertFalse(sut.check("0P"));
  }

  @Test
  void empty() {
    assertTrue(sut.check(""));
    assertTrue(sut.check("!!!"));
  }
}
