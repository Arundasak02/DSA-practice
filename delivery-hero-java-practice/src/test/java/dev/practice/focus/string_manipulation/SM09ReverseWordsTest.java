package dev.practice.focus.string_manipulation;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

@Tag("focus")
@Timeout(10)
class SM09ReverseWordsTest {
    private final SM09ReverseWords sut=new SM09ReverseWords();
    @Test void reverse() {
        assertEquals("high sell low buy",sut.reverse("buy low sell high"));
    }
    @Test void spaces() {
        assertEquals("low buy",sut.reverse("  buy   low  "));
    }
    @Test void empty() {
        assertEquals("",sut.reverse("")); assertEquals("",sut.reverse("   ")); assertEquals("buy",sut.reverse("buy"));
    }
}
