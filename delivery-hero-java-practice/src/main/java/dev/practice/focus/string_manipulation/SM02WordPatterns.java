package dev.practice.focus.string_manipulation;

import java.util.*;

/*
 * SM02 — Match character-repetition patterns | 25 minutes
 * Evidence: Reported: Berlin SEII 2022
 *
 * Return words matching the pattern under a bijection of characters. Lowercase ASCII, including empty
 * strings. Preserve input order and duplicates. Example pattern abb: [mee,abc,mee] -> [mee,mee].
 * Target O(total word characters).
 *
 * Java Streams: Good for filtering the list with a pure matches(word,pattern) helper. Implement the
 * bijection inside that helper with local maps; avoid shared mutable state.
 *
 * Inputs and elements are non-null unless specified. Do not mutate inputs. Unless stated otherwise,
 * size <=100,000. Edge rules and tests are authored practice contracts.
 *
 * Run: ./mvnw -Dtest=SM02WordPatternsTest test
 * Source DH2: https://leetcode.com/discuss/post/2034030/delivery-hero-software-engineer-ii-berlin-mar-2022-offer-declined/
 */
public class SM02WordPatterns {
    public List<String> match(List<String> words, String pattern) {
        throw new UnsupportedOperationException("TODO SM02: implement your solution");
    }
}
