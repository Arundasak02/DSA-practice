# P04 — Maximum contiguous subarray sum

**Pattern:** arrays · **Time box:** 25 minutes  
**Evidence:** Reported · Berlin SE2/SSE1. [S1](../../../../../../../../research/SOURCES.md#s1)

## Task and contract

Return the largest sum of a non-empty contiguous subarray. Array length 1..100,000; arbitrary int elements. Return long to avoid overflow.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`[4,-1,2,1] → 6`

## Work here

- Solution: [MaximumSubarray.java](MaximumSubarray.java)
- Tests: [MaximumSubarrayTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/arrays/p04/MaximumSubarrayTest.java)
- Run from the project root: `./mvnw -Dtest=MaximumSubarrayTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(n) time and O(1) extra space. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

A non-empty answer matters for all-negative arrays.

</details>

## Senior follow-up

Return the indices too, with a deterministic tie rule.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
