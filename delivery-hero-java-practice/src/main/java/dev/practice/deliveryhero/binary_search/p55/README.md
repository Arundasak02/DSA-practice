# P55 — Map random tickets to weighted choices

**Pattern:** binary search · **Time box:** 30 minutes  
**Evidence:** Recommended · weighted random pick pattern. [S22](../../../../../../../../research/SOURCES.md#s22)

## Task and contract

Construct with a non-empty int[] of nonnegative weights, at least one positive. Copy/preprocess the weights; later caller mutations must not affect behavior. Given a uniformly sampled long ticket in [0,totalWeight), indexForTicket(ticket) returns the corresponding index when indices receive contiguous ranges whose lengths equal their weights. Zero-weight indices are never chosen. ≤100,000 weights; use long totals. The deterministic ticket API makes tests reliable; random-number generation is a follow-up.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

weights `[2,0,3]`: tickets 0,1 choose 0; tickets 2,3,4 choose 2.

## Work here

- Solution: [WeightedTicketPicker.java](WeightedTicketPicker.java)
- Tests: [WeightedTicketPickerTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/binary_search/p55/WeightedTicketPickerTest.java)
- Run from the project root: `./mvnw -Dtest=WeightedTicketPickerTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(n) preprocessing, O(log n) per ticket, O(n) space. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

Prerequisites: prefix sums and first-boundary-greater-than search. Do not use flaky statistical assertions for this mapping.

</details>

## Senior follow-up

Inject a source of uniformly distributed bounded long values. Explain why naive modulo reduction may bias the result.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
