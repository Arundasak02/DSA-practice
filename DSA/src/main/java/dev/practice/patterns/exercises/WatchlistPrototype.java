package dev.practice.patterns.exercises;

import java.util.*;
import java.util.function.*;

/*
 * DP12 — Copy a configured watchlist safely | 30 minutes
 * Patterns to practise: Prototype
 * copyOf(template) creates a new Watchlist with same name and independent mutable rules list.
 * Every mutable Rule must also be copied; preserve order and values. Changing either copy must not
 * change the other. Empty lists supported. Strings may be shared because they are immutable.
 * Inputs and members non-null. Same Rule appearing twice must produce two independent Rule copies.
 * Design: define copy depth explicitly; do not use serialization or Object.clone for this exercise.
 * Follow-up: contrast prototype copying, Builder construction and sharing immutable values.
 *
 * General interview-style practice; contract/tests are authored, not an exact company question.
 * Run: ./mvnw -Dtest=WatchlistPrototypeTest test
 * References: docs/DESIGN_PATTERNS.md#sources-and-evidence
 */
public class WatchlistPrototype {
    public static class Rule {
        public String symbol;
        public long threshold;
        public Rule(String symbol, long threshold) { this.symbol=symbol; this.threshold=threshold; }
    }
    public static class Watchlist {
        public String name;
        public List<Rule> rules;
        public Watchlist(String name, List<Rule> rules) { this.name=name; this.rules=rules; }
    }
    public static Watchlist copyOf(Watchlist template) { throw new UnsupportedOperationException("TODO DP12"); }
}
