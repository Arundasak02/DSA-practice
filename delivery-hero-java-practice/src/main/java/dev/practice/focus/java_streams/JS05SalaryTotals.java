package dev.practice.focus.java_streams;

import java.util.*;

/*
 * JS05 — Sum salaries by department | 25 minutes
 * Evidence: General Java Stream interview practice; no DH-specific attribution
 *
 * Using Employee records, return department -> total salaryCents (long). Department order
 * unrestricted. Salaries nonnegative; totals fit long. Empty -> empty map.
 *
 * Java Streams: Use Stream API for the main transformation. Nested grouping and summing; avoid int
 * overflow.
 *
 * Inputs and elements are non-null unless specified. Do not mutate inputs. Unless stated otherwise,
 * size <=100,000. Edge rules and tests are authored practice contracts.
 *
 * Run: ./mvnw -Dtest=JS05SalaryTotalsTest test
 * Source STREAM: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html
 * Source COLLECT: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Collectors.html
 */
public class JS05SalaryTotals {
    public Map<String,Long> total(List<Employee> employees) {
        throw new UnsupportedOperationException("TODO JS05: implement your solution");
    }
}
