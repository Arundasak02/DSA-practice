# P63 — Maintain a rolling average over a continuous stream

**Priority:** A — **Learn first** · Study order 17/65.

Java backend report names continuous stream processing; rolling average is adapted.

**Pattern:** practical · **Time box:** 30 minutes

**Evidence:** Adapted · Java backend stream-processing task; operation undisclosed. [S23](../../../../../../../../research/SOURCES.md#s23)

## Task and contract

Choose a window of 1..1,000,000 most recent int values. `average()` returns empty before any data arrives; thereafter return the arithmetic mean of the latest min(windowSize, receivedCount) values. `accept` expires the oldest value once the window is full. Use a long running sum to avoid int overflow. Nonpositive window throws `IllegalArgumentException`; inputs beyond the upper capacity bound need not be validated. Single-threaded; no event-time semantics. Bounded memory is required regardless of stream length.

The signatures, constraints, examples and tests are authored practice requirements, not a verbatim interview specification.

## Example

Window 3, accept 1,2,3,10 → averages 1,1.5,2,5.

## Work here

- Solution: [RollingAverage.java](RollingAverage.java)
- Tests: [RollingAverageTest.java](../../../../../../../test/java/dev/practice/deliveryhero/practical/p63/RollingAverageTest.java)
- Run from the project root: `./mvnw -Dtest=RollingAverageTest test`
- Expected initially: red tests; implement the TODO methods.

## Performance target

O(1) accept and average; O(windowSize) space. Tests check behavior rather than proving complexity.

## Follow-up discussion

Clarify changed requirements and explain your invariants. Discuss thread safety for stateful components, memory limits for streams, and output-size costs for pair enumeration.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
