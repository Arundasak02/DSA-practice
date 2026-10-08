package dev.practice.focus.string_manipulation;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

@Tag("focus")
@Timeout(10)
class SM05OcrStringsTest {
    private final SM05OcrStrings sut=new SM05OcrStrings();
    @Test void wildcards() {
        assertTrue(sut.compatible("B2D","1C2"));
    }
    @Test void conflicts() {
        assertFalse(sut.compatible("a2","b2")); assertFalse(sut.compatible("a","A"));
    }
    @Test void lengths() {
        assertTrue(sut.compatible("","")); assertFalse(sut.compatible("","1")); assertFalse(sut.compatible("2","3"));
    }
    @Test void largeRuns() {
        assertTrue(sut.compatible("100000000000","99999999999a")); assertFalse(sut.compatible("12","3"));
    }
}
