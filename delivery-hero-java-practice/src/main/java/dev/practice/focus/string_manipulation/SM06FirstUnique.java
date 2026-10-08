package dev.practice.focus.string_manipulation;

import java.util.*;

/*
 * SM06 — First non-repeated code point | 25 minutes
 * Evidence: Recommended string/Stream practice; not established as a DH question
 *
 * Return OptionalInt containing the first Unicode code point occurring exactly once, in encounter
 * order; empty if none. Case-sensitive, punctuation counts. Example "swiss" -> code point for w.
 * Unicode code points, not grapheme clusters. Target O(n) expected time and O(distinct code points)
 * space.
 *
 * Java Streams: Good fit: codePoints() and frequency counting, then encounter-order selection. chars()
 * splits supplementary characters; specify key ordering.
 *
 * Inputs and elements are non-null unless specified. Do not mutate inputs. Unless stated otherwise,
 * size <=100,000. Edge rules and tests are authored practice contracts.
 *
 * Run: ./mvnw -Dtest=SM06FirstUniqueTest test
 * Source STREAM: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html
 * Source COLLECT: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Collectors.html
 */
public class SM06FirstUnique {
    public OptionalInt find(String text) {
        throw new UnsupportedOperationException("TODO SM06: implement your solution");
    }
}
