package dev.practice.focus.java_streams;

import java.util.*;

/*
 * JS08 — Convert list to map with duplicate IDs | 25 minutes
 * Evidence: General Java Stream interview practice; no DH-specific attribution
 *
 * Return id -> Employee having greatest version for that id; on equal version keep LAST encountered
 * record. Map key order unrestricted. Versions positive. Empty -> empty map.
 *
 * Java Streams: Use Stream API for the main transformation. toMap needs an explicit collision policy;
 * distinct compares whole records, not IDs.
 *
 * Inputs and elements are non-null unless specified. Do not mutate inputs. Unless stated otherwise,
 * size <=100,000. Edge rules and tests are authored practice contracts.
 *
 * Run: ./mvnw -Dtest=JS08LatestEmployeeTest test
 * Source STREAM: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html
 * Source COLLECT: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Collectors.html
 */
public class JS08LatestEmployee {
    public Map<String,Employee> latest(List<Employee> employees) {
        throw new UnsupportedOperationException("TODO JS08: implement your solution");
    }
}
