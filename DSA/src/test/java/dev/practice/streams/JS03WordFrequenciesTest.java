package dev.practice.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Tag("focus")
@Timeout(10)
class JS03WordFrequenciesTest {

  private final JS03WordFrequencies sut = new JS03WordFrequencies();

  @Test
  void counts() {
    assertEquals(Map.of("tea", 2L, "cake", 1L), sut.count(List.of("tea", "cake", "tea")));
  }

  @Test
  void order() {
    assertEquals(List.of("z", "a", "m"),
        new ArrayList<>(sut.count(List.of("z", "a", "z", "m")).keySet()));
  }

  @Test
  void empty() {
    assertEquals(Map.of(), sut.count(List.of()));
  }
}
