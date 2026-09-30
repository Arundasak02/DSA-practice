# P62 — Implement an LFU cache

**Priority:** B — **Learn next** · Study order 19/65.

Candidate comment dated July 31, 2025 reports LFU for a Python role; not Senior Java.

**Pattern:** linked lists · **Time box:** 50 minutes

**Evidence:** Related-role report · Python; LRU tie-breaking authored. [S25](../../../../../../../../research/SOURCES.md#s25)

## Task and contract

Nonnegative capacity; negative capacity throws `IllegalArgumentException`. `get` returns `OptionalInt.empty()` on a miss; a hit increases that key's frequency. `put` of a new key starts frequency at 1; updating an existing key changes its value and increases frequency. At full capacity evict the lowest-frequency key; break ties by least recent successful get/put. Capacity zero stores nothing. All int keys/values, including -1, are valid. Single-threaded; concurrent access is a discussion extension.

The signatures, constraints, examples and tests are authored practice requirements, not a verbatim interview specification.

## Example

Capacity 2: put(1,10), put(2,20), get(1), put(3,30) evicts key 2.

## Work here

- Solution: [LfuCache.java](LfuCache.java)
- Tests: [LfuCacheTest.java](../../../../../../../test/java/dev/practice/deliveryhero/linked_lists/p62/LfuCacheTest.java)
- Run from the project root: `./mvnw -Dtest=LfuCacheTest test`
- Expected initially: red tests; implement the TODO methods.

## Performance target

O(1) average get/put; O(capacity) space. Complexity is a review criterion. Tests check behavior rather than proving complexity.

## Follow-up discussion

Clarify changed requirements and explain your invariants. Discuss thread safety for stateful components, memory limits for streams, and output-size costs for pair enumeration.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
