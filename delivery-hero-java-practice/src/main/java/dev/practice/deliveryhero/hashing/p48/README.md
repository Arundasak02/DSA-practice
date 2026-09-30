# P48 — Check whether two strings are anagrams

**Priority:** B — **Learn next** · Study order 23/65.

Reported Glovo senior anagram task; different team.

**Pattern:** hashing · **Time box:** 15 minutes  
**Evidence:** Reported · Glovo senior software engineer. [S15](../../../../../../../../research/SOURCES.md#s15)

## Task and contract

Return true when two ASCII strings have identical character multiplicities. Case-sensitive; spaces and punctuation count. Lengths ≤100,000. Empty strings are anagrams. Do not sort for your optimized solution.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`"listen", "silent" → true`

## Work here

- Solution: [AnagramCheck.java](AnagramCheck.java)
- Tests: [AnagramCheckTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/hashing/p48/AnagramCheckTest.java)
- Run from the project root: `./mvnw -Dtest=AnagramCheckTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(n+m) time and O(ASCII alphabet) extra space. Tests check behavior, not a proof of complexity.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
