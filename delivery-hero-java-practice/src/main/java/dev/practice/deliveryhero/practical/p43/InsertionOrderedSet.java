package dev.practice.deliveryhero.practical.p43;

import java.util.*;
import java.util.concurrent.*;
import java.math.*;

/*
 * P43 — Design a set with insertion order and stack-like pop | 45 minutes
 * Evidence: Reported · foodpanda principal engineer.
 *
 * Implement a set of ints. push(x) inserts only if absent; pushing a duplicate does not change order.
 * pop() removes the most recently inserted remaining value, returning OptionalInt.empty() when empty.
 * remove(x) returns whether x existed. values() returns a snapshot Set; orderedValues() returns an
 * insertion-order snapshot List. intersect(other) returns a new independent set with common values in
 * this object's insertion order; neither operand changes. Removing then re-adding a value makes it
 * most recent. Up to 100,000 operations; single-threaded. No null values. The report emphasizes
 * readable, extensible, testable code; duplicate and intersection-order rules are practice choices.
 *
 * Inputs/elements are non-null unless stated. Do not mutate inputs unless allowed. Edge rules and
 * tests are practice specifications.
 *
 * Example: push(4), push(7), push(4), pop() returns 7.
 * Target: Prefer expected O(1) push/remove/pop and linear snapshots/intersection; first prioritize
 * coherent contracts and clean tests.
 *
 * Run: ./mvnw -Dtest=InsertionOrderedSetTest test
 * Source S13: https://leetcode.com/discuss/post/2505626/Define-a-Set-data-structure-that-supports-given-features-or-Principal-Engineer-Interviewor/
 */
public class InsertionOrderedSet {

    public void push(int value) {
        throw new UnsupportedOperationException("TODO P43: implement your solution");
    }

    public OptionalInt pop() {
        throw new UnsupportedOperationException("TODO P43: implement your solution");
    }

    public boolean remove(int value) {
        throw new UnsupportedOperationException("TODO P43: implement your solution");
    }

    public Set<Integer> values() {
        throw new UnsupportedOperationException("TODO P43: implement your solution");
    }

    public List<Integer> orderedValues() {
        throw new UnsupportedOperationException("TODO P43: implement your solution");
    }

    public InsertionOrderedSet intersect(InsertionOrderedSet other) {
        throw new UnsupportedOperationException("TODO P43: implement your solution");
    }
}
