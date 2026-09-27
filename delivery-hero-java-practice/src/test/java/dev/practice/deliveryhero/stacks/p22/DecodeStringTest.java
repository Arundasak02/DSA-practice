package dev.practice.deliveryhero.stacks.p22;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("stacks")
@Timeout(10)
class DecodeStringTest {
    private final DecodeString sut = new DecodeString();
    @Test
    void nested() throws Exception {
        assertEquals("accaccacc",sut.decode("3[a2[c]]"));
    }

    @Test
    void adjacent() throws Exception {
        assertEquals("ababccc",sut.decode("2[ab]3[c]"));
    }

    @Test
    void suffix() throws Exception {
        assertEquals("abcccd",sut.decode("ab3[c]d"));
    }

    @Test
    void multiDigit() throws Exception {
        assertEquals("a".repeat(12),sut.decode("12[a]"));
    }

    @Test
    void empty() throws Exception {
        assertEquals("",sut.decode(""));
    }

    @Test
    void literal() throws Exception {
        assertEquals("abc",sut.decode("abc"));
    }
}
