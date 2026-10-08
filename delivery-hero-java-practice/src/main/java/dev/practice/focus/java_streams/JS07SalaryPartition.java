package dev.practice.focus.java_streams;

import java.util.*;

/*
 * JS07 — Partition by salary threshold | 25 minutes
 * Evidence: General Java Stream interview practice; no DH-specific attribution
 *
 * Return both boolean keys: true for salaryCents >= threshold, false otherwise. Lists preserve input
 * order; empty partitions present. Threshold nonnegative.
 *
 * Java Streams: Use Stream API for the main transformation. Explain partitioning versus grouping.
 *
 * Inputs and elements are non-null unless specified. Do not mutate inputs. Unless stated otherwise,
 * size <=100,000. Edge rules and tests are authored practice contracts.
 *
 * Run: ./mvnw -Dtest=JS07SalaryPartitionTest test
 * Source STREAM: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html
 * Source COLLECT: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Collectors.html
 */
public class JS07SalaryPartition {
    public Map<Boolean,List<Employee>> split(List<Employee> employees, long threshold) {
        throw new UnsupportedOperationException("TODO JS07: implement your solution");
    }
}
