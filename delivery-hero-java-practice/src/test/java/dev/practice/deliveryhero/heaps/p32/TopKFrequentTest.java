package dev.practice.deliveryhero.heaps.p32;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("heaps")
@Timeout(10)
class TopKFrequentTest {
    private final TopKFrequent sut = new TopKFrequent();
    @Test
    void normal() throws Exception {
        assertEquals(List.of(1,2),sut.top(new int[]{1,1,1,2,2,3},2));
    }

    @Test
    void tie() throws Exception {
        assertEquals(List.of(-1,2),sut.top(new int[]{2,-1,3},2));
    }

    @Test
    void zero() throws Exception {
        assertEquals(List.of(),sut.top(new int[]{1},0));
    }

    @Test
    void empty() throws Exception {
        assertEquals(List.of(),sut.top(new int[0],0));
    }

    @Test
    void extremes() throws Exception {
        assertEquals(List.of(Integer.MIN_VALUE,Integer.MAX_VALUE),sut.top(new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE},2));
    }

    @Test
    void frequencyBeforeValue() throws Exception {
        assertEquals(List.of(9,1),sut.top(new int[]{9,9,1},2));
    }
}
