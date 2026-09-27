package dev.practice.deliveryhero.strings.p03;

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
class OcrCompatibilityTest {
    private final OcrCompatibility sut = new OcrCompatibility();
    @Test
    void matching() throws Exception {
        assertTrue(sut.compatible("A3BCD", "A6"));
    }

    @Test
    void literalConflict() throws Exception {
        assertFalse(sut.compatible("A2B", "A2C"));
    }

    @Test
    void unequalLengths() throws Exception {
        assertFalse(sut.compatible("A3", "A2"));
    }

    @Test
    void offsetLiterals() throws Exception {
        assertTrue(sut.compatible("2AB", "A2B"));
    }

    @Test
    void empty() throws Exception {
        assertTrue(sut.compatible("", "")); assertFalse(sut.compatible("", "1"));
    }

    @Test
    void largeRuns() throws Exception {
        assertTrue(sut.compatible("A999999999999", "1000000000000"));
    }

    @Test
    void multiDigit() throws Exception {
        assertFalse(sut.compatible("12A", "3A"));
    }
}
