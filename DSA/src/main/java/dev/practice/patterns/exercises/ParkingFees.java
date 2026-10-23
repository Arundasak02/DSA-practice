package dev.practice.patterns.exercises;

import java.util.*;
import java.util.function.*;

/*
 * DP01 — Parking-lot fee policies | 45 minutes
 * Patterns to practise: Strategy + simple factory
 * Implement service(Map<String, FeePolicy>) returning a parking fee service.
 * quote(type, minutes) delegates exactly once to the registered policy; type matching is case-sensitive.
 * Reject unknown types and negative minutes with IllegalArgumentException before invoking any policy.
 * Snapshot the registry at creation. Registering a new policy must not require editing the service.
 * Implement hourly(rateCents): charge each started hour; zero minutes costs zero. Rate is nonnegative.
 * All arithmetic must fit long or throw ArithmeticException; hourly rejects negative rate/minutes.
 * Inputs are non-null. This is a pricing slice, not a complete parking allocation system.
 * Design: explain why the registry is a simple factory/lookup, not GoF Factory Method.
 * Follow-up: add weekend pricing using composition; discuss clock injection and lost-ticket policy.
 *
 * General interview-style practice; contract/tests are authored, not an exact company question.
 * Run: ./mvnw -Dtest=ParkingFeesTest test
 * References: docs/DESIGN_PATTERNS.md#sources-and-evidence
 */
public class ParkingFees {
    @FunctionalInterface public interface FeePolicy { long cents(long minutes); }
    public interface Service { long quote(String type, long minutes); }
    public static Service service(Map<String, FeePolicy> policies) { throw new UnsupportedOperationException("TODO DP01"); }
    public static FeePolicy hourly(long rateCents) { throw new UnsupportedOperationException("TODO DP01"); }
}
