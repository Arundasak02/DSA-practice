package dev.practice.deliveryhero.heaps.p32;

import java.util.*;
import java.util.concurrent.*;
import java.math.*;

/*
 * P32 — Top k frequent values with deterministic ties | 30 minutes
 * Evidence: Recommended.
 *
 * Return k distinct values sorted by descending frequency, then ascending numerical value on ties.
 * Length 0..100,000; 0≤k≤number of distinct values. Arbitrary ints. Do not mutate input.
 *
 * Inputs/elements are non-null unless stated. Do not mutate inputs unless allowed. Edge rules and
 * tests are practice specifications.
 *
 * Example: [4,4,2,2,9], k=2 → [2,4]
 * Target: O(n + u log k + k log k) time using a heap, where u is distinct count; O(u+k) space.
 *
 * Run: ./mvnw -Dtest=TopKFrequentTest test
 * Source: curriculum recommendation; not a reported Delivery Hero question.
 */
public class TopKFrequent {

    public List<Integer> top(int[] values, int k) {
        throw new UnsupportedOperationException("TODO P32: implement your solution");
    }
}
