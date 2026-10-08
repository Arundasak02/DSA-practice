package dev.practice.focus.java_streams;

import java.util.*;

/*
 * JS02 — Second-largest DISTINCT value | 25 minutes
 * Evidence: General Java Stream interview practice; no DH-specific attribution
 *
 * Return OptionalInt for second-largest distinct int; empty for fewer than two distinct values.
 * Negative numbers and extremes allowed.
 *
 * Java Streams: Use Stream API for the main transformation. Be explicit about duplicates and empty
 * Optional; sorting costs O(n log n).
 *
 * Inputs and elements are non-null unless specified. Do not mutate inputs. Unless stated otherwise,
 * size <=100,000. Edge rules and tests are authored practice contracts.
 *
 * Run: ./mvnw -Dtest=JS02SecondLargestTest test
 * Source STREAM: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html
 * Source COLLECT: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Collectors.html
 */
public class JS02SecondLargest {
    public OptionalInt find(List<Integer> values) {
        throw new UnsupportedOperationException("TODO JS02: implement your solution");
    }
}
