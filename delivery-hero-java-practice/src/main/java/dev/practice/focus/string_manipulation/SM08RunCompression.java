package dev.practice.focus.string_manipulation;

import java.util.*;

/*
 * SM08 — Encode consecutive runs | 25 minutes
 * Evidence: Recommended string scanning; not established as a DH question
 *
 * ASCII letters only. Encode EVERY maximal consecutive run as letter followed by decimal count, even
 * count 1. Empty -> empty. aaabbc -> a3b2c1; abba -> a1b2a1. Target O(n) time plus output storage.
 *
 * Java Streams: Poor fit: adjacent runs and boundary state are clearer in a loop; groupingBy loses run
 * boundaries.
 *
 * Inputs and elements are non-null unless specified. Do not mutate inputs. Unless stated otherwise,
 * size <=100,000. Edge rules and tests are authored practice contracts.
 *
 * Run: ./mvnw -Dtest=SM08RunCompressionTest test
 */
public class SM08RunCompression {
    public String encode(String text) {
        throw new UnsupportedOperationException("TODO SM08: implement your solution");
    }
}
