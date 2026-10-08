package dev.practice.focus.java_streams;

import java.util.*;

/*
 * JS03 — Count word frequencies | 25 minutes
 * Evidence: General Java Stream interview practice; no DH-specific attribution
 *
 * Input is already tokenized, lowercase ASCII words. Return Map<String,Long> counts. Keys must iterate
 * in first-seen order. Empty -> empty map.
 *
 * Java Streams: Use Stream API for the main transformation. Counting and ordered collection; HashMap
 * does not promise encounter order.
 *
 * Inputs and elements are non-null unless specified. Do not mutate inputs. Unless stated otherwise,
 * size <=100,000. Edge rules and tests are authored practice contracts.
 *
 * Run: ./mvnw -Dtest=JS03WordFrequenciesTest test
 * Source STREAM: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html
 * Source COLLECT: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Collectors.html
 */
public class JS03WordFrequencies {
    public Map<String,Long> count(List<String> words) {
        throw new UnsupportedOperationException("TODO JS03: implement your solution");
    }
}
