package dev.practice.patterns.exercises;

import java.util.*;
import java.util.function.*;

/*
 * DP09 — Authorized caching report proxy | 45 minutes
 * Patterns to practise: Proxy
 * create(delegate,allowed) returns a ReportService with an initially empty per-instance cache.
 * fetch(user,report) checks allowed(user,report) on EVERY call, including cache hits.
 * If denied, throw SecurityException before touching cache/delegate. Cache successes by user+report.
 * Return cached values on allowed hits. Delegate failures are not cached; propagate unchanged.
 * Inputs and successful results non-null; single-threaded. Authorization may change between calls.
 * Design: same interface as the delegate; no global cache; inject dependencies for testing.
 * Follow-up: eviction, invalidation, concurrent duplicate loads, and avoiding sensitive-data leakage.
 *
 * General interview-style practice; contract/tests are authored, not an exact company question.
 * Run: ./mvnw -Dtest=ReportProxyTest test
 * References: docs/DESIGN_PATTERNS.md#sources-and-evidence
 */
public class ReportProxy {
    @FunctionalInterface public interface ReportService { String fetch(String user, String report); }
    public static ReportService create(ReportService delegate, BiPredicate<String,String> allowed) { throw new UnsupportedOperationException("TODO DP09"); }
}
