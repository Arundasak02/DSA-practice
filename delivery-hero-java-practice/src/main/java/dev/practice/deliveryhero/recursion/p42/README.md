# P42 — Flatten a nested list

**Pattern:** recursion · **Time box:** 25 minutes  
**Evidence:** Reported · Delivery Hero senior Python; recursive Java variant. [S11](../../../../../../../../research/SOURCES.md#s11)

## Task and contract

Return integers in left-to-right depth-first order from an acyclic nested List<?> whose elements are either Integer or another List<?>. Empty lists contribute nothing. Return an independent List<Integer> and do not mutate input. At most 100,000 total elements, depth ≤100. Arbitrary nesting is a practice extension: the report only states a list-of-lists task.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`[1,[2,[],[3]],4] → [1,2,3,4]`

## Work here

- Solution: [FlattenNestedLists.java](FlattenNestedLists.java)
- Tests: [FlattenNestedListsTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/recursion/p42/FlattenNestedListsTest.java)
- Run from the project root: `./mvnw -Dtest=FlattenNestedListsTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(total elements) time, O(depth) traversal state plus output. Tests check behavior, not a proof of complexity.

## Senior follow-up

Add a lazy iterator that does not materialize all values. How would you handle cyclic input?

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
