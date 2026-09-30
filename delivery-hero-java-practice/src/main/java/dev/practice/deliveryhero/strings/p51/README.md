# P51 — Compress consecutive character runs in-place

**Priority:** LAST — **Learn last** · Study order 58/65.

Secondary company-tag signal; underlying interview record unverified.

**Pattern:** strings · **Time box:** 25 minutes  
**Evidence:** Recommended · secondary company-tag signal, not verified report. [S22](../../../../../../../../research/SOURCES.md#s22)

## Task and contract

Compress an ASCII char array in-place. For each consecutive run, write its character followed by decimal count only when count>1. Return the written prefix length; remainder is irrelevant. Empty is valid; length ≤100,000. Unlike P45, nonadjacent equal characters stay separate.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`"aaabb" → prefix "a3b2"`, length 4.

## Work here

- Solution: [RunLengthCompression.java](RunLengthCompression.java)
- Tests: [RunLengthCompressionTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/strings/p51/RunLengthCompressionTest.java)
- Run from the project root: `./mvnw -Dtest=RunLengthCompressionTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(n) time, O(1) auxiliary space (bounded integer digit buffer allowed). Tests check behavior, not a proof of complexity.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
