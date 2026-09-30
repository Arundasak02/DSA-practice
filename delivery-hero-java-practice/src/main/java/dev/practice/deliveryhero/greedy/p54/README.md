# P54 — Fewest jumps to the last index

**Priority:** LAST — **Learn last** · Study order 61/65.

Minimum-jumps variant unverified; reported reachability is a separate task (P65).

**Pattern:** greedy · **Time box:** 30 minutes  
**Evidence:** Recommended · Jump Game II pattern. [S22](../../../../../../../../research/SOURCES.md#s22)

## Task and contract

values[i] is the maximum forward jump from i. Start at index 0 and return fewest jumps to reach the last index, or -1 if unreachable. Empty input returns -1; a single element returns zero. Nonnegative ints, length ≤100,000; jumps may exceed array length. Do not mutate input. Unlike the common online variant, reachability is not guaranteed.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`[2,3,1,1,4] → 2`

## Work here

- Solution: [MinimumJumps.java](MinimumJumps.java)
- Tests: [MinimumJumpsTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/greedy/p54/MinimumJumpsTest.java)
- Run from the project root: `./mvnw -Dtest=MinimumJumpsTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(n) time, O(1) space; prove why each chosen range corresponds to one jump. Tests check behavior, not a proof of complexity.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
