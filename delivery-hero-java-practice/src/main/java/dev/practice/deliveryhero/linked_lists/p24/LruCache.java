package dev.practice.deliveryhero.linked_lists.p24;

import java.util.*;
import java.util.concurrent.*;
import java.math.*;

/*
 * P24 — Implement an LRU cache | 45 minutes
 * Evidence: Recommended · cache design pattern.
 *
 * Construct with capacity≥0. get(key) returns OptionalInt.empty() when absent, otherwise returns its
 * value and marks it most recently used. put inserts or updates and marks most recent. Evict the least
 * recently used entry if capacity is exceeded. Updating must not increase size. Capacity zero stores
 * nothing. Arbitrary int keys/values; up to 100,000 operations. Single-threaded. Add your state fields
 * and constructor logic.
 *
 * Inputs/elements are non-null unless stated. Do not mutate inputs unless allowed. Edge rules and
 * tests are practice specifications.
 *
 * Example: capacity=2: put(1,10), put(2,20), get(1), put(3,30) evicts key 2.
 * Target: Expected O(1) get/put, O(capacity) space.
 * Discuss after solving: Explain why ConcurrentHashMap alone does not make a multi-step cache update
 * atomic. Compare a lock with approximate eviction.
 *
 * Run: ./mvnw -Dtest=LruCacheTest test
 * Source: curriculum recommendation; not a reported Delivery Hero question.
 */
public class LruCache {
    public LruCache(int capacity) {
        // TODO: initialize cache state.
    }
    public OptionalInt get(int key) {
        throw new UnsupportedOperationException("TODO P24: implement your solution");
    }

    public void put(int key, int value) {
        throw new UnsupportedOperationException("TODO P24: implement your solution");
    }
}
