# P43 — Design a set with insertion order and stack-like pop

**Pattern:** practical · **Time box:** 45 minutes  
**Evidence:** Reported · foodpanda principal engineer. [S13](../../../../../../../../research/SOURCES.md#s13)

## Task and contract

Implement a set of ints. push(x) inserts only if absent; pushing a duplicate does not change order. pop() removes the most recently inserted remaining value, returning OptionalInt.empty() when empty. remove(x) returns whether x existed. values() returns a snapshot Set; orderedValues() returns an insertion-order snapshot List. intersect(other) returns a new independent set with common values in this object's insertion order; neither operand changes. Removing then re-adding a value makes it most recent. Up to 100,000 operations; single-threaded. No null values. The report emphasizes readable, extensible, testable code; duplicate and intersection-order rules are practice choices.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

push(4), push(7), push(4), pop() returns 7.

## Work here

- Solution: [InsertionOrderedSet.java](InsertionOrderedSet.java)
- Tests: [InsertionOrderedSetTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/practical/p43/InsertionOrderedSetTest.java)
- Run from the project root: `./mvnw -Dtest=InsertionOrderedSetTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

Prefer expected O(1) push/remove/pop and linear snapshots/intersection; first prioritize coherent contracts and clean tests. Tests check behavior, not a proof of complexity.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
