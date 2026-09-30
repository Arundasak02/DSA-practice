# P61 — Convert camelCase to snake_case

**Priority:** A — **Learn first** · Study order 3/65.

Reported Senior SWE camelCase-to-snake_case task; acronym rules are authored.

**Pattern:** strings · **Time box:** 25 minutes

**Evidence:** Reported · Senior SWE; acronym rules authored. [S24](../../../../../../../../research/SOURCES.md#s24)

## Task and contract

Input contains only ASCII letters, digits and underscores; null is invalid (`NullPointerException`). Empty input returns empty. Preserve existing underscores and digits. Lowercase all letters. Before an uppercase letter insert an underscore when its predecessor is lowercase/digit, or when its predecessor is uppercase and its successor is lowercase. Do not insert after an existing underscore or at position zero. This keeps acronym runs together. Input length 0..100,000.

The signatures, constraints, examples and tests are authored practice requirements, not a verbatim interview specification.

## Example

`deliveryHeroOrder → delivery_hero_order`; `HTTPServer → http_server`; `orderID → order_id`.

## Work here

- Solution: [SnakeCase.java](SnakeCase.java)
- Tests: [SnakeCaseTest.java](../../../../../../../test/java/dev/practice/deliveryhero/strings/p61/SnakeCaseTest.java)
- Run from the project root: `./mvnw -Dtest=SnakeCaseTest test`
- Expected initially: red tests; implement the TODO methods.

## Performance target

O(n) time and O(n) output space. Tests check behavior rather than proving complexity.

## Follow-up discussion

Clarify changed requirements and explain your invariants. Discuss thread safety for stateful components, memory limits for streams, and output-size costs for pair enumeration.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
