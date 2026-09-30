# P13 — Keep at most two copies in a sorted array

**Priority:** B — **Learn next** · Study order 33/65.

Ambiguous reported duplicate-removal wording; retaining two sorted copies is an adaptation.

**Pattern:** arrays · **Time box:** 25 minutes  
**Evidence:** Adapted · older SE II report; original wording ambiguous. [S7](../../../../../../../../research/SOURCES.md#s7)

## Task and contract

Given a nondecreasing int array, retain at most two copies of each value in-place. Return logical length m. The first m elements must be the retained sorted sequence; values after m are irrelevant. Length 0..100,000. The source mentions removing values repeated three or more times without extra space, but does not establish sortedness or whether all copies should be removed. This is one explicit practice variant.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`[1,1,1,2] → length 3, prefix [1,1,2]`.

## Work here

- Solution: [LimitDuplicates.java](LimitDuplicates.java)
- Tests: [LimitDuplicatesTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/arrays/p13/LimitDuplicatesTest.java)
- Run from the project root: `./mvnw -Dtest=LimitDuplicatesTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(n) time, O(1) extra space. Tests check behavior, not a proof of complexity.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
