package dev.practice.deliveryhero.stacks.p21;

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
class ValidBracketsTest {
    private final ValidBrackets sut = new ValidBrackets();
    @Test
    void nested() throws Exception {
        assertTrue(sut.valid("{[()]}"));
    }

    @Test
    void adjacent() throws Exception {
        assertTrue(sut.valid("()[]{}"));
    }

    @Test
    void crossed() throws Exception {
        assertFalse(sut.valid("([)]"));
    }

    @Test
    void unclosed() throws Exception {
        assertFalse(sut.valid("(("));
    }

    @Test
    void extraClose() throws Exception {
        assertFalse(sut.valid("]"));
    }

    @Test
    void empty() throws Exception {
        assertTrue(sut.valid(""));
    }
}
