# P21 — Validate bracket nesting

**Pattern:** stacks · **Time box:** 20 minutes  
**Evidence:** Reported · Glovo senior software engineer. [S15](../../../../../../../../research/SOURCES.md#s15)

## Task and contract

Input contains only (), [], {}. Return whether brackets are balanced and correctly nested. Empty string is valid; length ≤100,000.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`"([)]" → false`

## Work here

- Solution: [ValidBrackets.java](ValidBrackets.java)
- Tests: [ValidBracketsTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/stacks/p21/ValidBracketsTest.java)
- Run from the project root: `./mvnw -Dtest=ValidBracketsTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(n) time, O(n) space. Tests check behavior, not a proof of complexity.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
