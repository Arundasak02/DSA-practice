package dev.practice.patterns.behavioural;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * COMMAND — turn an operation into an object that can be stored and executed later.
 * Append is a command; StringBuilder is the receiver; History is the invoker.
 * Commands here run once, with undo in reverse order; no edits occur outside History.
 * Tradeoff: command objects add machinery; a lambda is enough if history is unnecessary.
 * Try: add a Delete command while keeping History unchanged.
 */
public class CommandExample {

  public static void main(String[] args) {
    StringBuilder text = new StringBuilder("buy");
    History history = new History();
    history.run(new Append(text, " ACME"));
    history.undo();
    System.out.println(text);
  }

  interface Command {

    void execute();

    void undo();
  }

  static class Append implements Command {

    private final StringBuilder text;
    private final String value;
    private int previousLength;

    Append(StringBuilder text, String value) {
      this.text = text;
      this.value = value;
    }

    public void execute() {
      previousLength = text.length();
      text.append(value);
    }

    public void undo() {
      text.setLength(previousLength);
    }
  }

  static class History {

    private final Deque<Command> done = new ArrayDeque<>();

    void run(Command command) {
      command.execute();
      done.push(command);
    }

    void undo() {
      if (!done.isEmpty()) {
        done.pop().undo();
      }
    }
  }
  // Output: buy
}
