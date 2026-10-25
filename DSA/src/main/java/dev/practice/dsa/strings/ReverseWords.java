package dev.practice.dsa.strings;

/*
 * SM09 — Reverse word order | 15 minutes
 * Evidence: Recommended string manipulation; not established as a DH question
 *
 * ASCII spaces separate words; collapse repeated/leading/trailing spaces. Reverse word order, not
 * characters. Empty or all spaces -> empty. "  buy low " -> "low buy". O(n) time and output storage.
 *
 * Java Streams: Possible with tokenization, reversed indices and joining; a normal list reversal is
 * simpler. A Stream has no general reverse operation.
 *
 * Inputs and elements are non-null unless specified. Do not mutate inputs. Unless stated otherwise,
 * size <=100,000. Edge rules and tests are authored practice contracts.
 *
 * Run: ./mvnw -Dtest=ReverseWordsTest test
 */
public class ReverseWords {

  public String reverse(String text) {
    throw new UnsupportedOperationException("TODO SM09: implement your solution");
  }
}
