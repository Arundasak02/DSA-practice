package dev.practice.patterns.exercises;

import java.util.*;
import java.util.function.*;

/*
 * DP07 — Text editor with undo and redo | 60 minutes
 * Patterns to practise: Command + Memento
 * create() returns empty Editor. append(text) and deleteLast(count) execute edit commands.
 * count must be 0..current length, otherwise IllegalArgumentException with no state/history change.
 * Each successful edit, including append("")/deleteLast(0), adds one history entry and clears redo.
 * undo/redo return false when unavailable, otherwise restore prior/next text and return true.
 * Text uses Java UTF-16 char units; inputs non-null, single-threaded, no external modifications.
 * Design: represent edits as commands; snapshots or reversible deltas are acceptable.
 * Follow-up: bound memory and explain why undoing a local edit differs from reversing a payment.
 *
 * General interview-style practice; contract/tests are authored, not an exact company question.
 * Run: ./mvnw -Dtest=UndoableEditorTest test
 * References: docs/DESIGN_PATTERNS.md#sources-and-evidence
 */
public class UndoableEditor {
    public interface Editor { String text(); void append(String text); void deleteLast(int count); boolean undo(); boolean redo(); }
    public static Editor create() { throw new UnsupportedOperationException("TODO DP07"); }
}
