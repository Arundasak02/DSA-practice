package dev.practice.dsa.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Tag("focus")
@Timeout(10)
class RunCompressionTest {

  private final RunCompression sut = new RunCompression();

  @Test
  void runs() {
    assertEquals("a3b2c1", sut.encode("aaabbc"));
  }

  @Test
  void separateRuns() {
    assertEquals("a1b2a1", sut.encode("abba"));
  }

  @Test
  void emptyAndLong() {
    assertEquals("", sut.encode(""));
    assertEquals("z12", sut.encode("zzzzzzzzzzzz"));
  }
}
