# P32 — Top k frequent values with deterministic ties

**Priority:** C — **Insurance** · Study order 43/65.

Recommended transferable pattern; no strong evidence for this exact Delivery Hero task.

**Pattern:** heaps · **Time box:** 30 minutes  
**Evidence:** Recommended. Curriculum recommendation; not claimed as a Delivery Hero question.

## Task and contract

Return k distinct values sorted by descending frequency, then ascending numerical value on ties. Length 0..100,000; 0≤k≤number of distinct values. Arbitrary ints. Do not mutate input.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`[4,4,2,2,9], k=2 → [2,4]`

## Work here

- Solution: [TopKFrequent.java](TopKFrequent.java)
- Tests: [TopKFrequentTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/heaps/p32/TopKFrequentTest.java)
- Run from the project root: `./mvnw -Dtest=TopKFrequentTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(n + u log k + k log k) time using a heap, where u is distinct count; O(u+k) space. Tests check behavior, not a proof of complexity.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
