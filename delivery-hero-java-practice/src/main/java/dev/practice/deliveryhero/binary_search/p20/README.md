# P20 — Minimum rate to finish independent batches

**Pattern:** binary search · **Time box:** 35 minutes  
**Evidence:** Recommended · Koko-style pattern. Curriculum recommendation; not claimed as a Delivery Hero question.

## Task and contract

Each positive int is a batch size. In one hour, process up to rate items from exactly one batch; unused capacity cannot move to another batch that hour. Return the minimum positive integer rate that completes all batches within hours. Non-empty array of at most 100,000 batches; hours≥number of batches and ≤10^12.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`[3,6,7,11], 8 hours → 4`

## Work here

- Solution: [MinimumProcessingRate.java](MinimumProcessingRate.java)
- Tests: [MinimumProcessingRateTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/binary_search/p20/MinimumProcessingRateTest.java)
- Run from the project root: `./mvnw -Dtest=MinimumProcessingRateTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(n log(max batch)) time and O(1) extra space. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

Prerequisite: binary search over a monotonic feasibility predicate; calculate total hours using long.

</details>

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
