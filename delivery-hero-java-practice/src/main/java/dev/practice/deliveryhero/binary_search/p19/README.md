# P19 — First position at least the target

**Priority:** A — **Learn first** · Study order 2/65.

Java backend account names binary search; this lower-bound variant is adapted.

**Pattern:** binary search · **Time box:** 20 minutes  
**Evidence:** Adapted · Java backend report names binary search; lower-bound variant authored. [S23](../../../../../../../../research/SOURCES.md#s23)

## Task and contract

Given a nondecreasing int array, return the smallest index i where values[i]≥target, or length if none. Length 0..100,000. Duplicates allowed.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`[1,3,3,8], target=3 → 1`

## Work here

- Solution: [LowerBound.java](LowerBound.java)
- Tests: [LowerBoundTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/binary_search/p19/LowerBoundTest.java)
- Run from the project root: `./mvnw -Dtest=LowerBoundTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(log n) time, O(1) space. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

Write the meaning of your search interval, and keep it consistent.

</details>

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
