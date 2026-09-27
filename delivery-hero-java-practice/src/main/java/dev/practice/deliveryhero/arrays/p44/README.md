# P44 — Can everyone see the theatre screen?

**Pattern:** arrays · **Time box:** 15 minutes  
**Evidence:** Reported-topic · Delivery Hero data engineer repost; attribution uncertain. [S14](../../../../../../../../research/SOURCES.md#s14)

## Task and contract

Rows run front to back; each column is one line of sight. Every person must be strictly taller than each person ahead in the same column. Return whether everyone can see. Rectangular matrix, up to 100,000 cells, positive heights. Zero rows or zero columns returns true. Do not mutate input.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`[[1,2],[2,3]] → true`; `[[1],[1]] → false.

## Work here

- Solution: [TheatreVisibility.java](TheatreVisibility.java)
- Tests: [TheatreVisibilityTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/arrays/p44/TheatreVisibilityTest.java)
- Run from the project root: `./mvnw -Dtest=TheatreVisibilityTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(rows × columns) time and O(1) extra space. Tests check behavior, not a proof of complexity.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
