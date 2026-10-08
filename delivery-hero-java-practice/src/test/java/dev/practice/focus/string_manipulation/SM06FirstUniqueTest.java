package dev.practice.focus.string_manipulation;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

@Tag("focus")
@Timeout(10)
class SM06FirstUniqueTest {
    private final SM06FirstUnique sut=new SM06FirstUnique();
    @Test void first() {
        assertEquals(OptionalInt.of(119),sut.find("swiss"));
    }
    @Test void none() {
        assertEquals(OptionalInt.empty(),sut.find("aabb")); assertEquals(OptionalInt.empty(),sut.find(""));
    }
    @Test void supplementary() {
        assertEquals(OptionalInt.of(0x1F600),sut.find("😀aabb"));
    }
    @Test void caseAndOrder() {
        assertEquals(OptionalInt.of(65),sut.find("aAbbac"));
    }
}
