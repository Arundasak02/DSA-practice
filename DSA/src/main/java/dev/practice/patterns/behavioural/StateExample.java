package dev.practice.patterns.behavioural;

import java.util.*;

/*
 * STATE — delegate behavior to the object representing the current lifecycle state.
 * Order is the context; New and Paid implement Status. pay changes New into Paid.
 * Unlike Strategy, the state participates in transitions and governs valid operations.
 * Tradeoff: classes per state can be excessive for a tiny, stable transition table.
 * Try: add a Shipped state and reject shipping an unpaid order.
 */
public class StateExample {
    interface Status { void pay(Order order); String name(); }
    static class New implements Status {
        public void pay(Order order) { order.status = new Paid(); }
        public String name() { return "NEW"; }
    }
    static class Paid implements Status {
        public void pay(Order order) { throw new IllegalStateException("already paid"); }
        public String name() { return "PAID"; }
    }
    static class Order {
        private Status status = new New();
        void pay() { status.pay(this); }
        String status() { return status.name(); }
    }
    public static void main(String[] args) {
        Order order = new Order(); order.pay(); System.out.println(order.status());
    }
    // Output: PAID
}
