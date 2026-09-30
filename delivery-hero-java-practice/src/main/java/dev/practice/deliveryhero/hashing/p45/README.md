# P45 — Character frequencies in first-seen order

**Priority:** LAST — **Learn last** · Study order 56/65.

Data-role repost with uncertain attribution; limited senior Java evidence.

**Pattern:** hashing · **Time box:** 15 minutes  
**Evidence:** Reported-topic · Delivery Hero data engineer repost; attribution uncertain. [S14](../../../../../../../../research/SOURCES.md#s14)

## Task and contract

For a lowercase ASCII string, emit each distinct character followed by its total count, ordered by its first appearance. Empty returns empty. Counts may be multiple digits. Length ≤100,000. This counts all occurrences, not consecutive runs (compare P51).

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`"babaac" → "b2a3c1"`

## Work here

- Solution: [OrderedCharacterCounts.java](OrderedCharacterCounts.java)
- Tests: [OrderedCharacterCountsTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/hashing/p45/OrderedCharacterCountsTest.java)
- Run from the project root: `./mvnw -Dtest=OrderedCharacterCountsTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(n) time, O(alphabet) state plus output. Tests check behavior, not a proof of complexity.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
