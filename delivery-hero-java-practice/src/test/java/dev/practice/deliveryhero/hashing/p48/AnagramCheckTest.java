package dev.practice.deliveryhero.hashing.p48;

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
class AnagramCheckTest {
    private final AnagramCheck sut = new AnagramCheck();
    @Test
    void yes() throws Exception {
        assertTrue(sut.sameLetters("ABCD","BDAC"));
    }

    @Test
    void multiplicity() throws Exception {
        assertFalse(sut.sameLetters("ABCD","AABC"));
    }

    @Test
    void empty() throws Exception {
        assertTrue(sut.sameLetters("",""));
    }

    @Test
    void caseSensitive() throws Exception {
        assertFalse(sut.sameLetters("a","A"));
    }

    @Test
    void spaces() throws Exception {
        assertTrue(sut.sameLetters("a b!","!ba "));
    }

    @Test
    void length() throws Exception {
        assertFalse(sut.sameLetters("a","aa"));
    }
}
