# SQL drills — learn before general trees/graphs/DP

The Java/backend candidate report names HAVING, range queries, locks and PostgreSQL/MySQL comparison. These concrete schemas and scenarios are authored practice drills, not recovered exact questions. See [S23](research/SOURCES.md#s23). P47 already provides a runnable join exercise; these drills are written query and discussion exercises.

## Shared practice schema

```sql
CREATE TABLE orders (
    id BIGINT PRIMARY KEY,
    customer_id BIGINT NOT NULL,
    created_at TIMESTAMP NOT NULL,
    status VARCHAR(20) NOT NULL,
    amount_cents BIGINT NOT NULL
);
CREATE TABLE inventory (
    product_id BIGINT PRIMARY KEY,
    available INTEGER NOT NULL CHECK (available >= 0)
);
```

## SQL01 — GROUP BY and HAVING

For a chosen day, return customers with at least three completed orders and a total completed-order amount above 10,000 cents. Return customer ID, order count and total amount. Include only orders in that day's half-open interval [start, next-day start), with status COMPLETED.

Explain which predicates belong in WHERE and which in HAVING. Test exactly three orders, totals exactly at the threshold, cancelled orders, and midnight boundaries. Decide the timezone that defines a business day before converting it to timestamps.

## SQL02 — Indexed range query

Return the latest 100 completed orders for a given customer in a half-open date interval, sorted by created_at descending then ID descending. Propose an index, explain its column order and compare query plans for selective and wide ranges. Explain how a function on the filtered timestamp can affect index use.

Discuss keyset pagination versus large OFFSET values. The index choice depends on the workload and data distribution; an index proposal alone does not establish performance.

## SQL03 — Transaction and row-lock scenario

One inventory row has available = 1. Two requests concurrently attempt to reserve its final unit. Describe a transaction that permits exactly one reservation and never stores negative inventory.

Discuss a conditional atomic update versus SELECT FOR UPDATE, checking affected-row counts, deadlocks when reserving multiple products, transaction boundaries, lock ordering and bounded retries. Add request idempotency to distinguish a retry from a second purchase. For database-specific locking experiments use PostgreSQL; the existing H2 tests do not establish PostgreSQL lock behaviour.

## SQL04 — PostgreSQL versus MySQL

Choose a database for an order service needing transactional writes, indexed customer/date lookups and periodic aggregation. Explain the requirements that decide your choice, operational experience, execution-plan investigation and concurrency behaviour. Identify what evidence would change your decision.

Avoid a universal winner. Be able to defend a familiar database first, then discuss a concrete feature or operational constraint that would justify a different one.

## Completion

- [ ] Write SQL01 and SQL02 from a blank editor and explain expected rows.
- [ ] Walk through both concurrent SQL03 requests and a failed retry.
- [ ] Explain SQL04 with a workload and measurable trade-offs.
- [ ] Revisit [P47 joins](src/main/java/dev/practice/deliveryhero/sql/p47/README.md) and [P46 salary ranking](src/main/java/dev/practice/deliveryhero/sql/p46/README.md).
