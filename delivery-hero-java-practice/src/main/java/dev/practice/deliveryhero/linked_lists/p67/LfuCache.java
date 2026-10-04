package dev.practice.deliveryhero.linked_lists.p67;

/*
 * P67 — Implement an LFU cache | 50 minutes
 * Evidence: Related-role report · Python; LRU tie-breaking authored.
 *
 * Task and contract: Nonnegative capacity; negative capacity throws IllegalArgumentException. get
 * returns OptionalInt.empty() on a miss; a hit increases that key's frequency. put of a new key starts
 * frequency at 1; updating an existing key changes its value and increases frequency. At full capacity
 * evict the lowest-frequency key; break ties by least recent successful get/put. Capacity zero stores
 * nothing. All int keys/values, including -1, are valid. Single-threaded; concurrent access is a
 * discussion extension.  The signatures, constraints, examples and tests are authored practice
 * requirements, not a verbatim interview specification.
 *
 * Example: Capacity 2: put(1,10), put(2,20), get(1), put(3,30) evicts key 2.
 *
 * Performance target: O(1) average get/put; O(capacity) space. Complexity is a review criterion. Tests
 * check behavior rather than proving complexity.
 *
 * Run: ./mvnw -Dtest=LfuCacheTest test
 * Source: research/SOURCES.md — S31
 */
public class LfuCache {
    public LfuCache(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("capacity must be nonnegative");
        // TODO: initialize state.
    }
    public java.util.OptionalInt get(int key) {
        throw new UnsupportedOperationException("TODO P67: implement your solution");
    }
    public void put(int key, int value) {
        throw new UnsupportedOperationException("TODO P67: implement your solution");
    }
}
