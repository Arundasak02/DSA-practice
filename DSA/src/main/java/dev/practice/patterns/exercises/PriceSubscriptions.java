package dev.practice.patterns.exercises;

import java.util.*;
import java.util.function.*;

/*
 * DP06 — Market-price subscriptions | 45 minutes
 * Patterns to practise: Observer
 * create() returns an independent synchronous Hub. subscribe(id, listener) inserts in order;
 * replacing an existing id keeps its position. unsubscribe of an absent id is a no-op.
 * publish takes a snapshot of listeners at its start and invokes each once in order.
 * Subscriptions changed during callbacks affect only later publications.
 * Continue after a listener throws RuntimeException; return failed listener IDs in order.
 * Inputs non-null. No recursion, concurrency or durable delivery required.
 * Design: inject callbacks, avoid global singleton state, explain lifecycle/unsubscribe ownership.
 * Follow-up: discuss slow consumers, per-symbol subscriptions and asynchronous delivery.
 *
 * General interview-style practice; contract/tests are authored, not an exact company question.
 * Run: ./mvnw -Dtest=PriceSubscriptionsTest test
 * References: docs/DESIGN_PATTERNS.md#sources-and-evidence
 */
public class PriceSubscriptions {
    public record Tick(String symbol, long cents) {}
    public interface Hub {
        void subscribe(String id, Consumer<Tick> listener);
        void unsubscribe(String id);
        List<String> publish(Tick tick);
    }
    public static Hub create() { throw new UnsupportedOperationException("TODO DP06"); }
}
