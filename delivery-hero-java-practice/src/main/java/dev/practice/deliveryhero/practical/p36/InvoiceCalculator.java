package dev.practice.deliveryhero.practical.p36;

import java.util.*;
import java.util.concurrent.*;
import java.math.*;

/*
 * P36 — Debug a small invoice service | 30 minutes
 * Evidence: Adapted · Glovo report describes debugging, actual service undisclosed.
 *
 * This exercise deliberately starts with defective code. Fix calculate(lines,discountPercent) without
 * altering the tests. Each Line has nonnegative long unitCents and positive int quantity. Sum line
 * totals, then apply a whole-percent discount from 0..100 once to the subtotal. Round the final amount
 * to nearest cent with HALF_UP. Reject an out-of-range discount with IllegalArgumentException. Empty
 * lines cost zero. Subtotal and intermediate arithmetic fit in long; total ≤10^12 cents. No taxes,
 * currency conversion or floating-point money. Up to 100,000 lines.
 *
 * Inputs/elements are non-null unless stated. Do not mutate inputs unless allowed. Edge rules and
 * tests are practice specifications.
 *
 * Example: 101 cents discounted 10% = 90.9 cents, rounded to 91.
 * Target: O(number of lines) time, O(1) additional space.
 * Discuss after solving: Explain error mapping, immutable domain models, dependency injection and
 * observability. Identify which behavior belongs in a pure function.
 *
 * Run: ./mvnw -Dtest=InvoiceCalculatorTest test
 * Source S5: https://leetcode.com/discuss/post/6976664/interview-experience-software-engineer-b-s19v/
 */
public class InvoiceCalculator {
    public record Line(long unitCents, int quantity) {}
    public long calculate(List<Line> lines, int discountPercent) {
        // Intentionally buggy. Read the contract and use the tests to diagnose it.
        int subtotal = 0;
        for (Line line : lines) {
            subtotal += (int) line.unitCents();
        }
        return subtotal * (100 - discountPercent) / 100;
    }
}
