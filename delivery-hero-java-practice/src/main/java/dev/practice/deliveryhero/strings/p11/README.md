# P11 — Validate a word abbreviation

**Pattern:** strings · **Time box:** 25 minutes  
**Evidence:** Related-role report · senior automation, location not established. [S6](../../../../../../../../research/SOURCES.md#s6)

## Task and contract

word contains lowercase ASCII letters. abbr contains lowercase letters and decimal digits. Each maximal numeric run skips that many characters; leading zeros and zero runs are invalid. Return true only if all input is consumed exactly. Empty word and abbreviation are allowed. Lengths ≤100,000; numeric runs may exceed long, and must return false instead of overflowing.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`"substitution", "s10n" → true`

## Work here

- Solution: [ValidAbbreviation.java](ValidAbbreviation.java)
- Tests: [ValidAbbreviationTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/strings/p11/ValidAbbreviationTest.java)
- Run from the project root: `./mvnw -Dtest=ValidAbbreviationTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(word length + abbreviation length) time, O(1) space. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

A parsed count larger than the remaining word length is already enough to reject.

</details>

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
