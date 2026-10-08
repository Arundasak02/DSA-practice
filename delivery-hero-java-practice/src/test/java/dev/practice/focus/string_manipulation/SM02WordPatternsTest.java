package dev.practice.focus.string_manipulation;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

@Tag("focus")
@Timeout(10)
class SM02WordPatternsTest {
    private final SM02WordPatterns sut=new SM02WordPatterns();
    @Test void matches() {
        assertEquals(List.of("mee","aqq"),sut.match(List.of("abc","mee","aqq","dkd","ccc"),"abb"));
    }
    @Test void bijection() {
        assertEquals(List.of("ab"),sut.match(List.of("aa","ab"),"xy"));
    }
    @Test void emptyAndLengths() {
        assertEquals(List.of(""),sut.match(List.of("","a"),"")); assertEquals(List.of(),sut.match(List.of(),"a"));
    }
    @Test void orderAndDuplicates() {
        assertEquals(List.of("foo","egg","foo"),sut.match(List.of("foo","egg","foo"),"abb"));
    }
}
