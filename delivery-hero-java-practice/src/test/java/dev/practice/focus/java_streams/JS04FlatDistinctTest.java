package dev.practice.focus.java_streams;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

@Tag("focus")
@Timeout(10)
class JS04FlatDistinctTest {
    private final JS04FlatDistinct sut=new JS04FlatDistinct();
    @Test void flatten() {
        assertEquals(List.of(3,1,2),sut.flatten(List.of(List.of(3,1),List.of(1,2,3))));
    }
    @Test void empty() {
        assertEquals(List.of(),sut.flatten(List.of())); assertEquals(List.of(),sut.flatten(List.of(List.of())));
    }
    @Test void immutable() {
        assertEquals(List.of(-1,0),sut.flatten(List.of(List.of(-1),List.of(),List.of(0,-1))));
    }
}
