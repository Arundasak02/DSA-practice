package dev.practice.deliveryhero.greedy.p65;

/*
 * P65 — Determine whether the last index is reachable | 20 minutes
 * Evidence: Reported · Senior SWE in Python context; Java contract authored.
 *
 * Task and contract: A non-null array gives the maximum forward jump from each index. Start at index
 * 0; return whether you can reach the final index. An empty array returns false; any single-element
 * array returns true. Entries are nonnegative ints; null throws NullPointerException. Length
 * 0..100,000; do not mutate input. A very large entry must not overflow your reach calculation. This
 * asks reachability, not minimum jumps (P54).  The signatures, constraints, examples and tests are
 * authored practice requirements, not a verbatim interview specification.
 *
 * Example: [2,3,1,1,4] → true; [3,2,1,0,4] → false.
 *
 * Performance target: O(n) time and O(1) auxiliary space. Tests check behavior rather than proving
 * complexity.
 *
 * Run: ./mvnw -Dtest=JumpReachabilityTest test
 * Source: research/SOURCES.md — S20
 * Alternative contract for the same reachability pattern as P61; choose one, not both.
 */
public class JumpReachability {
    public boolean canReach(int[] jumps) {
        throw new UnsupportedOperationException("TODO P65: implement your solution");
    }
}
