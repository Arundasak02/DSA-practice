package dev.practice.focus.java_streams;

import java.util.*;

/*
 * JS04 — Flatten nested lists and deduplicate | 25 minutes
 * Evidence: General Java Stream interview practice; no DH-specific attribution
 *
 * Flatten List<List<Integer>> one level; preserve first occurrence of each distinct number. Inner
 * lists may be empty. No mutation.
 *
 * Java Streams: Use Stream API for the main transformation. Explain map versus flatMap and ordered
 * distinct.
 *
 * Inputs and elements are non-null unless specified. Do not mutate inputs. Unless stated otherwise,
 * size <=100,000. Edge rules and tests are authored practice contracts.
 *
 * Run: ./mvnw -Dtest=JS04FlatDistinctTest test
 * Source STREAM: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html
 * Source COLLECT: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Collectors.html
 */
public class JS04FlatDistinct {
    public List<Integer> flatten(List<List<Integer>> values) {
        throw new UnsupportedOperationException("TODO JS04: implement your solution");
    }
}
