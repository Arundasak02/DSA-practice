# P65 — Determine whether the last index is reachable

**Priority:** B — **Learn next** · Study order 21/65.

Senior SWE report names Jump Game reachability; Python context, separate from P54.

**Pattern:** greedy · **Time box:** 20 minutes

**Evidence:** Reported · Senior SWE in Python context; Java contract authored. [S27](../../../../../../../../research/SOURCES.md#s27)

## Task and contract

A non-null array gives the maximum forward jump from each index. Start at index 0; return whether you can reach the final index. An empty array returns false; any single-element array returns true. Entries are nonnegative ints; null throws `NullPointerException`. Length 0..100,000; do not mutate input. A very large entry must not overflow your reach calculation. This asks reachability, not minimum jumps (P54).

The signatures, constraints, examples and tests are authored practice requirements, not a verbatim interview specification.

## Example

`[2,3,1,1,4] → true`; `[3,2,1,0,4] → false`.

## Work here

- Solution: [JumpReachability.java](JumpReachability.java)
- Tests: [JumpReachabilityTest.java](../../../../../../../test/java/dev/practice/deliveryhero/greedy/p65/JumpReachabilityTest.java)
- Run from the project root: `./mvnw -Dtest=JumpReachabilityTest test`
- Expected initially: red tests; implement the TODO methods.

## Performance target

O(n) time and O(1) auxiliary space. Tests check behavior rather than proving complexity.

## Follow-up discussion

Clarify changed requirements and explain your invariants. Discuss thread safety for stateful components, memory limits for streams, and output-size costs for pair enumeration.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
