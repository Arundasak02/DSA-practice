# P03 — Compare OCR strings with unknown runs

**Priority:** A — **Learn first** · Study order 8/65.

Reported OCR compatibility task; numeric grammar is authored for practice.

**Pattern:** strings · **Time box:** 40 minutes  
**Evidence:** Reported · Berlin SE2/SSE1; grammar reconstructed. [S1](../../../../../../../../research/SOURCES.md#s1)

## Task and contract

An encoding contains ASCII letters and maximal decimal runs. Each run is ONE positive wildcard count (e.g. `12` means twelve unknown letters, never 1 then 2). No zero or leading zeros; inputs are valid. A wildcard matches exactly one letter. Return whether both encodings can describe the same concrete string. Case-sensitive. Empty encodings are valid. Encoded length ≤100,000; expanded length ≤10^12. Do not expand the strings. This is NOT the ambiguous digit-partition version of LeetCode 2060.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`"B2D"` and `"1C2"` can both represent `"BCAD"`.

## Work here

- Solution: [OcrCompatibility.java](OcrCompatibility.java)
- Tests: [OcrCompatibilityTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/strings/p03/OcrCompatibilityTest.java)
- Run from the project root: `./mvnw -Dtest=OcrCompatibilityTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(encoded input length) time and O(1) additional space. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

Prerequisites: scanning numeric tokens and using long counters. Compare logical positions, not encoded indices.

</details>

## Senior follow-up

Ask the interviewer about numeric tokenization before coding; allowing digit partitions changes the problem substantially.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
