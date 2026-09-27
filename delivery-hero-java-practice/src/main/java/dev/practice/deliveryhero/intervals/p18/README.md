# P18 — Minimum simultaneous meeting rooms

**Pattern:** intervals · **Time box:** 25 minutes  
**Evidence:** Recommended. Curriculum recommendation; not claimed as a Delivery Hero question.

## Task and contract

Each row is a half-open interval [start,end), start<end, arbitrary int endpoints. Return the maximum simultaneous meetings. An ending meeting releases its room at its end time. Input is unsorted and must remain unchanged. At most 100,000 rows.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`[[0,10],[5,7],[7,12]] → 2`

## Work here

- Solution: [MeetingRooms.java](MeetingRooms.java)
- Tests: [MeetingRoomsTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/intervals/p18/MeetingRoomsTest.java)
- Run from the project root: `./mvnw -Dtest=MeetingRoomsTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(n log n) time, O(n) space. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

Contrast this boundary rule with P17 before reusing its comparison.

</details>

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
