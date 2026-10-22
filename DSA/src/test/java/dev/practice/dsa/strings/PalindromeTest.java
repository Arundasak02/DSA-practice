package dev.practice.dsa.strings;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

@Tag("focus")
@Timeout(10)
class PalindromeTest {
    private final Palindrome sut=new Palindrome();
    @Test void trueCases() {
        assertTrue(sut.check("A man, a plan, a canal: Panama")); assertTrue(sut.check("abba"));
    }
    @Test void falseCases() {
        assertFalse(sut.check("race a car")); assertFalse(sut.check("0P"));
    }
    @Test void empty() {
        assertTrue(sut.check("")); assertTrue(sut.check("!!!"));
    }
}
