# P60 — Best profit with at most k trades

**Priority:** LAST — **Learn last** · Study order 65/65.

Advanced DP; high effort relative to direct evidence.

**Pattern:** dynamic programming · **Time box:** 45 minutes  
**Evidence:** Recommended · advanced stock-state DP pattern. [S22](../../../../../../../../research/SOURCES.md#s22)

## Task and contract

Given nonnegative int prices in chronological order and k≥0, maximize profit using at most k buy-then-sell transactions. Hold at most one share; selling must occur on a later day than its purchase. No fees, cooldown or shorting. Return long. Length ≤1000, k≤1000; empty input returns zero. Do not mutate input.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`[3,2,6,5,0,3], k=2 → 7`

## Work here

- Solution: [KTransactionProfit.java](KTransactionProfit.java)
- Tests: [KTransactionProfitTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/dynamic_programming/p60/KTransactionProfitTest.java)
- Run from the project root: `./mvnw -Dtest=KTransactionProfitTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(n×min(k,n/2)) time, O(min(k,n/2)) auxiliary space; discuss the high-k shortcut. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

Start with P33. Define precisely whether the transaction counter changes on buy or on sell, and keep initialization consistent.

</details>

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
