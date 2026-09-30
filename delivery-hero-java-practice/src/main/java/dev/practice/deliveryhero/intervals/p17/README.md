# P17 — Merge closed intervals

**Priority:** C — **Insurance** · Study order 37/65.

Recommended transferable pattern; no strong evidence for this exact Delivery Hero task.

**Pattern:** intervals · **Time box:** 25 minutes  
**Evidence:** Recommended. Curriculum recommendation; not claimed as a Delivery Hero question.

## Task and contract

Input rows are [start,end] with start≤end; endpoints are arbitrary ints. Merge overlapping or touching CLOSED intervals. Return rows sorted by start. Empty input returns an empty matrix. Do not mutate any input rows. At most 100,000 intervals.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`[[1,3],[3,5]] → [[1,5]]`

## Work here

- Solution: [MergeIntervals.java](MergeIntervals.java)
- Tests: [MergeIntervalsTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/intervals/p17/MergeIntervalsTest.java)
- Run from the project root: `./mvnw -Dtest=MergeIntervalsTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(n log n) time; O(n) output/copy storage. Tests check behavior, not a proof of complexity.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
