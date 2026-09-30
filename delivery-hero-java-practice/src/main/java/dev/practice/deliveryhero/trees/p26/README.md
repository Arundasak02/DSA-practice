# P26 — Traverse a binary tree level by level

**Priority:** LAST — **Learn last** · Study order 49/65.

General interview coverage; no strong direct Delivery Hero evidence in the audit.

**Pattern:** trees · **Time box:** 25 minutes  
**Evidence:** Recommended. Curriculum recommendation; not claimed as a Delivery Hero question.

## Task and contract

Return each level as a list of values, top to bottom and left to right. A general binary tree, not necessarily a BST. null returns an empty list. At most 100,000 nodes. Do not mutate the tree.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

root 1 with children 2 and 3 → `[[1],[2,3]]`.

## Work here

- Solution: [LevelOrder.java](LevelOrder.java)
- Tests: [LevelOrderTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/trees/p26/LevelOrderTest.java)
- Run from the project root: `./mvnw -Dtest=LevelOrderTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(n) time, O(maximum level width) traversal space, excluding output. Tests check behavior, not a proof of complexity.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
