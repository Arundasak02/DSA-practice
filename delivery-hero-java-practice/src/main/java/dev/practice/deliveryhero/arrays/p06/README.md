# P06 — Minimum rotations of a combination lock

**Priority:** B — **Learn next** · Study order 24/65.

Reported senior Go lock task; weaker language match.

**Pattern:** arrays · **Time box:** 15 minutes  
**Evidence:** Reported · Berlin senior Go; wheel rules reconstructed. [S3](../../../../../../../../research/SOURCES.md#s3)

## Task and contract

Start with every wheel at 0. One move rotates exactly one wheel by one digit forward or backward, wrapping between 9 and 0. Return minimum moves to reach the digit string. No blocked states or coupled wheels. Valid ASCII digits only; length 0..100,000. The report mentions a three-digit lock; this exercise generalizes its size.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`"091" → 2`

## Work here

- Solution: [BriefcaseLock.java](BriefcaseLock.java)
- Tests: [BriefcaseLockTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/arrays/p06/BriefcaseLockTest.java)
- Run from the project root: `./mvnw -Dtest=BriefcaseLockTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(number of wheels) time, O(1) space. Tests check behavior, not a proof of complexity.

## Senior follow-up

How does adding forbidden combinations change the state-space model?

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
