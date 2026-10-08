package dev.practice.focus.string_manipulation;

import java.util.*;

/*
 * SM03 — Convert camelCase to snake_case | 25 minutes
 * Evidence: Reported: Delivery Hero senior SWE; date/location unspecified
 *
 * ASCII letters/digits/underscores only. Insert underscore before uppercase when preceded by
 * lowercase/digit, or between an uppercase predecessor and a lowercase successor. Never insert after
 * underscore or at position 0. Lowercase letters; preserve existing underscores/digits. HTTPServer ->
 * http_server. O(n).
 *
 * Java Streams: Possible using an index IntStream and joining, but adjacent-character rules are
 * simpler with StringBuilder. Do not force a Stream solution.
 *
 * Inputs and elements are non-null unless specified. Do not mutate inputs. Unless stated otherwise,
 * size <=100,000. Edge rules and tests are authored practice contracts.
 *
 * Run: ./mvnw -Dtest=SM03CamelToSnakeTest test
 * Source DH3: https://www.glassdoor.co.uk/Interview/Q-Write-a-function-to-convert-camelCase-to-snake-case-QTN_6882053.htm
 */
public class SM03CamelToSnake {
    public String convert(String text) {
        throw new UnsupportedOperationException("TODO SM03: implement your solution");
    }
}
