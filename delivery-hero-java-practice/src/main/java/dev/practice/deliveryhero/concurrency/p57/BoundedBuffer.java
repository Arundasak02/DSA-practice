package dev.practice.deliveryhero.concurrency.p57;

import java.util.*;
import java.util.concurrent.*;
import java.math.*;

/*
 * P57 — Implement a bounded blocking FIFO queue | 50 minutes
 * Evidence: Recommended · Java translation of concurrency preparation.
 *
 * Construct with positive capacity. put(int) blocks while full, then inserts at the tail. take()
 * blocks while empty, then removes the head. size() returns a thread-safe size snapshot. Both blocking
 * methods must respond to thread interruption by throwing InterruptedException; a blocked, interrupted
 * operation must not change the queue. FIFO is required for completed insertion order; fairness is not
 * required. Multiple producers/consumers. Implement using locks/conditions or
 * synchronized/wait/notifyAll, not by wrapping BlockingQueue. Up to 10,000 operations per test.
 *
 * Inputs/elements are non-null unless stated. Do not mutate inputs unless allowed. Edge rules and
 * tests are practice specifications.
 *
 * Example: capacity 1: a second put waits until a take makes room.
 * Target: O(1) queue operations when not waiting; O(capacity) memory. Bounded waiting is not promised.
 * Discuss after solving: Explain spurious wakeups, backpressure, happens-before, cancellation and
 * shutdown. Contrast platform threads with virtual threads without changing correctness.
 * Prerequisite: Java monitor/condition semantics, interruption and visibility.
 *
 * Run: ./mvnw -Dtest=BoundedBufferTest test
 * Source: curriculum recommendation; not a reported Delivery Hero question.
 */
public class BoundedBuffer {
    public BoundedBuffer(int capacity) {
        // TODO: initialize queue state and synchronization.
    }
    public void put(int value) throws InterruptedException {
        throw new UnsupportedOperationException("TODO P57: implement your solution");
    }

    public int take() throws InterruptedException {
        throw new UnsupportedOperationException("TODO P57: implement your solution");
    }

    public int size() {
        throw new UnsupportedOperationException("TODO P57: implement your solution");
    }
}
