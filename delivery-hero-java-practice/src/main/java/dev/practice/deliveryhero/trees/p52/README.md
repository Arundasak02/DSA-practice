# P52 — Check completeness of a binary tree

**Priority:** LAST — **Learn last** · Study order 59/65.

Secondary company-tag signal; underlying interview record unverified.

**Pattern:** trees · **Time box:** 25 minutes  
**Evidence:** Recommended · secondary company-tag signal, not verified report. [S22](../../../../../../../../research/SOURCES.md#s22)

## Task and contract

Return true if all levels except possibly the last are full, and the last level is filled left to right without gaps. Empty tree is complete. At most 100,000 nodes; values irrelevant; no mutation.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

Root with only a right child is not complete.

## Work here

- Solution: [CompleteBinaryTree.java](CompleteBinaryTree.java)
- Tests: [CompleteBinaryTreeTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/trees/p52/CompleteBinaryTreeTest.java)
- Run from the project root: `./mvnw -Dtest=CompleteBinaryTreeTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(n) time, O(width) auxiliary space. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

ArrayDeque does not accept null elements. Your traversal must represent a gap deliberately.

</details>

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
