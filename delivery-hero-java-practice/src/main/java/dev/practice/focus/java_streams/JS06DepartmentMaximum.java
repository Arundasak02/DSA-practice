package dev.practice.focus.java_streams;

import java.util.*;

/*
 * JS06 — Highest-paid employee per department | 25 minutes
 * Evidence: General Java Stream interview practice; no DH-specific attribution
 *
 * Return department -> Employee. Break salary ties by lexicographically smallest id. IDs unique, order
 * of result map unrestricted. Empty -> empty map.
 *
 * Java Streams: Use Stream API for the main transformation. Choose a deterministic comparator/merge;
 * do not leave tie behavior accidental.
 *
 * Inputs and elements are non-null unless specified. Do not mutate inputs. Unless stated otherwise,
 * size <=100,000. Edge rules and tests are authored practice contracts.
 *
 * Run: ./mvnw -Dtest=JS06DepartmentMaximumTest test
 * Source STREAM: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html
 * Source COLLECT: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Collectors.html
 */
public class JS06DepartmentMaximum {
    public Map<String,Employee> highest(List<Employee> employees) {
        throw new UnsupportedOperationException("TODO JS06: implement your solution");
    }
}
