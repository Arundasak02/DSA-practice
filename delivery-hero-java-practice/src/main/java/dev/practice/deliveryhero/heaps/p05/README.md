# P05 — Largest, second-largest and kth-largest

**Pattern:** heaps · **Time box:** 25 minutes  
**Evidence:** Reported · Berlin SE II; duplicate policy added. [S2](../../../../../../../../research/SOURCES.md#s2)

## Task and contract

Return the kth element in descending sorted order, counting duplicates. k=1 is the maximum; k=2 is the second element, not the second distinct value. Length 1..100,000, 1≤k≤length. Do not mutate the array.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`[8,8,3], k=2 → 8`

## Work here

- Solution: [KthLargest.java](KthLargest.java)
- Tests: [KthLargestTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/heaps/p05/KthLargestTest.java)
- Run from the project root: `./mvnw -Dtest=KthLargestTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(n log k) time and O(k) space; discuss alternatives. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

Clarify distinctness. Compare a bounded heap with selection on a copy.

</details>

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
