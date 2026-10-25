package dev.practice.dsa.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.OptionalInt;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Tag("focus")
@Timeout(10)
class FirstUniqueTest {

  private final FirstUnique sut = new FirstUnique();

  @Test
  void first() {
    assertEquals(OptionalInt.of(119), sut.find("swiss"));
  }

  @Test
  void none() {
    assertEquals(OptionalInt.empty(), sut.find("aabb"));
    assertEquals(OptionalInt.empty(), sut.find(""));
  }

  @Test
  void supplementary() {
    assertEquals(OptionalInt.of(0x1F600), sut.find("😀aabb"));
  }

  @Test
  void caseAndOrder() {
    assertEquals(OptionalInt.of(65), sut.find("aAbbac"));
  }
}
