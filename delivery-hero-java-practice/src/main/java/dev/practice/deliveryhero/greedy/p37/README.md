# P37 — Minimum cost with equal city quotas

**Pattern:** greedy · **Time box:** 30 minutes  
**Evidence:** Recommended. Curriculum recommendation; not claimed as a Delivery Hero question.

## Task and contract

There are 2n people. costs[i]=[costToA,costToB], each cost 0..10^9. Send exactly n people to each city and return minimum total cost as long. An empty matrix costs zero; at most 100,000 people, always even. Do not mutate input.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`[[10,20],[30,200],[400,50],[30,20]] → 110`

## Work here

- Solution: [TwoCityScheduling.java](TwoCityScheduling.java)
- Tests: [TwoCitySchedulingTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/greedy/p37/TwoCitySchedulingTest.java)
- Run from the project root: `./mvnw -Dtest=TwoCitySchedulingTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(n log n) time; explain why local differences determine an optimal allocation. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

Compare the cost difference of sending a person to A versus B. A greedy choice needs an exchange argument.

</details>

## Senior follow-up

What if there are three cities or unequal capacity constraints?

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
