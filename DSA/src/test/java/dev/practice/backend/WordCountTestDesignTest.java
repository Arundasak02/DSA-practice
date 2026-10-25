package dev.practice.backend;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.ToIntFunction;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Tag("practice")
@Tag("testing")
@Timeout(10)
class WordCountTestDesignTest {

  // YOUR WORK: write assertions here. Both checks below run the same assertions.
  private void assertContract(ToIntFunction<String> counter) {
    fail("TODO P68: replace this with your word-count contract assertions");
  }

  // Assessment harness: leave these checks unchanged.
  @Test
  void contractAcceptsWorkingImplementation() {
    assertContract(WordCountTestDesign.subject());
  }

  @Test
  void contractRejectsFaultyImplementations() {
    for (var fault : faults().entrySet()) {
      assertThrows(AssertionError.class, () -> assertContract(fault.getValue()),
          "Your assertions missed: " + fault.getKey());
    }
  }

  // Read only after your first attempt: deliberately faulty counters, not solutions.
  private Map<String, ToIntFunction<String>> faults() {
    ToIntFunction<String> correct = WordCountTestDesign.subject();
    Map<String, ToIntFunction<String>> faults = new LinkedHashMap<>();
    faults.put("always zero", text -> 0);
    faults.put("at most one word", text -> text == null || text.isEmpty() ? 0 : 1);
    faults.put("splits only on literal spaces",
        text -> text == null || text.isEmpty() ? 0 : text.split(" +").length);
    faults.put("treats punctuation as a separator",
        text -> text == null ? 0 : correct.applyAsInt(text.replaceAll("[.,!?]", " ")));
    faults.put("wrong empty result",
        text -> text != null && text.isEmpty() ? 1 : correct.applyAsInt(text));
    faults.put("wrong null result", text -> text == null ? -1 : correct.applyAsInt(text));
    faults.put("drops final word without trailing whitespace", text -> {
      int result = correct.applyAsInt(text);
      return
          text != null && !text.isEmpty() && !Character.isWhitespace(text.charAt(text.length() - 1))
              ? result - 1 : result;
    });
    return faults;
  }
}
