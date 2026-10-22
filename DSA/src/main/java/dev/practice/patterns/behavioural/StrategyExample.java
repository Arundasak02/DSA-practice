package dev.practice.patterns.behavioural;

/*
 * STRATEGY — choose HOW a job is done by supplying an interchangeable policy.
 * Example: checkout uses either regular or express delivery pricing.
 * ShippingCost is the strategy; Regular/Express are implementations; Checkout is the context.
 * Why: add a pricing policy without adding another branch inside Checkout.
 * Unlike Factory, Strategy selects behavior rather than concentrating object creation.
 * Use ordinary conditionals if there are only tiny, stable differences.
 * Assumption: item counts are nonnegative and small. Amounts are integer cents.
 * Try: add a FreeShipping strategy without changing Checkout.
 */
public class StrategyExample {
    interface ShippingCost {
        int centsFor(int items);
    }

    static class Regular implements ShippingCost {
        public int centsFor(int items) { return 100 * items; }
    }

    static class Express implements ShippingCost {
        public int centsFor(int items) { return 250 * items; }
    }

    static class Checkout {
        private final ShippingCost shipping;

        Checkout(ShippingCost shipping) { this.shipping = shipping; }

        int deliveryCost(int items) { return shipping.centsFor(items); }
    }

    public static void main(String[] args) {
        System.out.println("Regular: " + new Checkout(new Regular()).deliveryCost(2) + " cents");
        System.out.println("Express: " + new Checkout(new Express()).deliveryCost(2) + " cents");
    }
    // Output: Regular: 200 cents / Express: 500 cents
}
