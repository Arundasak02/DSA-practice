package dev.practice.focus.string_manipulation;

import java.util.*;

/*
 * SM01 — Count words | 15 minutes
 * Evidence: Reported: Berlin SE2/SSE1 2021 and SEII 2022
 *
 * Count maximal runs of characters for which Character.isWhitespace(char) is false. BMP input only.
 * Null and empty return 0. Punctuation is part of a word. Example: "buy low" -> 2. Target O(n) time;
 * loop version O(1) auxiliary space.
 *
 * Java Streams: Possible via tokenization followed by counting, but a loop is clearer and avoids token
 * allocation. Match the exact whitespace contract; default regex \s is not identical.
 *
 * Inputs and elements are non-null unless specified. Do not mutate inputs. Unless stated otherwise,
 * size <=100,000. Edge rules and tests are authored practice contracts.
 *
 * Run: ./mvnw -Dtest=SM01WordCountingTest test
 * Source DH1: https://leetcode.com/discuss/post/1413476/delivery-hero-se2sse1-berlin-august-2021-awaiting-result/
 * Source DH2: https://leetcode.com/discuss/post/2034030/delivery-hero-software-engineer-ii-berlin-mar-2022-offer-declined/
 */
public class SM01WordCounting {
    public int count(String text) {
        throw new UnsupportedOperationException("TODO SM01: implement your solution");
    }
}
