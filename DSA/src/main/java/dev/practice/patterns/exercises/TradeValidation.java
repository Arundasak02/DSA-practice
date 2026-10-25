package dev.practice.patterns.exercises;

import java.util.List;
import java.util.Optional;

/*
 * DP05 — Composable pre-trade validation chain | 45 minutes
 * Patterns to practise: Chain of Responsibility
 * chain(checks) snapshots ordered checks; validate returns the first nonempty rejection.
 * No later check runs after rejection; empty chain accepts. Propagate check exceptions unchanged.
 * Supply positiveQuantity() rejecting quantity <=0 with "QUANTITY" and maxNotional(limit)
 * rejecting quantity*priceCents > limit with "NOTIONAL". Equality accepts.
 * maxNotional limit >=0 or factory throws IllegalArgumentException; use overflow-safe comparison.
 * For maxNotional, quantity and price are nonnegative (earlier checks establish this).
 * All objects non-null. No broker/network integration.
 * Design: add a new compliance rule without editing the chain; explain rule ordering.
 *
 * General interview-style practice; contract/tests are authored, not an exact company question.
 * Run: ./mvnw -Dtest=TradeValidationTest test
 * References: docs/DESIGN_PATTERNS.md#sources-and-evidence
 */
public class TradeValidation {

  public static Check chain(List<Check> checks) {
    throw new UnsupportedOperationException("TODO DP05");
  }

  public static Check positiveQuantity() {
    throw new UnsupportedOperationException("TODO DP05");
  }

  public static Check maxNotional(long limit) {
    throw new UnsupportedOperationException("TODO DP05");
  }

  @FunctionalInterface
  public interface Check {

    Optional<String> validate(Trade trade);
  }

  public record Trade(long quantity, long priceCents) {

  }
}
