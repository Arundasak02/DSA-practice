# P07 — Sort each consecutive chunk

**Pattern:** arrays · **Time box:** 25 minutes  
**Evidence:** Reported · Berlin senior Go; ambiguous wording adapted. [S3](../../../../../../../../research/SOURCES.md#s3)

## Task and contract

Return a new array in which each consecutive chunk of size k is independently sorted ascending. The final shorter chunk is also sorted. Chunks stay in their original positions. Length 0..100,000; k≥1. Do not mutate input. The source does not specify whether fragments are independent; this is our chosen interpretation, not a k-sorted-array claim.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`[9,2,8,1,7], k=2 → [2,9,1,8,7]`

## Work here

- Solution: [ChunkSort.java](ChunkSort.java)
- Tests: [ChunkSortTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/arrays/p07/ChunkSortTest.java)
- Run from the project root: `./mvnw -Dtest=ChunkSortTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(n log(min(k,n))) time (or O(n) when k=1), O(n) output space. Tests check behavior, not a proof of complexity.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
