# P29 — Deep-copy a graph with cycles

**Pattern:** graphs · **Time box:** 35 minutes  
**Evidence:** Recommended. Curriculum recommendation; not claimed as a Delivery Hero question.

## Task and contract

Clone all nodes reachable from start; null returns null. Node labels are not necessarily unique. Preserve neighbor order, duplicate edges and self-loops. Return new nodes and new neighbor lists with no original node references. At most 10,000 reachable nodes and 50,000 edges.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

Two nodes with the same label must still become two distinct cloned nodes.

## Work here

- Solution: [CloneGraph.java](CloneGraph.java)
- Tests: [CloneGraphTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/graphs/p29/CloneGraphTest.java)
- Run from the project root: `./mvnw -Dtest=CloneGraphTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(V+E) time and space. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

Map original node identity to clone identity, not label to clone.

</details>

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
