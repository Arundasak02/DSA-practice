package dev.practice.focus.string_manipulation;

import java.util.*;

/*
 * SM07 — Group anagrams | 25 minutes
 * Evidence: Recommended pattern/collector practice; not established as a DH question
 *
 * Lowercase ASCII words, including empty. Group anagrams. Groups ordered by first appearance of their
 * signature; words within each group preserve input order and duplicates. Example [eat,tea,tan] ->
 * [[eat,tea],[tan]]. No mutation. Sorting-based key target O(sum(length log length)).
 *
 * Java Streams: Good fit: grouping by a canonical key; use an insertion-ordered map to satisfy group
 * order. Explain sorted-key cost.
 *
 * Inputs and elements are non-null unless specified. Do not mutate inputs. Unless stated otherwise,
 * size <=100,000. Edge rules and tests are authored practice contracts.
 *
 * Run: ./mvnw -Dtest=SM07AnagramGroupsTest test
 * Source COLLECT: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Collectors.html
 */
public class SM07AnagramGroups {
    public List<List<String>> group(List<String> words) {
        throw new UnsupportedOperationException("TODO SM07: implement your solution");
    }
}
