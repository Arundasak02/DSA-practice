package dev.practice.patterns.creational;

/*
 * ABSTRACT FACTORY — create a compatible family of related products.
 * GatewayFactory creates both Payments and Receipts; SandboxFactory supplies one family.
 * Unlike Factory Method, the emphasis is a family of product interfaces, not one creation hook.
 * Tradeoff: a new product type requires changing every family factory.
 * Try: add a LiveFactory without changing Checkout.
 */
public class AbstractFactoryExample {

  public static void main(String[] args) {
    System.out.println(new Checkout(new SandboxFactory()).run());
  }

  interface Payments {

    String charge();
  }

  interface Receipts {

    String create();
  }

  interface GatewayFactory {

    Payments payments();

    Receipts receipts();
  }

  static class SandboxFactory implements GatewayFactory {

    public Payments payments() {
      return () -> "test-charge";
    }

    public Receipts receipts() {
      return () -> "test-receipt";
    }
  }

  static class Checkout {

    private final Payments payments;
    private final Receipts receipts;

    Checkout(GatewayFactory factory) {
      payments = factory.payments();
      receipts = factory.receipts();
    }

    String run() {
      return payments.charge() + "/" + receipts.create();
    }
  }
  // Output: test-charge/test-receipt
}
