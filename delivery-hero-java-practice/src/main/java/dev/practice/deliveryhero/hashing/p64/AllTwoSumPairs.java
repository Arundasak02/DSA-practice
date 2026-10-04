package dev.practice.deliveryhero.hashing.p64;

/*
 * P64 — Return all Two-Sum index pairs with duplicates | 30 minutes
 * Evidence: Adapted · reported duplicate-index task; full output contract authored.
 *
 * Task and contract: For a non-null int array, return every pair (i,j) with i < j and mathematical sum
 * values[i]+values[j] == target. Distinct index pairs remain distinct even when values match. Return
 * pairs sorted by increasing second index, then increasing first index. Length 0..100,000. Target is
 * long, so avoid overflow in sums/complements. Do not mutate input. Null throws NullPointerException.
 * Output can be quadratic; do not claim O(n) total time when returning all pairs.  The signatures,
 * constraints, examples and tests are authored practice requirements, not a verbatim interview
 * specification.
 *
 * Example: [1,1,2,23,4,9,13,6,9], 10 → [(0,5),(1,5),(4,7),(0,8),(1,8)].
 *
 * Performance target: Expected O(n+p) time; O(n) auxiliary space plus O(p) result, for p returned
 * pairs. Tests check behavior rather than proving complexity.
 *
 * Run: ./mvnw -Dtest=AllTwoSumPairsTest test
 * Source: research/SOURCES.md — S32
 */
public class AllTwoSumPairs {
    public record Pair(int first, int second) {}
    public java.util.List<Pair> find(int[] values, long target) {
        throw new UnsupportedOperationException("TODO P64: implement your solution");
    }
}
