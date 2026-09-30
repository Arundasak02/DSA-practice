# P01 — Count words

**Priority:** A — **Learn first** · Study order 4/65.

Reported word-count task in backend accounts; clarify boundaries and test.

**Pattern:** strings · **Time box:** 15 minutes  
**Evidence:** Reported · Berlin SE2/SSE1 and SE II. [S1](../../../../../../../../research/SOURCES.md#s1); [S2](../../../../../../../../research/SOURCES.md#s2)

## Task and contract

Return the number of maximal runs of characters that are not `Character.isWhitespace(char)`. Empty input has zero words. Punctuation belongs to its word; repeated spaces, tabs and newlines separate words. Inputs contain BMP characters only, at most 100,000 chars. First solve without regex or `split`; then discuss the library alternative.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`"  buy\tlow\nsell high " → 4`

## Work here

- Solution: [WordCount.java](WordCount.java)
- Tests: [WordCountTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/strings/p01/WordCountTest.java)
- Run from the project root: `./mvnw -Dtest=WordCountTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(n) time, O(1) extra space. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

Track whether you are entering a word. Java whitespace is a contract choice; do not silently substitute ASCII-space-only behavior.

</details>

## Senior follow-up

How would you process a Reader in chunks when a word spans buffers?

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
