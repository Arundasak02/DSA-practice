package dev.practice.deliveryhero.strings.p01;

/*
 * P01 — Count words | 15 minutes
 * Evidence: Reported · Berlin SE2/SSE1 and SE II.
 *
 * Return the number of maximal runs of characters that are not Character.isWhitespace(char). Empty
 * input has zero words. Punctuation belongs to its word; repeated spaces, tabs and newlines separate
 * words. Inputs contain BMP characters only, at most 100,000 chars. First solve without regex or
 * split; then discuss the library alternative.
 *
 * Inputs/elements are non-null unless stated. Do not mutate inputs unless allowed. Edge rules and
 * tests are practice specifications.
 *
 * Example: "  buy\tlow\nsell high " → 4
 * Target: O(n) time, O(1) additional space.
 * Discuss after solving: How would you process a Reader in chunks when a word spans buffers?
 * Existing worked approach (preserved): scan once; increment when entering a word.
 * inWord tracks whitespace boundaries. O(n) UTF-16 units, O(1) space; null returns zero.
 *
 * Run: ./mvnw -Dtest=WordCountTest test
 * Source S1: https://leetcode.com/discuss/post/1413476/delivery-hero-se2sse1-berlin-august-2021-awaiting-result/
 * Source S2: https://leetcode.com/discuss/post/2034030/delivery-hero-software-engineer-ii-berlin-mar-2022-offer-declined/
 */
public class WordCount {

    public int count(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        int words = 0;
        boolean inWord = false;


        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (Character.isWhitespace(current)) {
                inWord = false;
            } else if (!inWord) {
                words++;
                inWord = true;
            }
        }

        return words;
    }
}
