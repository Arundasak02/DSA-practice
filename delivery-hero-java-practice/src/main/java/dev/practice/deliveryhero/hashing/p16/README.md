# P16 — Count subarrays with a target sum

**Pattern:** hashing · **Time box:** 25 minutes  
**Evidence:** Recommended. Curriculum recommendation; not claimed as a Delivery Hero question.

## Task and contract

Count non-empty contiguous subarrays summing to long target. Values may be negative or zero. Length 0..100,000; arbitrary ints. Return long because there may be n(n+1)/2 matches.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`[1,-1,0], target=0 → 3`

## Work here

- Solution: [SubarraySum.java](SubarraySum.java)
- Tests: [SubarraySumTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/hashing/p16/SubarraySumTest.java)
- Run from the project root: `./mvnw -Dtest=SubarraySumTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

Expected O(n) time and O(n) space. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

Negative values break the monotonicity required for the usual grow/shrink sum window.

</details>

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
