package dev.practice.focus.string_manipulation;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

@Tag("focus")
@Timeout(10)
class SM10PalindromeTest {
    private final SM10Palindrome sut=new SM10Palindrome();
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
