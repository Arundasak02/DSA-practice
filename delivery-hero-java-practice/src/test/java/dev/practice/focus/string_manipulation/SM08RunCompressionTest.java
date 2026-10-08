package dev.practice.focus.string_manipulation;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

@Tag("focus")
@Timeout(10)
class SM08RunCompressionTest {
    private final SM08RunCompression sut=new SM08RunCompression();
    @Test void runs() {
        assertEquals("a3b2c1",sut.encode("aaabbc"));
    }
    @Test void separateRuns() {
        assertEquals("a1b2a1",sut.encode("abba"));
    }
    @Test void emptyAndLong() {
        assertEquals("",sut.encode("")); assertEquals("z12",sut.encode("zzzzzzzzzzzz"));
    }
}
