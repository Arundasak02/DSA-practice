# P38 — Shortest route in an unweighted graph

**Pattern:** graphs · **Time box:** 30 minutes  
**Evidence:** Recommended. Curriculum recommendation; not claimed as a Delivery Hero question.

## Task and contract

Nodes are 0..nodeCount-1. Each edge [a,b] is undirected and costs one hop. Return the shortest number of edges from start to target, or -1 if unreachable. Valid indices, 1..100,000 nodes, ≤200,000 edges; self-loops and duplicate edges allowed. start=target gives zero.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

Edges 0—1—2: distance(0,2) = 2.

## Work here

- Solution: [ShortestUnweightedPath.java](ShortestUnweightedPath.java)
- Tests: [ShortestUnweightedPathTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/graphs/p38/ShortestUnweightedPathTest.java)
- Run from the project root: `./mvnw -Dtest=ShortestUnweightedPathTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(V+E) time and space. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

BFS finds shortest paths when each edge has equal cost. Mark nodes on enqueue to avoid repeated expansion.

</details>

## Senior follow-up

For nonnegative weighted delivery times, what changes? For changing traffic, what makes a cached route stale?

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
