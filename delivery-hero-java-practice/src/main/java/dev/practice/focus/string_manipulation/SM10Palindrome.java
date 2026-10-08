package dev.practice.focus.string_manipulation;

import java.util.*;

/*
 * SM10 — Check normalized palindrome | 20 minutes
 * Evidence: Recommended string/two-pointer practice; not established as a DH question
 *
 * Input ASCII only. Ignore non-alphanumeric characters and letter case. Empty normalized input is a
 * palindrome. Example "A man, a plan, a canal: Panama" -> true. Target O(n) time, O(1) auxiliary space
 * for two-pointer approach.
 *
 * Java Streams: Possible to filter/lowercase code points then compare, with O(n) intermediate storage.
 * Two pointers avoid that allocation.
 *
 * Inputs and elements are non-null unless specified. Do not mutate inputs. Unless stated otherwise,
 * size <=100,000. Edge rules and tests are authored practice contracts.
 *
 * Run: ./mvnw -Dtest=SM10PalindromeTest test
 * Source STREAM: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html
 */
public class SM10Palindrome {
    public boolean check(String text) {
        throw new UnsupportedOperationException("TODO SM10: implement your solution");
    }
}
