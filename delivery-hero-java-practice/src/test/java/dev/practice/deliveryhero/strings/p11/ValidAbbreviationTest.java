package dev.practice.deliveryhero.strings.p11;

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
class ValidAbbreviationTest {
    private final ValidAbbreviation sut = new ValidAbbreviation();
    @Test
    void valid() throws Exception {
        assertTrue(sut.valid("internationalization","i18n"));
    }

    @Test
    void empty() throws Exception {
        assertTrue(sut.valid("",""));assertFalse(sut.valid("a",""));
    }

    @Test
    void leadingZero() throws Exception {
        assertFalse(sut.valid("apple","a03e"));assertFalse(sut.valid("apple","a0pple"));
    }

    @Test
    void overshoot() throws Exception {
        assertFalse(sut.valid("apple","6"));
    }

    @Test
    void literalMismatch() throws Exception {
        assertFalse(sut.valid("apple","a3x"));
    }

    @Test
    void hugeNumber() throws Exception {
        assertFalse(sut.valid("a","999999999999999999999999999"));
    }

    @Test
    void exact() throws Exception {
        assertTrue(sut.valid("apple","5"));
    }
}
