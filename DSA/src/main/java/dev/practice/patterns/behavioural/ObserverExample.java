package dev.practice.patterns.behavioural;

/*
 * OBSERVER — notify registered listeners when something changes.
 * Example: an order notifies a customer listener and an audit listener of its status.
 * Order is the publisher/subject; OrderListener is the observer interface.
 * Why: Order does not need to know the concrete notification or audit implementations.
 * This is synchronous, in-process, single-threaded delivery. A listener exception propagates
 * and stops later notifications. Kafka involves additional delivery/failure semantics.
 * Remove listeners when no longer needed to avoid retaining them unnecessarily.
 * Try: unsubscribe the customer before the second update; decide an exception-handling policy.
 */
public class ObserverExample {
    interface OrderListener {
        void onStatusChanged(String status);
    }

    static class Order {
        private final java.util.List<OrderListener> listeners = new java.util.ArrayList<>();

        void subscribe(OrderListener listener) { listeners.add(listener); }
        void unsubscribe(OrderListener listener) { listeners.remove(listener); }

        void changeStatus(String status) {
            // Snapshot lets a callback subscribe/unsubscribe without changing this iteration.
            for (OrderListener listener : java.util.List.copyOf(listeners)) {
                listener.onStatusChanged(status);
            }
        }
    }

    public static void main(String[] args) {
        Order order = new Order();
        OrderListener customer = status -> System.out.println("Customer: " + status);
        OrderListener audit = status -> System.out.println("Audit: " + status);
        order.subscribe(customer);
        order.subscribe(audit);
        order.changeStatus("ACCEPTED");
        order.unsubscribe(customer);
        order.changeStatus("DISPATCHED");
    }
    // Output: Customer: ACCEPTED / Audit: ACCEPTED / Audit: DISPATCHED
}
