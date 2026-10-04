package dev.practice.deliveryhero.strings.p03;

import java.util.*;
import java.util.concurrent.*;
import java.math.*;

/*
 * P03 — Compare OCR strings with unknown runs | 40 minutes
 * Evidence: Reported · Berlin SE2/SSE1; grammar reconstructed.
 *
 * An encoding contains ASCII letters and maximal decimal runs. Each run is ONE positive wildcard count
 * (e.g. 12 means twelve unknown letters, never 1 then 2). No zero or leading zeros; inputs are valid.
 * A wildcard matches exactly one letter. Return whether both encodings can describe the same concrete
 * string. Case-sensitive. Empty encodings are valid. Encoded length ≤100,000; expanded length ≤10^12.
 * Do not expand the strings. This is NOT the ambiguous digit-partition version of LeetCode 2060.
 *
 * Inputs/elements are non-null unless stated. Do not mutate inputs unless allowed. Edge rules and
 * tests are practice specifications.
 *
 * Example: "B2D" and "1C2" can both represent "BCAD".
 * Target: O(encoded input length) time and O(1) additional space.
 * Discuss after solving: Ask the interviewer about numeric tokenization before coding; allowing digit
 * partitions changes the problem substantially.
 * Prerequisite: numeric token parsing and long counters. Clarify the OCR grammar first.
 *
 * Run: ./mvnw -Dtest=OcrCompatibilityTest test
 * Source S1: https://leetcode.com/discuss/post/1413476/delivery-hero-se2sse1-berlin-august-2021-awaiting-result/
 */
public class OcrCompatibility {

    public boolean compatible(String left, String right) {
        throw new UnsupportedOperationException("TODO P03: implement your solution");
    }
}
