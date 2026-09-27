# P39 — Mask every second character of each word

**Pattern:** strings · **Time box:** 15 minutes  
**Evidence:** Reported · Delivery Hero Android; boundaries defined for practice. [S12](../../../../../../../../research/SOURCES.md#s12)

## Task and contract

Replace characters at positions 2,4,6,... within each word with the supplied symbol. A word is a maximal sequence of non-whitespace BMP chars, using Character.isWhitespace(char). Preserve all whitespace exactly. Punctuation counts as a character. Input ≤100,000 chars; replacement symbol is not whitespace. Position resets for each word.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`"java coder", '*' → "j*v* c*d*r"`

## Work here

- Solution: [MaskAlternateCharacters.java](MaskAlternateCharacters.java)
- Tests: [MaskAlternateCharactersTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/strings/p39/MaskAlternateCharactersTest.java)
- Run from the project root: `./mvnw -Dtest=MaskAlternateCharactersTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(n) time, O(n) output space. Tests check behavior, not a proof of complexity.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
