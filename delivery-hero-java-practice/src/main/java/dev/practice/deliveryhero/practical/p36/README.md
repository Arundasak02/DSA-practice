# P36 — Debug a small invoice service

**Priority:** A — **Learn first** · Study order 12/65.

Reported Glovo debugging/test-fixing format; invoice service and defects are authored.

**Pattern:** practical · **Time box:** 30 minutes  
**Evidence:** Adapted · Glovo report describes debugging, actual service undisclosed. [S5](../../../../../../../../research/SOURCES.md#s5)

## Task and contract

This exercise deliberately starts with defective code. Fix calculate(lines,discountPercent) without altering the tests. Each Line has nonnegative long unitCents and positive int quantity. Sum line totals, then apply a whole-percent discount from 0..100 once to the subtotal. Round the final amount to nearest cent with HALF_UP. Reject an out-of-range discount with IllegalArgumentException. Empty lines cost zero. Subtotal and intermediate arithmetic fit in long; total ≤10^12 cents. No taxes, currency conversion or floating-point money. Up to 100,000 lines.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

101 cents discounted 10% = 90.9 cents, rounded to 91.

## Work here

- Solution: [InvoiceCalculator.java](InvoiceCalculator.java)
- Tests: [InvoiceCalculatorTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/practical/p36/InvoiceCalculatorTest.java)
- Run from the project root: `./mvnw -Dtest=InvoiceCalculatorTest test`
- Expected initially: some tests fail on the deliberately buggy implementation. Diagnose and fix it; a few passing cases do not mean the service is correct.

## Performance target

O(number of lines) time, O(1) additional space. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

Write the smallest counterexample for each defect before editing. Java integer division truncates.

</details>

## Senior follow-up

Explain error mapping, immutable domain models, dependency injection and observability. Identify which behavior belongs in a pure function.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
