# P30 — Minimum coins for an amount

**Priority:** LAST — **Learn last** · Study order 52/65.

General interview coverage; no strong direct Delivery Hero evidence in the audit.

**Pattern:** dynamic programming · **Time box:** 35 minutes  
**Evidence:** Recommended. Curriculum recommendation; not claimed as a Delivery Hero question.

## Task and contract

Given positive distinct coin values with unlimited supply, return the smallest count to make amount exactly, or -1 if impossible. amount 0..10,000; ≤100 coin denominations, each ≤10,000. Empty coin set is allowed; amount zero needs zero coins.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`coins=[1,3,4], amount=6 → 2`

## Work here

- Solution: [CoinChange.java](CoinChange.java)
- Tests: [CoinChangeTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/dynamic_programming/p30/CoinChangeTest.java)
- Run from the project root: `./mvnw -Dtest=CoinChangeTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(amount × denominations) time, O(amount) space. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

Prerequisite: state definition, unreachable sentinel and transition order. Largest-coin-first is not generally optimal.

</details>

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
