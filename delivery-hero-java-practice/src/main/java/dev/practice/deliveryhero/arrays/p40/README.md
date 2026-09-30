# P40 — Find minimum and maximum in one pass

**Priority:** A — **Learn first** · Study order 9/65.

Reported senior React min/max; quick Java fundamentals.

**Pattern:** arrays · **Time box:** 10 minutes  
**Evidence:** Reported · Delivery Hero senior React. [S10](../../../../../../../../research/SOURCES.md#s10)

## Task and contract

Return Bounds(min,max) for a non-empty int array. Length ≤100,000; arbitrary ints. Do not sort or mutate input.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`[4,-2,9] → Bounds(-2,9)`

## Work here

- Solution: [MinMax.java](MinMax.java)
- Tests: [MinMaxTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/arrays/p40/MinMaxTest.java)
- Run from the project root: `./mvnw -Dtest=MinMaxTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(n) time, O(1) additional space. Tests check behavior, not a proof of complexity.

## Senior follow-up

Can pairwise comparisons reduce the comparison count without sacrificing clarity?

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
