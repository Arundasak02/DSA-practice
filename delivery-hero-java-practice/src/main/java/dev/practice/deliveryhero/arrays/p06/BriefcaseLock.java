package dev.practice.deliveryhero.arrays.p06;

import java.util.*;
import java.util.concurrent.*;
import java.math.*;

/*
 * P06 — Minimum rotations of a combination lock | 15 minutes
 * Evidence: Reported · Berlin senior Go; wheel rules reconstructed.
 *
 * Start with every wheel at 0. One move rotates exactly one wheel by one digit forward or backward,
 * wrapping between 9 and 0. Return minimum moves to reach the digit string. No blocked states or
 * coupled wheels. Valid ASCII digits only; length 0..100,000. The report mentions a three-digit lock;
 * this exercise generalizes its size.
 *
 * Inputs/elements are non-null unless stated. Do not mutate inputs unless allowed. Edge rules and
 * tests are practice specifications.
 *
 * Example: "091" → 2
 * Target: O(number of wheels) time, O(1) space.
 * Discuss after solving: How does adding forbidden combinations change the state-space model?
 *
 * Run: ./mvnw -Dtest=BriefcaseLockTest test
 * Source S3: https://leetcode.com/discuss/post/1536999/deliveryhero-senior-golang-engineer-berlin-october-2021-reject/
 */
public class BriefcaseLock {

    public int minimumMoves(String target) {
        throw new UnsupportedOperationException("TODO P06: implement your solution");
    }
}
