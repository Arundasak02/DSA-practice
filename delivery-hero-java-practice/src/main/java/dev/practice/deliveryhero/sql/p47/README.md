# P47 — Join customers with their orders

**Pattern:** sql · **Time box:** 25 minutes  
**Evidence:** Adapted · Delivery Hero senior Python SQL join report. [S11](../../../../../../../../research/SOURCES.md#s11)

## Task and contract

Return one SQL SELECT statement from query(). Schema: customers(id INT PRIMARY KEY, name VARCHAR(100)); orders(id INT PRIMARY KEY, customer_id INT REFERENCES customers(id), total_cents BIGINT). Return customer_id, customer_name, order_id, total_cents in that column order. Include every customer, including those without orders (NULL for both order fields), one row per order otherwise. Sort by customer id then order id ascending. Preserve distinct customers sharing the same name. No writes or multiple statements. Tests run H2 in memory; outer-join behavior is an authored extension of the vague two-table report.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

One customer and no orders → one row with NULL order fields.

## Work here

- Solution: [CustomerOrderJoinQuery.java](CustomerOrderJoinQuery.java)
- Tests: [CustomerOrderJoinQueryTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/sql/p47/CustomerOrderJoinQueryTest.java)
- Run from the project root: `./mvnw -Dtest=CustomerOrderJoinQueryTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

Explain join cardinality, indexes and why grouping by customer name would be wrong. Tests check behavior, not a proof of complexity.

## Senior follow-up

Add an order-status filter while retaining customers with no matching orders. Explain why filter placement matters.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
