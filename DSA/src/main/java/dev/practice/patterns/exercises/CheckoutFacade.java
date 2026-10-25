package dev.practice.patterns.exercises;

/*
 * DP11 — Checkout with compatible provider families | 45 minutes
 * Patterns to practise: Abstract Factory + Facade
 * checkout(factory) creates Payments and Receipts once, in that order, at facade construction.
 * place(orderId,cents) requires cents >0 or throws IllegalArgumentException before external calls.
 * Charge exactly once, then issue exactly one receipt using the returned payment id; return receipt.
 * If charge fails, do not issue receipt. Propagate charge/receipt failures unchanged. No automatic retries.
 * Objects/IDs/results non-null. Keep family selection in the supplied factory.
 * Design: facade simplifies workflow; abstract factory supplies compatible collaborators.
 * Follow-up: receipt failure after successful charge, idempotency and compensating operations.
 * This is an in-memory orchestration exercise, not a real payment integration.
 *
 * General interview-style practice; contract/tests are authored, not an exact company question.
 * Run: ./mvnw -Dtest=CheckoutFacadeTest test
 * References: docs/DESIGN_PATTERNS.md#sources-and-evidence
 */
public class CheckoutFacade {

  public static Checkout checkout(Factory factory) {
    throw new UnsupportedOperationException("TODO DP11");
  }

  @FunctionalInterface
  public interface Payments {

    String charge(String orderId, long cents);
  }

  @FunctionalInterface
  public interface Receipts {

    String issue(String orderId, String paymentId);
  }

  public interface Factory {

    Payments payments();

    Receipts receipts();
  }

  @FunctionalInterface
  public interface Checkout {

    String place(String orderId, long cents);
  }
}
