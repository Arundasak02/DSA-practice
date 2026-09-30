# P25 — Sum a BST value range

**Priority:** LAST — **Learn last** · Study order 48/65.

General interview coverage; no strong direct Delivery Hero evidence in the audit.

**Pattern:** trees · **Time box:** 25 minutes  
**Evidence:** Recommended. Curriculum recommendation; not claimed as a Delivery Hero question.

## Task and contract

Given a BST with unique int keys, sum values in inclusive [low,high] as long. low≤high. null root returns zero. At most 100,000 nodes; tree may be skewed, so avoid relying on deep recursion. Do not mutate nodes.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

BST with root 10, children 5 and 15; range [10,15] → 25.

## Work here

- Solution: [RangeSumBst.java](RangeSumBst.java)
- Tests: [RangeSumBstTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/trees/p25/RangeSumBstTest.java)
- Run from the project root: `./mvnw -Dtest=RangeSumBstTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(visited nodes), O(height) auxiliary traversal state; prune irrelevant branches. Tests check behavior, not a proof of complexity.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
