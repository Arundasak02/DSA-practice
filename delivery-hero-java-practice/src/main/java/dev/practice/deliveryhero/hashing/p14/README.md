# P14 — Find two indices for a target

**Priority:** A — **Learn first** · Study order 1/65.

Senior SWE Two Sum report plus Android evidence; extend with P64.

**Pattern:** hashing · **Time box:** 20 minutes  
**Evidence:** Reported · Delivery Hero Senior SWE and mid-level Android. [S18](../../../../../../../../research/SOURCES.md#s18) [S27](../../../../../../../../research/SOURCES.md#s27)

## Task and contract

Return int[2] containing indices i<j whose values sum to target. Exactly one pair exists. Length 2..100,000; arbitrary ints, target is long. Do not reuse an index.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`[2,7,11], target 9 → [0,1]`

## Work here

- Solution: [TwoSum.java](TwoSum.java)
- Tests: [TwoSumTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/hashing/p14/TwoSumTest.java)
- Run from the project root: `./mvnw -Dtest=TwoSumTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

Expected O(n) time, O(n) space. Tests check behavior, not a proof of complexity.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:

## Duplicate-pairs follow-up

After solving the single-pair contract, practise [P64 — all index pairs](../../hashing/p64/README.md). Its all-pairs output contract is separate from this exercise.
