# P53 — Next lexicographic permutation

**Pattern:** arrays · **Time box:** 30 minutes  
**Evidence:** Recommended · secondary company-tag signal, not verified report. [S22](../../../../../../../../research/SOURCES.md#s22)

## Task and contract

Rearrange the array into the next lexicographically larger permutation in-place. If already greatest, rearrange ascending. Duplicate values allowed. Empty and single-element arrays stay unchanged. Length ≤100,000; arbitrary ints.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`[1,3,2] → [2,1,3]`

## Work here

- Solution: [NextPermutation.java](NextPermutation.java)
- Tests: [NextPermutationTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/arrays/p53/NextPermutationTest.java)
- Run from the project root: `./mvnw -Dtest=NextPermutationTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(n) time, O(1) space. Tests check behavior, not a proof of complexity.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
