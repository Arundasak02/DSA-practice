package dev.practice.patterns.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Tag("practice")
@Tag("design-patterns")
@Timeout(5)
class ImportWorkflowTest {

  @Test
  void ordersHooksAndSavesOnce() {
    var events = new ArrayList<String>();
    var importer = new ImportWorkflow.Importer() {
      protected String parse(String s) {
        events.add("parse:" + s);
        return s.trim();
      }

      protected void validate(String s) {
        events.add("validate:" + s);
      }

      protected void save(List<String> v) {
        events.add("save:" + v);
        assertThrows(UnsupportedOperationException.class, () -> v.add("x"));
      }
    };
    assertEquals(2, importer.run(List.of(" a ", "b")));
    assertEquals(List.of("parse: a ", "validate:a", "parse:b", "validate:b", "save:[a, b]"),
        events);
  }

  @Test
  void noPartialSaveOnValidationFailure() {
    var calls = new AtomicInteger();
    var i = new ImportWorkflow.Importer() {
      protected String parse(String s) {
        return s.trim();
      }

      protected void save(List<String> v) {
        calls.incrementAndGet();
      }
    };
    assertThrows(IllegalArgumentException.class, () -> i.run(List.of("good", " ")));
    assertEquals(0, calls.get());
  }

  @Test
  void parseFailurePropagates() {
    var failure = new IllegalStateException();
    var i = new ImportWorkflow.Importer() {
      protected String parse(String s) {
        throw failure;
      }

      protected void save(List<String> v) {
        fail("must not save");
      }
    };
    assertSame(failure, assertThrows(IllegalStateException.class, () -> i.run(List.of("x"))));
  }

  @Test
  void emptyStillSaves() {
    var calls = new AtomicInteger();
    var i = new ImportWorkflow.Importer() {
      protected String parse(String s) {
        return s;
      }

      protected void save(List<String> v) {
        assertTrue(v.isEmpty());
        calls.incrementAndGet();
      }
    };
    assertEquals(0, i.run(List.of()));
    assertEquals(1, calls.get());
  }

  @Test
  void snapshotsBeforeHooks() {
    var input = new ArrayList<>(List.of("a", "b"));
    var saved = new ArrayList<String>();
    var i = new ImportWorkflow.Importer() {
      protected String parse(String s) {
        input.clear();
        return s;
      }

      protected void save(List<String> v) {
        saved.addAll(v);
      }
    };
    assertEquals(2, i.run(input));
    assertEquals(List.of("a", "b"), saved);
  }
}
