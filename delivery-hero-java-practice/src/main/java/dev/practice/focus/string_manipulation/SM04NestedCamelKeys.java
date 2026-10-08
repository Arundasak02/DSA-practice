package dev.practice.focus.string_manipulation;

import java.util.*;

/*
 * SM04 — Convert nested map keys to camelCase | 35 minutes
 * Evidence: Reported: Glovo Spain backend; Java attempt, not Berlin
 *
 * Deep-copy an acyclic Map<String,Object> whose values are strings or nested maps (depth <=100). Keys
 * are snake_case lowercase words or already lowerCamelCase. Convert keys, keep string values
 * unchanged. Throw IllegalArgumentException on converted-key collisions in any map. Output map order
 * unrestricted. No mutable input-map reuse.
 *
 * Java Streams: Possible with entry streams plus recursion. A toMap merge rule must reject collisions;
 * a recursive loop is usually easier to explain.
 *
 * Inputs and elements are non-null unless specified. Do not mutate inputs. Unless stated otherwise,
 * size <=100,000. Edge rules and tests are authored practice contracts.
 *
 * Run: ./mvnw -Dtest=SM04NestedCamelKeysTest test
 * Source GLOVO: https://leetcode.com/discuss/post/6976664/interview-experience-software-engineer-b-s19v/
 */
public class SM04NestedCamelKeys {
    public Map<String,Object> convert(Map<String,Object> input) {
        throw new UnsupportedOperationException("TODO SM04: implement your solution");
    }
}
