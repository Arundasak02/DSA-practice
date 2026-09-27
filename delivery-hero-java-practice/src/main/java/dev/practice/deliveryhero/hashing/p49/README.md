# P49 — First non-repeating character

**Pattern:** hashing · **Time box:** 15 minutes  
**Evidence:** Recommended · useful short string round. Curriculum recommendation; not claimed as a Delivery Hero question.

## Task and contract

Return the index of the first character occurring exactly once in an ASCII string, or -1 if none. Length 0..100,000; case-sensitive.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`"swiss" → 1`

## Work here

- Solution: [FirstUniqueCharacter.java](FirstUniqueCharacter.java)
- Tests: [FirstUniqueCharacterTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/hashing/p49/FirstUniqueCharacterTest.java)
- Run from the project root: `./mvnw -Dtest=FirstUniqueCharacterTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(n) time, O(alphabet) state. Tests check behavior, not a proof of complexity.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
