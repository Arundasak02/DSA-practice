# P22 — Decode nested repetitions

**Pattern:** stacks · **Time box:** 35 minutes  
**Evidence:** Recommended. Curriculum recommendation; not claimed as a Delivery Hero question.

## Task and contract

Decode valid expressions such as k[expression], allowing nested brackets and adjacent literal lowercase ASCII strings. Counts are positive integers without leading zeros. Empty expression is valid. Encoded length ≤10,000, nesting depth ≤100, decoded length ≤100,000. No malformed-input handling required.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`"2[a3[b]]" → "abbbabbb"`

## Work here

- Solution: [DecodeString.java](DecodeString.java)
- Tests: [DecodeStringTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/stacks/p22/DecodeStringTest.java)
- Run from the project root: `./mvnw -Dtest=DecodeStringTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

Output-sensitive runtime; explain the cost of nested copying. O(decoded length + nesting state) storage. Tests check behavior, not a proof of complexity.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
