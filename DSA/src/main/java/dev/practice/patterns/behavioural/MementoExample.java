package dev.practice.patterns.behavioural;

import java.util.*;

/*
 * MEMENTO — save and restore state without the caretaker interpreting its contents.
 * Editor is the originator; private Snapshot holds state; History is the caretaker.
 * History stores snapshots without inspecting their contents; String makes snapshots immutable.
 * Tradeoff: snapshots can be expensive for large state; consider deltas.
 * Try: store cursor position in the snapshot too.
 */
public class MementoExample {
    static class Editor {
        private String text = "";
        private record Snapshot(String text) {}
        void type(String text) { this.text = text; }
        String text() { return text; }
        private Snapshot save() { return new Snapshot(text); }
        private void restore(Snapshot snapshot) { text = snapshot.text(); }
    }
    static class History {
        private final Editor editor;
        private final Deque<Editor.Snapshot> snapshots = new ArrayDeque<>();
        History(Editor editor) { this.editor = editor; }
        void checkpoint() { snapshots.push(editor.save()); }
        void undo() { if (!snapshots.isEmpty()) editor.restore(snapshots.pop()); }
    }
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History(editor);
        editor.type("draft"); history.checkpoint(); editor.type("changed"); history.undo();
        System.out.println(editor.text());
    }
    // Output: draft
}
