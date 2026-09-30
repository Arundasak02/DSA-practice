# P57 — Implement a bounded blocking FIFO queue

**Priority:** B — **Learn next** · Study order 31/65.

Recommended Java concurrency exercise; exact historical prompt unverified.

**Pattern:** concurrency · **Time box:** 50 minutes  
**Evidence:** Recommended · Java translation of concurrency preparation. Curriculum recommendation; not claimed as a Delivery Hero question.

## Task and contract

Construct with positive capacity. put(int) blocks while full, then inserts at the tail. take() blocks while empty, then removes the head. size() returns a thread-safe size snapshot. Both blocking methods must respond to thread interruption by throwing InterruptedException; a blocked, interrupted operation must not change the queue. FIFO is required for completed insertion order; fairness is not required. Multiple producers/consumers. Implement using locks/conditions or synchronized/wait/notifyAll, not by wrapping BlockingQueue. Up to 10,000 operations per test.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

capacity 1: a second put waits until a take makes room.

## Work here

- Solution: [BoundedBuffer.java](BoundedBuffer.java)
- Tests: [BoundedBufferTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/concurrency/p57/BoundedBufferTest.java)
- Run from the project root: `./mvnw -Dtest=BoundedBufferTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(1) queue operations when not waiting; O(capacity) memory. Bounded waiting is not promised. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

Guard conditions belong in a loop. Decide which lock protects the queue, size and condition checks as one invariant.

</details>

## Senior follow-up

Explain spurious wakeups, backpressure, happens-before, cancellation and shutdown. Contrast platform threads with virtual threads without changing correctness.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
