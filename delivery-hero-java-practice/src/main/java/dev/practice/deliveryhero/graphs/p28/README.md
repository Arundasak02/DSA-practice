# P28 — Detect cyclic dependencies

**Pattern:** graphs · **Time box:** 35 minutes  
**Evidence:** Recommended. Curriculum recommendation; not claimed as a Delivery Hero question.

## Task and contract

Courses are 0..count-1. Each pair [course, prerequisite] means prerequisite must be completed first. Return whether all courses can finish. Duplicate edges may appear and self-dependencies form cycles. Count 0..100,000, at most 200,000 edges. Valid indices only.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`count=2, [[1,0],[0,1]] → false`

## Work here

- Solution: [CourseSchedule.java](CourseSchedule.java)
- Tests: [CourseScheduleTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/graphs/p28/CourseScheduleTest.java)
- Run from the project root: `./mvnw -Dtest=CourseScheduleTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(V+E) time and space. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

Prerequisites: adjacency lists and either indegrees or three-color visitation. A visited set alone cannot distinguish a completed node from an active ancestor.

</details>

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
