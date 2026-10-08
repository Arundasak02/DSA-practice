package dev.practice.focus.java_streams;

import java.util.*;

/*
 * JS10 — Reduce a total safely | 25 minutes
 * Evidence: General Java Stream interview practice; no DH-specific attribution
 *
 * Return sum of all input Integer values as long. Empty -> 0. Size <=100,000, so the result fits long.
 * The implementation must also work correctly with a parallel pipeline.
 *
 * Java Streams: Use Stream API for the main transformation. Use a neutral identity and associative
 * addition; never mutate an external accumulator.
 *
 * Inputs and elements are non-null unless specified. Do not mutate inputs. Unless stated otherwise,
 * size <=100,000. Edge rules and tests are authored practice contracts.
 *
 * Run: ./mvnw -Dtest=JS10ReductionTest test
 * Source STREAM: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html
 * Source COLLECT: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Collectors.html
 */
public class JS10Reduction {
    public long sum(List<Integer> values) {
        throw new UnsupportedOperationException("TODO JS10: implement your solution");
    }
}
