# P24 — Implement an LRU cache

**Pattern:** linked lists · **Time box:** 45 minutes  
**Evidence:** Recommended · cache design pattern. Curriculum recommendation; not claimed as a Delivery Hero question.

## Task and contract

Construct with capacity≥0. get(key) returns OptionalInt.empty() when absent, otherwise returns its value and marks it most recently used. put inserts or updates and marks most recent. Evict the least recently used entry if capacity is exceeded. Updating must not increase size. Capacity zero stores nothing. Arbitrary int keys/values; up to 100,000 operations. Single-threaded. Add your state fields and constructor logic.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

capacity=2: put(1,10), put(2,20), get(1), put(3,30) evicts key 2.

## Work here

- Solution: [LruCache.java](LruCache.java)
- Tests: [LruCacheTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/linked_lists/p24/LruCacheTest.java)
- Run from the project root: `./mvnw -Dtest=LruCacheTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

Expected O(1) get/put, O(capacity) space. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

Prerequisites: map lookups and unlinking/relinking nodes. For the first attempt, do not delegate eviction to LinkedHashMap.

</details>

## Senior follow-up

Explain why ConcurrentHashMap alone does not make a multi-step cache update atomic. Compare a lock with approximate eviction.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
