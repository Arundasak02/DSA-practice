package dev.practice.patterns.exercises;

import java.util.*;
import java.util.function.*;

/*
 * DP04 — Order lifecycle with valid transitions | 45 minutes
 * Patterns to practise: State
 * create() returns an independent NEW order. pay: NEW->PAID; ship: PAID->SHIPPED.
 * cancel: NEW or PAID -> CANCELLED. Every other action throws IllegalStateException.
 * An invalid action leaves status unchanged; SHIPPED and CANCELLED are terminal.
 * Inputs non-null; single-threaded. Keep the public API; add internal state objects as needed.
 * Design: implement State objects, then compare with an enum transition table.
 * Follow-up: add refund rules without weakening shipping invariants.
 *
 * General interview-style practice; contract/tests are authored, not an exact company question.
 * Run: ./mvnw -Dtest=OrderLifecycleTest test
 * References: docs/DESIGN_PATTERNS.md#sources-and-evidence
 */
public class OrderLifecycle {
    public enum Status { NEW, PAID, SHIPPED, CANCELLED }
    public interface Order { Status status(); void pay(); void ship(); void cancel(); }
    public static Order create() { throw new UnsupportedOperationException("TODO DP04"); }
}
