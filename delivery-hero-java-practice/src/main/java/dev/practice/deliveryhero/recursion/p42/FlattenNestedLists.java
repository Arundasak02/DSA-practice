package dev.practice.deliveryhero.recursion.p42;

import java.util.*;
import java.util.concurrent.*;
import java.math.*;

/*
 * P42 — Flatten a nested list | 25 minutes
 * Evidence: Reported · Delivery Hero senior Python; recursive Java variant.
 *
 * Return integers in left-to-right depth-first order from an acyclic nested List<?> whose elements are
 * either Integer or another List<?>. Empty lists contribute nothing. Return an independent
 * List<Integer> and do not mutate input. At most 100,000 total elements, depth ≤100. Arbitrary nesting
 * is a practice extension: the report only states a list-of-lists task.
 *
 * Inputs/elements are non-null unless stated. Do not mutate inputs unless allowed. Edge rules and
 * tests are practice specifications.
 *
 * Example: [1,[2,[],[3]],4] → [1,2,3,4]
 * Target: O(total elements) time, O(depth) traversal state plus output.
 * Discuss after solving: Add a lazy iterator that does not materialize all values. How would you
 * handle cyclic input?
 *
 * Run: ./mvnw -Dtest=FlattenNestedListsTest test
 * Source S11: https://www.glassdoor.com/Interview/Delivery-Hero-Interview-Questions-E504556.htm?filter.jobTitleExact=%28Senior%29+Software+Engineer+%28Python%29
 */
public class FlattenNestedLists {

    public List<Integer> flatten(List<?> nested) {
        throw new UnsupportedOperationException("TODO P42: implement your solution");
    }
}
