package dev.practice.patterns.exercises;

import java.util.*;
import java.util.function.*;

/*
 * DP10 — Aggregate nested portfolios | 45 minutes
 * Patterns to practise: Composite
 * position(cents) creates immutable leaf, rejecting negative cents with IllegalArgumentException.
 * portfolio(children) snapshots its non-null children and returns an Asset summing their totals.
 * Empty group totals zero. Nest arbitrarily; repeated assets count per occurrence.
 * Overflow must throw ArithmeticException. Inputs form an acyclic tree; depth <=100.
 * Client-supplied Asset implementations may return changing nonnegative values: recompute each call.
 * Design: client treats leaf and group uniformly. No instanceof checks for concrete node types.
 * Follow-up: add a reporting Visitor and explain when it is worth the extra interfaces.
 *
 * General interview-style practice; contract/tests are authored, not an exact company question.
 * Run: ./mvnw -Dtest=PortfolioCompositeTest test
 * References: docs/DESIGN_PATTERNS.md#sources-and-evidence
 */
public class PortfolioComposite {
    @FunctionalInterface public interface Asset { long totalCents(); }
    public static Asset position(long cents) { throw new UnsupportedOperationException("TODO DP10"); }
    public static Asset portfolio(List<Asset> children) { throw new UnsupportedOperationException("TODO DP10"); }
}
