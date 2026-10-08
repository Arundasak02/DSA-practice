package dev.practice.focus.string_manipulation;

import java.util.*;

/*
 * SM05 — Compare OCR encodings | 40 minutes
 * Evidence: Reported: Berlin SE2/SSE1 2021; numeric grammar reconstructed
 *
 * Encodings contain ASCII letters and maximal decimal runs. Each run is ONE positive wildcard count;
 * no leading zero. A wildcard stands for one letter. Return whether both can describe the same string,
 * case-sensitive. Empty allowed; expanded lengths <=10^12. Do not expand. This is not ambiguous digit
 * partitioning. Target linear encoded time, O(1) auxiliary space.
 *
 * Java Streams: Poor fit: comparing variable-length logical runs requires coordinated state. Use a
 * scanner/two pointers and long counters.
 *
 * Inputs and elements are non-null unless specified. Do not mutate inputs. Unless stated otherwise,
 * size <=100,000. Edge rules and tests are authored practice contracts.
 *
 * Run: ./mvnw -Dtest=SM05OcrStringsTest test
 * Source DH1: https://leetcode.com/discuss/post/1413476/delivery-hero-se2sse1-berlin-august-2021-awaiting-result/
 */
public class SM05OcrStrings {
    public boolean compatible(String left, String right) {
        throw new UnsupportedOperationException("TODO SM05: implement your solution");
    }
}
