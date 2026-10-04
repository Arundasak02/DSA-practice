package dev.practice.deliveryhero.recursion.p12;

import java.util.*;
import java.util.concurrent.*;
import java.math.*;

/*
 * P12 — Convert nested map keys to camelCase | 35 minutes
 * Evidence: Related-company report · Glovo Spain; Java attempt.
 *
 * Return a deep copy of a nested Map<String,Object>, converting every key from snake_case to
 * camelCase. Keys follow [a-z]+(_[a-z]+)* or are already lowerCamelCase without underscores. Values
 * are strings or nested maps only; maps are acyclic, depth ≤100. Preserve strings unchanged. If two
 * keys in the same map convert to the same key, throw IllegalArgumentException. Output key order is
 * unrestricted. Do not mutate or reuse mutable input maps.
 *
 * Inputs/elements are non-null unless stated. Do not mutate inputs unless allowed. Edge rules and
 * tests are practice specifications.
 *
 * Example: {user_info: {first_name: "Arun"}} → {userInfo: {firstName: "Arun"}}
 * Target: O(total key characters + map entries) time; O(output + recursion depth) space.
 * Discuss after solving: Extend to lists, null values and cycle detection only after clarifying a new
 * contract.
 *
 * Run: ./mvnw -Dtest=CamelCaseMapTest test
 * Source S5: https://leetcode.com/discuss/post/6976664/interview-experience-software-engineer-b-s19v/
 */
public class CamelCaseMap {

    public Map<String,Object> convert(Map<String,Object> input) {
        throw new UnsupportedOperationException("TODO P12: implement your solution");
    }
}
