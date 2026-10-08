package dev.practice.focus.java_streams;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

@Tag("focus")
@Timeout(10)
class JS01FilterMapTest {
    private final JS01FilterMap sut=new JS01FilterMap();
    @Test void mixed() {
        assertEquals(List.of(4L,16L,4L),sut.solve(List.of(1,2,4,-2,3)));
    }
    @Test void large() {
        assertEquals(List.of(4611686018427387904L),sut.solve(List.of(Integer.MIN_VALUE)));
    }
    @Test void empty() {
        assertEquals(List.of(),sut.solve(List.of()));
    }
}
