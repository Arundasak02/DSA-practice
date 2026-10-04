package dev.practice.deliveryhero.arrays.p07;

import java.util.*;
import java.util.concurrent.*;
import java.math.*;

/*
 * P07 — Sort each consecutive chunk | 25 minutes
 * Evidence: Reported · Berlin senior Go; ambiguous wording adapted.
 *
 * Return a new array in which each consecutive chunk of size k is independently sorted ascending. The
 * final shorter chunk is also sorted. Chunks stay in their original positions. Length 0..100,000; k≥1.
 * Do not mutate input. The source does not specify whether fragments are independent; this is our
 * chosen interpretation, not a k-sorted-array claim.
 *
 * Inputs/elements are non-null unless stated. Do not mutate inputs unless allowed. Edge rules and
 * tests are practice specifications.
 *
 * Example: [9,2,8,1,7], k=2 → [2,9,1,8,7]
 * Target: O(n log(min(k,n))) time (or O(n) when k=1), O(n) output space.
 *
 * Run: ./mvnw -Dtest=ChunkSortTest test
 * Source S3: https://leetcode.com/discuss/post/1536999/deliveryhero-senior-golang-engineer-berlin-october-2021-reject/
 */
public class ChunkSort {

    public int[] sort(int[] values, int k) {
        throw new UnsupportedOperationException("TODO P07: implement your solution");
    }
}
