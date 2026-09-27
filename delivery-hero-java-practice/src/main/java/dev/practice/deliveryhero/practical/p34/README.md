# P34 — Create orders safely under duplicate retries

**Pattern:** practical · **Time box:** 45 minutes  
**Evidence:** Recommended · related idempotency topic reported, task authored. [S7](../../../../../../../../research/SOURCES.md#s7)

## Task and contract

create(key,sku,quantity) returns an Order(id,sku,quantity). Non-blank keys and sku, positive quantity are guaranteed. First call for a key creates one order. Repeating the key with the same payload returns an equal Order; using it with a different payload throws IllegalArgumentException and does not change the original. Distinct keys create distinct IDs. Calls may be concurrent; creation must be atomic per key. IDs must be non-blank. No TTL, database or network in this version. Up to 100,000 keys.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

create("r1","tea",2) twice gives the same order; changing quantity for r1 is a conflict.

## Work here

- Solution: [IdempotentOrders.java](IdempotentOrders.java)
- Tests: [IdempotentOrdersTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/practical/p34/IdempotentOrdersTest.java)
- Run from the project root: `./mvnw -Dtest=IdempotentOrdersTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

Expected O(1) access with per-key atomicity; O(keys) state. Discuss contention. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

Concurrent containers do not automatically make a check-then-create sequence atomic.

</details>

## Senior follow-up

Relate this to brokerage submission retries. What must be transactional when an order row and outbox event are written? How do you persist conflicts and replay responses across restarts?

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
