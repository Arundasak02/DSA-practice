# P64 — Return all Two-Sum index pairs with duplicates

**Priority:** A — **Learn first** · Study order 18/65.

Reported duplicate-index Two Sum task; complete output contract is authored.

**Pattern:** hashing · **Time box:** 30 minutes

**Evidence:** Adapted · reported duplicate-index task; full output contract authored. [S26](../../../../../../../../research/SOURCES.md#s26)

## Task and contract

For a non-null int array, return every pair (i,j) with i < j and mathematical sum values[i]+values[j] == target. Distinct index pairs remain distinct even when values match. Return pairs sorted by increasing second index, then increasing first index. Length 0..100,000. Target is long, so avoid overflow in sums/complements. Do not mutate input. Null throws `NullPointerException`. Output can be quadratic; do not claim O(n) total time when returning all pairs.

The signatures, constraints, examples and tests are authored practice requirements, not a verbatim interview specification.

## Example

`[1,1,2,23,4,9,13,6,9], 10 → [(0,5),(1,5),(4,7),(0,8),(1,8)]`.

## Work here

- Solution: [AllTwoSumPairs.java](AllTwoSumPairs.java)
- Tests: [AllTwoSumPairsTest.java](../../../../../../../test/java/dev/practice/deliveryhero/hashing/p64/AllTwoSumPairsTest.java)
- Run from the project root: `./mvnw -Dtest=AllTwoSumPairsTest test`
- Expected initially: red tests; implement the TODO methods.

## Performance target

Expected O(n+p) time; O(n) auxiliary space plus O(p) result, for p returned pairs. Tests check behavior rather than proving complexity.

## Follow-up discussion

Clarify changed requirements and explain your invariants. Discuss thread safety for stateful components, memory limits for streams, and output-size costs for pair enumeration.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
