# P33 — Maximum profit from one buy then sell

**Pattern:** arrays · **Time box:** 20 minutes  
**Evidence:** Recommended. Curriculum recommendation; not claimed as a Delivery Hero question.

## Task and contract

Given nonnegative int prices in time order, return maximum profit from at most one buy followed by a sale on a later day. No short selling. Empty/single-element arrays return zero. Length ≤100,000. This is an algorithm exercise, not financial advice.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`[7,1,5,3,6,4] → 5`

## Work here

- Solution: [SingleTradeProfit.java](SingleTradeProfit.java)
- Tests: [SingleTradeProfitTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/arrays/p33/SingleTradeProfitTest.java)
- Run from the project root: `./mvnw -Dtest=SingleTradeProfitTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(n) time, O(1) space. Tests check behavior, not a proof of complexity.

## Senior follow-up

Explain the difference between a one-pass minimum-price invariant and multi-transaction dynamic programming.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
