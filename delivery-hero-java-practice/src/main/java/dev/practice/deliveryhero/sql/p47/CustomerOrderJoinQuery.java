package dev.practice.deliveryhero.sql.p47;

import java.util.*;
import java.util.concurrent.*;
import java.math.*;

/*
 * P47 — Join customers with their orders | 25 minutes
 * Evidence: Adapted · Delivery Hero senior Python SQL join report.
 *
 * Return one SQL SELECT statement from query(). Schema: customers(id INT PRIMARY KEY, name
 * VARCHAR(100)); orders(id INT PRIMARY KEY, customer_id INT REFERENCES customers(id), total_cents
 * BIGINT). Return customer_id, customer_name, order_id, total_cents in that column order. Include
 * every customer, including those without orders (NULL for both order fields), one row per order
 * otherwise. Sort by customer id then order id ascending. Preserve distinct customers sharing the same
 * name. No writes or multiple statements. Tests run H2 in memory; outer-join behavior is an authored
 * extension of the vague two-table report.
 *
 * Inputs/elements are non-null unless stated. Do not mutate inputs unless allowed. Edge rules and
 * tests are practice specifications.
 *
 * Example: One customer and no orders → one row with NULL order fields.
 * Target: Explain join cardinality, indexes and why grouping by customer name would be wrong.
 * Discuss after solving: Add an order-status filter while retaining customers with no matching orders.
 * Explain why filter placement matters.
 *
 * Run: ./mvnw -Dtest=CustomerOrderJoinQueryTest test
 * Source S11: https://www.glassdoor.com/Interview/Delivery-Hero-Interview-Questions-E504556.htm?filter.jobTitleExact=%28Senior%29+Software+Engineer+%28Python%29
 */
public class CustomerOrderJoinQuery {

    public String query() {
        throw new UnsupportedOperationException("TODO P47: implement your solution");
    }
}
