package dev.practice.dsa.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Tag("focus")
@Timeout(10)
class AnagramGroupsTest {

  private final AnagramGroups sut = new AnagramGroups();

  @Test
  void groups() {
    assertEquals(List.of(List.of("eat", "tea", "ate"), List.of("tan", "nat"), List.of("bat")),
        sut.group(List.of("eat", "tea", "tan", "ate", "nat", "bat")));
  }

  @Test
  void duplicates() {
    assertEquals(List.of(List.of("ab", "ab", "ba")), sut.group(List.of("ab", "ab", "ba")));
  }

  @Test
  void empty() {
    assertEquals(List.of(), sut.group(List.of()));
    assertEquals(List.of(List.of("", "")), sut.group(List.of("", "")));
  }
}
