# P02 — Find words with the same repetition pattern

**Pattern:** strings · **Time box:** 25 minutes  
**Evidence:** Reported · Berlin SE II. [S2](../../../../../../../../research/SOURCES.md#s2)

## Task and contract

Return candidates whose characters have a bijective position-wise mapping to the pattern. Preserve input order and duplicate entries. Strings contain lowercase ASCII letters, length 0..100; at most 10,000 candidates. A many-to-one mapping is not allowed.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`["foo", "bar", "egg"]`, pattern `"abb"` → `["foo", "egg"]`.

## Work here

- Solution: [PatternWords.java](PatternWords.java)
- Tests: [PatternWordsTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/strings/p02/PatternWordsTest.java)
- Run from the project root: `./mvnw -Dtest=PatternWordsTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(total candidate characters) time; bounded alphabet space. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

A forward mapping alone can accept two different letters mapped to the same letter.

</details>

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
