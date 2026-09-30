# P10 — Per-client sliding-window rate limiter

**Priority:** A — **Learn first** · Study order 14/65.

Reported API-abuse scenario; sliding-window algorithm is an adaptation.

**Pattern:** practical · **Time box:** 40 minutes  
**Evidence:** Adapted · Berlin API-abuse follow-up; algorithm not specified. [S4](../../../../../../../../research/SOURCES.md#s4)

## Task and contract

Construct with positive limit and windowMillis. allow(client, now) admits at most limit accepted requests in (now-windowMillis, now] for each client. Rejected requests are not recorded. Calls have globally nondecreasing timestamps in 0..10^12; duplicate timestamps are allowed. Different clients are independent. Window boundary is exclusive on the left. Up to 100,000 calls. Single-threaded baseline. Constructor may store configuration; implement the method.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

limit=2, window=10: requests at 0,1,9,10 yield true,true,false,true.

## Work here

- Solution: [SlidingWindowLimiter.java](SlidingWindowLimiter.java)
- Tests: [SlidingWindowLimiterTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/practical/p10/SlidingWindowLimiterTest.java)
- Run from the project root: `./mvnw -Dtest=SlidingWindowLimiterTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

Amortized O(1) per call with bounded per-client accepted history. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

Use supplied time rather than sleeping or reading the wall clock. Write down the exact interval before expiring timestamps.

</details>

## Senior follow-up

How would Redis atomicity, clock skew, retry-after, idle-client cleanup and multiple service instances change the design?

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
