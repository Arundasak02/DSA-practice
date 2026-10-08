package dev.practice.focus.string_manipulation;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

@Tag("focus")
@Timeout(10)
class SM01WordCountingTest {
    private final SM01WordCounting sut=new SM01WordCounting();
    @Test void emptyAndNull() {
        assertEquals(0,sut.count(null)); assertEquals(0,sut.count("")); assertEquals(0,sut.count(" \t\n"));
    }
    @Test void mixedWhitespace() {
        assertEquals(3,sut.count("  buy\tlow\nsell  "));
    }
    @Test void punctuation() {
        assertEquals(2,sut.count("buy,sell !!!"));
    }
    @Test void unicodeWhitespace() {
        assertEquals(2,sut.count("a\u2003b")); assertEquals(1,sut.count("a\u00a0b"));
    }
}
