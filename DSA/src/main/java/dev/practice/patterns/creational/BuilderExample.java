package dev.practice.patterns.creational;

/*
 * BUILDER — assemble an immutable object with optional settings, validating at build time.
 * Builder collects fields; Order is the product. Useful when constructor arguments become confusing.
 * A fluent builder is a common Java variation; no separate Director is needed here.
 * Tradeoff: extra code; a constructor is clearer for two simple required fields.
 * Try: add an optional client reference without exposing setters on Order.
 */
public class BuilderExample {

  public static void main(String[] args) {
    Order order = new Builder("ACME").quantity(10).build();
    System.out.println(order.symbol() + ":" + order.quantity() + ":" + order.type());
  }

  record Order(String symbol, int quantity, String type) {

  }

  static class Builder {

    private final String symbol;
    private int quantity = 1;
    private String type = "MARKET";

    Builder(String symbol) {
      this.symbol = symbol;
    }

    Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    Builder type(String type) {
      this.type = type;
      return this;
    }

    Order build() {
      if (quantity > 0) {
        return new Order(symbol, quantity, type);
      } else {
        throw new IllegalArgumentException("");
      }
    }

  }

  // Output: ACME:10:MARKET
}
