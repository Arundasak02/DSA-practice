# P08 — Maintain the median of a stream

**Pattern:** heaps · **Time box:** 40 minutes  
**Evidence:** Reported · Berlin senior Go. [S3](../../../../../../../../research/SOURCES.md#s3)

## Task and contract

Support add(int) and median(). Median is the middle value for odd size, the mean of two middle values for even size. median() on an empty stream throws NoSuchElementException. Up to 100,000 additions; arbitrary ints. Each object owns independent state. Constructor is free for you to edit.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

After adding `[5,1,2,8]`, medians are `[5,3,2,3.5]`.

## Work here

- Solution: [StreamingMedian.java](StreamingMedian.java)
- Tests: [StreamingMedianTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/heaps/p08/StreamingMedianTest.java)
- Run from the project root: `./mvnw -Dtest=StreamingMedianTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(log n) add, O(1) median, O(n) storage. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

Prerequisite: PriorityQueue comparator behavior; never compare ints by subtracting.

</details>

## Senior follow-up

The report asks how different insertion/query frequencies change the data structure choice. Also discuss deletion and bounded integer domains.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
