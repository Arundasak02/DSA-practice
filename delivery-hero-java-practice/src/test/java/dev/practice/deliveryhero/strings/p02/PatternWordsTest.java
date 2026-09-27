package dev.practice.deliveryhero.strings.p02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("strings")
@Timeout(10)
class PatternWordsTest {
    private final PatternWords sut = new PatternWords();
    @Test
    void reportedShape() throws Exception {
        assertEquals(List.of("abbccbb", "deeffee"), sut.match(List.of("aabbcc", "abbccbb", "deeffee", "abcdefg"), "xyyzzyy"));
    }

    @Test
    void bijection() throws Exception {
        assertEquals(List.of("xy"), sut.match(List.of("xx", "xy"), "ab"));
    }

    @Test
    void repeat() throws Exception {
        assertEquals(List.of("aaa"), sut.match(List.of("aaa", "aba"), "xxx"));
    }

    @Test
    void emptyPattern() throws Exception {
        assertEquals(List.of(""), sut.match(List.of("", "a"), ""));
    }

    @Test
    void duplicates() throws Exception {
        assertEquals(List.of("foo", "foo"), sut.match(List.of("foo", "foo", "bar"), "abb"));
    }
}
