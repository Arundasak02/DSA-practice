# P56 — Shortest route with nonnegative travel times

**Pattern:** graphs · **Time box:** 40 minutes  
**Evidence:** Recommended · fills weighted-graph gap. Curriculum recommendation; not claimed as a Delivery Hero question.

## Task and contract

Nodes are 0..n-1. Edge rows [from,to,weight] are DIRECTED; weights are nonnegative ints. Return minimum total weight from start to target as long, or -1 if unreachable. Start=target is zero. Parallel edges and self-loops allowed. 1≤n≤100,000; ≤200,000 edges. No mutation; all indices valid.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

0→2 costs 10; 0→1→2 costs 2+3; result 5.

## Work here

- Solution: [WeightedShortestPath.java](WeightedShortestPath.java)
- Tests: [WeightedShortestPathTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/graphs/p56/WeightedShortestPathTest.java)
- Run from the project root: `./mvnw -Dtest=WeightedShortestPathTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O((V+E) log(V+E)) with a binary heap and lazy duplicates; O(V+E) storage. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

Prerequisites: Dijkstra, a min-priority queue, relaxation, and ignoring stale queue entries. Explain why plain BFS is insufficient.

</details>

## Senior follow-up

What breaks with negative edges? How would you reconstruct the route?

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
