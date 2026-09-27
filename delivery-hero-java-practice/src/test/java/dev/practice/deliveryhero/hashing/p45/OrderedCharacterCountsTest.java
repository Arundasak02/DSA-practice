package dev.practice.deliveryhero.hashing.p45;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("hashing")
@Timeout(10)
class OrderedCharacterCountsTest {
    private final OrderedCharacterCounts sut = new OrderedCharacterCounts();
    @Test
    void scattered() throws Exception {
        assertEquals("a2b2c1",sut.summarize("abacb"));
    }

    @Test
    void empty() throws Exception {
        assertEquals("",sut.summarize(""));
    }

    @Test
    void distinct() throws Exception {
        assertEquals("z1a1b1",sut.summarize("zab"));
    }

    @Test
    void multiDigit() throws Exception {
        assertEquals("a12",sut.summarize("a".repeat(12)));
    }

    @Test
    void notRunLength() throws Exception {
        assertEquals("a3b2",sut.summarize("ababa"));
    }
}
