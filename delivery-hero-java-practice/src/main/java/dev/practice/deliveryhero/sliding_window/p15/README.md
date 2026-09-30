# P15 — Longest substring without repeated characters

**Priority:** C — **Insurance** · Study order 35/65.

Recommended transferable pattern; no strong evidence for this exact Delivery Hero task.

**Pattern:** sliding window · **Time box:** 25 minutes  
**Evidence:** Recommended. Curriculum recommendation; not claimed as a Delivery Hero question.

## Task and contract

Return the length of the longest contiguous substring with no repeated characters. ASCII input, length 0..100,000.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`"pwwkew" → 3`

## Work here

- Solution: [LongestUniqueSubstring.java](LongestUniqueSubstring.java)
- Tests: [LongestUniqueSubstringTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/sliding_window/p15/LongestUniqueSubstringTest.java)
- Run from the project root: `./mvnw -Dtest=LongestUniqueSubstringTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(n) time, O(alphabet) space. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

The left boundary of a valid window must never move backward.

</details>

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
