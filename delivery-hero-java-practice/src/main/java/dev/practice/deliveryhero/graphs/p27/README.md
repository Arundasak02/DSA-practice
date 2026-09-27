# P27 — Count islands in a grid

**Pattern:** graphs · **Time box:** 25 minutes  
**Evidence:** Recommended. Curriculum recommendation; not claimed as a Delivery Hero question.

## Task and contract

Count connected components of '1' cells in a rectangular grid of '0' and '1'. Only up/down/left/right adjacency counts. Grid may have zero rows or zero columns. At most 100,000 cells. Do not mutate the grid; avoid stack overflow on a long component.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`[[1,0],[0,1]] → 2`, because diagonals do not connect.

## Work here

- Solution: [NumberOfIslands.java](NumberOfIslands.java)
- Tests: [NumberOfIslandsTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/graphs/p27/NumberOfIslandsTest.java)
- Run from the project root: `./mvnw -Dtest=NumberOfIslandsTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(rows × columns) time and space. Tests check behavior, not a proof of complexity.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
