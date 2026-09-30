# P41 — Plan inserts, updates and removals

**Priority:** A — **Learn first** · Study order 10/65.

Reported senior React reconciliation topic; consistent contract is authored.

**Pattern:** hashing · **Time box:** 25 minutes  
**Evidence:** Adapted · Delivery Hero senior React; reported example inconsistent. [S10](../../../../../../../../research/SOURCES.md#s10)

## Task and contract

desired is the requested final sequence of unique integer IDs; existing is the current sequence of unique IDs. Return Plan(insertOrUpdate,remove): insertOrUpdate contains every desired ID in desired order; remove contains only existing IDs absent from desired, in existing order. Return independent lists; do not mutate inputs. Each list ≤100,000 IDs. The source's remove example contradicts normal synchronization semantics. This task deliberately chooses and documents set-difference semantics.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

desired `[1,2]`, existing `[2,3]` → upsert `[1,2]`, remove `[3]`.

## Work here

- Solution: [CollectionReconciler.java](CollectionReconciler.java)
- Tests: [CollectionReconcilerTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/hashing/p41/CollectionReconcilerTest.java)
- Run from the project root: `./mvnw -Dtest=CollectionReconcilerTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

Expected O(n+m) time and O(n+m) space. Tests check behavior, not a proof of complexity.

## Senior follow-up

How do version checks prevent a stale client from deleting rows added by another request?

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
