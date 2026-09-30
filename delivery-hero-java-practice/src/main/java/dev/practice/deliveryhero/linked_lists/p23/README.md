# P23 — Reverse a singly linked list

**Priority:** B — **Learn next** · Study order 26/65.

Reported foodpanda reversal; useful fundamental, different team.

**Pattern:** linked lists · **Time box:** 25 minutes  
**Evidence:** Reported · foodpanda software engineer, Singapore. [S17](../../../../../../../../research/SOURCES.md#s17)

## Task and contract

Reverse an acyclic singly linked list in-place and return its new head. Use the same Node instances, preserving their values. null represents empty. At most 100,000 nodes. Implement iteratively first.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`1 → 2 → 3 → null` becomes `3 → 2 → 1 → null`.

## Work here

- Solution: [ReverseList.java](ReverseList.java)
- Tests: [ReverseListTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/linked_lists/p23/ReverseListTest.java)
- Run from the project root: `./mvnw -Dtest=ReverseListTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(n) time, O(1) extra space. Tests check behavior, not a proof of complexity.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:

## Reported follow-up

The foodpanda account also names recursive reversal. Implement it as a second method after the iterative solution, explaining why a long list can overflow the Java call stack. The supplied tests currently target the iterative method.
