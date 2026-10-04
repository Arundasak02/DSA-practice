package dev.practice.deliveryhero.practical.p63;

/*
 * P63 — Maintain a rolling average over a continuous stream | 30 minutes
 * Evidence: Adapted · Java backend stream-processing task; operation undisclosed.
 *
 * Task and contract: Choose a window of 1..1,000,000 most recent int values. average() returns empty
 * before any data arrives; thereafter return the arithmetic mean of the latest min(windowSize,
 * receivedCount) values. accept expires the oldest value once the window is full. Use a long running
 * sum to avoid int overflow. Nonpositive window throws IllegalArgumentException; inputs beyond the
 * upper capacity bound need not be validated. Single-threaded; no event-time semantics. Bounded memory
 * is required regardless of stream length.  The signatures, constraints, examples and tests are
 * authored practice requirements, not a verbatim interview specification.
 *
 * Example: Window 3, accept 1,2,3,10 → averages 1,1.5,2,5.
 *
 * Performance target: O(1) accept and average; O(windowSize) space. Tests check behavior rather than
 * proving complexity.
 *
 * Run: ./mvnw -Dtest=RollingAverageTest test
 * Source: research/SOURCES.md — S24
 */
public class RollingAverage {
    public RollingAverage(int windowSize) {
        if (windowSize <= 0) throw new IllegalArgumentException("windowSize must be positive");
        // TODO: initialize bounded state.
    }
    public void accept(int value) {
        throw new UnsupportedOperationException("TODO P63: implement your solution");
    }
    public java.util.OptionalDouble average() {
        throw new UnsupportedOperationException("TODO P63: implement your solution");
    }
}
