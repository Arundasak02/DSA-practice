package dev.practice.focus.java_streams;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

@Tag("focus")
@Timeout(10)
class JS10ReductionTest {
    private final JS10Reduction sut=new JS10Reduction();
    @Test void signed() {
        assertEquals(3L,sut.sum(List.of(1,-2,4)));
    }
    @Test void empty() {
        assertEquals(0L,sut.sum(List.of()));
    }
    @Test void wide() {
        assertEquals(4294967294L,sut.sum(List.of(Integer.MAX_VALUE,Integer.MAX_VALUE)));
    }
}
