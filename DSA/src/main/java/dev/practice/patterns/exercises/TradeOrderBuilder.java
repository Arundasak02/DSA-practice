package dev.practice.patterns.exercises;

/*
 * DP02 — Build validated immutable trade orders | 45 minutes
 * Patterns to practise: Builder
 * Complete Builder. Required symbol is nonblank and quantity >0; default type MARKET.
 * limit(priceCents) switches to LIMIT; market() switches to MARKET and clears the price.
 * LIMIT price must be positive; all validation occurs in build(), which throws IllegalArgumentException.
 * Setters return this. Builder may be reused; built immutable Order values cannot change afterwards.
 * Inputs non-null. MARKET Order.limitCents is null. Do not silently trim the symbol.
 * Design: explain builder reuse, validation timing and why the product has no setters.
 * Follow-up: add time-in-force and cross-field validation without a telescoping constructor.
 *
 * General interview-style practice; contract/tests are authored, not an exact company question.
 * Run: ./mvnw -Dtest=TradeOrderBuilderTest test
 * References: docs/DESIGN_PATTERNS.md#sources-and-evidence
 */
public class TradeOrderBuilder {

  public enum Type {MARKET, LIMIT}

  public record Order(String symbol, int quantity, Type type, Long limitCents) {

  }

  public static class Builder {

    public Builder symbol(String symbol) {
      throw new UnsupportedOperationException("TODO DP02");
    }

    public Builder quantity(int quantity) {
      throw new UnsupportedOperationException("TODO DP02");
    }

    public Builder limit(long priceCents) {
      throw new UnsupportedOperationException("TODO DP02");
    }

    public Builder market() {
      throw new UnsupportedOperationException("TODO DP02");
    }

    public Order build() {
      throw new UnsupportedOperationException("TODO DP02");
    }
  }
}
