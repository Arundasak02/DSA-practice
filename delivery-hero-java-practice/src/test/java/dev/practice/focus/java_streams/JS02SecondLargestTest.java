package dev.practice.focus.java_streams;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

@Tag("focus")
@Timeout(10)
class JS02SecondLargestTest {
    private final JS02SecondLargest sut=new JS02SecondLargest();
    @Test void duplicates() {
        assertEquals(OptionalInt.of(4),sut.find(List.of(5,5,4,1)));
    }
    @Test void missing() {
        assertEquals(OptionalInt.empty(),sut.find(List.of())); assertEquals(OptionalInt.empty(),sut.find(List.of(7,7)));
    }
    @Test void negative() {
        assertEquals(OptionalInt.of(-5),sut.find(List.of(-8,-2,-5))); assertEquals(OptionalInt.of(Integer.MIN_VALUE),sut.find(List.of(Integer.MAX_VALUE,Integer.MIN_VALUE)));
    }
}
