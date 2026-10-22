package dev.practice.patterns.structural;

/*
 * FACADE — offer one simple entry point to a group of collaborating components.
 * Example: checkout coordinates inventory, payment and confirmation.
 * CheckoutFacade is the facade; the other classes are subsystem components.
 * Why: callers need not know the subsystem call sequence.
 * Unlike Adapter, the goal is a simpler API, not translating an incompatible interface.
 * Unlike Proxy, the facade need not implement the same interface as its subsystems.
 * Assumption: this happy-path demo's operations succeed. The facade does NOT create a
 * distributed transaction; real checkout needs explicit failure/retry/compensation handling.
 * Try: describe what should happen if payment fails after inventory is reserved.
 */
public class FacadeExample {
    static class Inventory {
        void reserve(String item) { System.out.println("Reserved: " + item); }
    }

    static class Payment {
        void charge(int cents) { System.out.println("Charged: " + cents + " cents"); }
    }

    static class Confirmation {
        void send() { System.out.println("Confirmation sent"); }
    }

    static class CheckoutFacade {
        private final Inventory inventory;
        private final Payment payment;
        private final Confirmation confirmation;

        CheckoutFacade(Inventory inventory, Payment payment, Confirmation confirmation) {
            this.inventory = inventory;
            this.payment = payment;
            this.confirmation = confirmation;
        }

        void placeOrder(String item, int cents) {
            inventory.reserve(item);
            payment.charge(cents);
            confirmation.send();
        }
    }

    public static void main(String[] args) {
        var checkout = new CheckoutFacade(new Inventory(), new Payment(), new Confirmation());
        checkout.placeOrder("Coffee", 200);
    }
    // Output: Reserved: Coffee / Charged: 200 cents / Confirmation sent
}
