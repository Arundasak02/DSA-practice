package dev.practice.deliveryhero.heaps.p08;

import java.util.*;
import java.util.concurrent.*;
import java.math.*;

/*
 * P08 — Maintain the median of a stream | 40 minutes
 * Evidence: Reported · Berlin senior Go.
 *
 * Support add(int) and median(). Median is the middle value for odd size, the mean of two middle
 * values for even size. median() on an empty stream throws NoSuchElementException. Up to 100,000
 * additions; arbitrary ints. Each object owns independent state. Constructor is free for you to edit.
 *
 * Inputs/elements are non-null unless stated. Do not mutate inputs unless allowed. Edge rules and
 * tests are practice specifications.
 *
 * Example: After adding [5,1,2,8], medians are [5,3,2,3.5].
 * Target: O(log n) add, O(1) median, O(n) storage.
 * Discuss after solving: The report asks how different insertion/query frequencies change the data
 * structure choice. Also discuss deletion and bounded integer domains.
 *
 * Run: ./mvnw -Dtest=StreamingMedianTest test
 * Source S3: https://leetcode.com/discuss/post/1536999/deliveryhero-senior-golang-engineer-berlin-october-2021-reject/
 */
public class StreamingMedian {

    public void add(int value) {
        throw new UnsupportedOperationException("TODO P08: implement your solution");
    }

    public double median() {
        throw new UnsupportedOperationException("TODO P08: implement your solution");
    }
}
