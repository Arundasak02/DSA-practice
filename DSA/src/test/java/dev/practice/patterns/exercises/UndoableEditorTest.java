package dev.practice.patterns.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Tag("practice")
@Tag("design-patterns")
@Timeout(5)
class UndoableEditorTest {

  @Test
  void undoRedoSequence() {
    var e = UndoableEditor.create();
    e.append("abc");
    e.deleteLast(1);
    assertEquals("ab", e.text());
    assertTrue(e.undo());
    assertEquals("abc", e.text());
    assertTrue(e.undo());
    assertEquals("", e.text());
    assertTrue(e.redo());
    assertEquals("abc", e.text());
    assertTrue(e.redo());
    assertEquals("ab", e.text());
  }

  @Test
  void emptyHistory() {
    var e = UndoableEditor.create();
    assertFalse(e.undo());
    assertFalse(e.redo());
    assertEquals("", e.text());
  }

  @Test
  void newEditClearsRedo() {
    var e = UndoableEditor.create();
    e.append("a");
    e.undo();
    e.append("b");
    assertFalse(e.redo());
    assertEquals("b", e.text());
  }

  @Test
  void invalidEditPreservesHistory() {
    var e = UndoableEditor.create();
    e.append("a");
    e.undo();
    assertThrows(IllegalArgumentException.class, () -> e.deleteLast(1));
    assertThrows(IllegalArgumentException.class, () -> e.deleteLast(-1));
    assertTrue(e.redo());
    assertEquals("a", e.text());
  }

  @Test
  void zeroLengthEditCounts() {
    var e = UndoableEditor.create();
    e.append("a");
    e.append("");
    e.deleteLast(0);
    assertTrue(e.undo());
    assertEquals("a", e.text());
    assertTrue(e.undo());
    assertEquals("a", e.text());
    assertTrue(e.undo());
    assertEquals("", e.text());
  }
}
