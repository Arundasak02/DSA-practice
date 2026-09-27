package dev.practice.deliveryhero.strings.p01;

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
class WordCountTest {
    private final WordCount sut = new WordCount();
    @Test
    void empty() throws Exception {
        assertEquals(0, sut.count(""));
    }

    @Test
    void onlyWhitespace() throws Exception {
        assertEquals(0, sut.count(" \t\r\n "));
    }

    @Test
    void single() throws Exception {
        assertEquals(1, sut.count("brokerage"));
    }

    @Test
    void mixedWhitespace() throws Exception {
        assertEquals(4, sut.count("  buy\tlow\nsell  high "));
    }

    @Test
    void punctuation() throws Exception {
        assertEquals(2, sut.count("hello, world!"));
    }

    @Test
    void unicodeWhitespace() throws Exception {
        assertEquals(2, sut.count("one\u2003two"));
    }
}
