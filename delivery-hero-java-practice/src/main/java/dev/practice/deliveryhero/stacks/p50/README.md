# P50 — Stacks with leftmost push and rightmost pop

**Pattern:** stacks · **Time box:** 50 minutes  
**Evidence:** Reported · Glovo SE2 Barcelona. [S16](../../../../../../../../research/SOURCES.md#s16)

## Task and contract

Construct with positive capacity. push(value) uses the lowest-index stack with space, creating a new stack if necessary. pop() removes from the highest-index nonempty stack; popAt(index) removes from that exact stack. Empty/nonexistent/negative indices return -1, as does pop on an empty structure. Values are positive ints. Empty interior stacks keep their indices; never shift later stacks left. Up to 100,000 operations. The report names this exact data-structure task; these limits are authored.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

capacity 2; push 1,2,3; popAt(0)=2; push 9 fills stack 0.

## Work here

- Solution: [DinnerPlateStacks.java](DinnerPlateStacks.java)
- Tests: [DinnerPlateStacksTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/stacks/p50/DinnerPlateStacksTest.java)
- Run from the project root: `./mvnw -Dtest=DinnerPlateStacksTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

Aim for O(log numberOfStacks) updates; account for stale heap entries or trailing cleanup if used. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

Two different boundaries matter: the first available space and the last nonempty stack. Keep metadata consistent when a stack changes state.

</details>

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
