package dev.practice.deliveryhero.hashing.p49;

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
class FirstUniqueCharacterTest {
    private final FirstUniqueCharacter sut = new FirstUniqueCharacter();
    @Test
    void first() throws Exception {
        assertEquals(0,sut.index("leetcode"));
    }

    @Test
    void later() throws Exception {
        assertEquals(2,sut.index("loveleetcode"));
    }

    @Test
    void none() throws Exception {
        assertEquals(-1,sut.index("aabb"));
    }

    @Test
    void empty() throws Exception {
        assertEquals(-1,sut.index(""));
    }

    @Test
    void caseSensitive() throws Exception {
        assertEquals(0,sut.index("aA"));
    }
}
