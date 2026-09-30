# P59 — Count right-and-down grid paths

**Priority:** LAST — **Learn last** · Study order 64/65.

General DP/secondary tag evidence; lower return under a short deadline.

**Pattern:** dynamic programming · **Time box:** 25 minutes  
**Evidence:** Recommended · secondary company-tag signal, not verified report. [S22](../../../../../../../../research/SOURCES.md#s22)

## Task and contract

Count paths from top-left to bottom-right of a rows×cols grid when each move goes one cell right or down. Dimensions 0..100; a zero dimension has zero paths. Return BigInteger because counts may exceed long. No obstacles.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

2×3 grid → 3 paths.

## Work here

- Solution: [UniqueGridPaths.java](UniqueGridPaths.java)
- Tests: [UniqueGridPathsTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/dynamic_programming/p59/UniqueGridPathsTest.java)
- Run from the project root: `./mvnw -Dtest=UniqueGridPathsTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(rows×cols) DP transitions and O(min(rows,cols)) cells; acknowledge BigInteger operation costs. Tests check behavior, not a proof of complexity.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
