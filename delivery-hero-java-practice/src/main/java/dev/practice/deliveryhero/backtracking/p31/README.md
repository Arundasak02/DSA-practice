# P31 — Find a word along a grid path

**Pattern:** backtracking · **Time box:** 40 minutes  
**Evidence:** Recommended. Curriculum recommendation; not claimed as a Delivery Hero question.

## Task and contract

Return whether word can be formed using horizontally or vertically adjacent cells without reusing any cell within one path. Case-sensitive ASCII letters. Empty word returns true, even on an empty board. Rectangular board ≤6×6; word length ≤15. Restore the board if you temporarily modify it.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`[[A,B],[C,D]], "ABD" → true`

## Work here

- Solution: [WordSearch.java](WordSearch.java)
- Tests: [WordSearchTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/backtracking/p31/WordSearchTest.java)
- Run from the project root: `./mvnw -Dtest=WordSearchTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

State an exponential upper bound, e.g. O(rows × columns × 4^wordLength), and O(wordLength) path space if marking in-place. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

A visited cell belongs to the current path, not permanently to the entire search.

</details>

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
