package dev.practice.focus.java_streams;

import java.util.*;

/*
 * JS09 — Sort employees with deterministic ties | 25 minutes
 * Evidence: General Java Stream interview practice; no DH-specific attribution
 *
 * Sort by salary descending, then name ascending (String natural order), then id ascending. Return
 * names in that order, retaining duplicates. IDs unique. Do not reorder the input list.
 *
 * Java Streams: Use Stream API for the main transformation. Compose comparators; subtracting numeric
 * values can overflow.
 *
 * Inputs and elements are non-null unless specified. Do not mutate inputs. Unless stated otherwise,
 * size <=100,000. Edge rules and tests are authored practice contracts.
 *
 * Run: ./mvnw -Dtest=JS09SortedNamesTest test
 * Source STREAM: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html
 * Source COLLECT: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Collectors.html
 */
public class JS09SortedNames {
    public List<String> names(List<Employee> employees) {
        throw new UnsupportedOperationException("TODO JS09: implement your solution");
    }
}
