# P58 — Extensible delivery pricing rules

**Pattern:** practical · **Time box:** 40 minutes  
**Evidence:** Adapted format · HungerStation OOP/design-pattern coding; domain authored. [S19](../../../../../../../../research/SOURCES.md#s19)

## Task and contract

quote(mode,distanceKm,subtotalCents,member) returns nonnegative long cents. Valid modes: STANDARD and EXPRESS. Distances are whole km from 0..10,000; subtotal 0..10^12. STANDARD: base 200 plus 50 per km beyond 3; waive the entire fee when subtotal≥3000. EXPRESS: base 500 plus 100 per km beyond 3; never waived by subtotal. Members receive 20% off the computed fee, rounded HALF_UP to whole cents. Inputs valid. Start with these two modes and structure the code so another pricing strategy can be added without duplicating shared validation/discount rules. Tests verify behavior; use the follow-up as the design review.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

STANDARD, 5km, subtotal 2000, non-member → 300 cents.

## Work here

- Solution: [DeliveryPricing.java](DeliveryPricing.java)
- Tests: [DeliveryPricingTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/practical/p58/DeliveryPricingTest.java)
- Run from the project root: `./mvnw -Dtest=DeliveryPricingTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(1) calculation per quote; prefer testable composition over speculative abstractions. Tests check behavior, not a proof of complexity.

## Senior follow-up

Add scheduled delivery and a distance-based surcharge as new requirements. Show where the change belongs and which existing tests should remain unchanged.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
