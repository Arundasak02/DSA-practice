package dev.practice.deliveryhero.intervals.p18;

import java.util.*;
import java.util.concurrent.*;
import java.math.*;

/*
 * P18 — Minimum simultaneous meeting rooms | 25 minutes
 * Evidence: Recommended.
 *
 * Each row is a half-open interval [start,end), start<end, arbitrary int endpoints. Return the maximum
 * simultaneous meetings. An ending meeting releases its room at its end time. Input is unsorted and
 * must remain unchanged. At most 100,000 rows.
 *
 * Inputs/elements are non-null unless stated. Do not mutate inputs unless allowed. Edge rules and
 * tests are practice specifications.
 *
 * Example: [[0,10],[5,7],[7,12]] → 2
 * Target: O(n log n) time, O(n) space.
 *
 * Run: ./mvnw -Dtest=MeetingRoomsTest test
 * Source: curriculum recommendation; not a reported Delivery Hero question.
 */
public class MeetingRooms {

    public int minimum(int[][] intervals) {
        throw new UnsupportedOperationException("TODO P18: implement your solution");
    }
}
