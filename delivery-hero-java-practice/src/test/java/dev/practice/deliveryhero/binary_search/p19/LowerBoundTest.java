package dev.practice.deliveryhero.binary_search.p19;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("binary_search")
@Timeout(10)
class LowerBoundTest {
    private final LowerBound sut = new LowerBound();
    @Test
    void duplicate() throws Exception {
        assertEquals(1,sut.index(new int[]{1,2,2,4},2));
    }

    @Test
    void gap() throws Exception {
        assertEquals(3,sut.index(new int[]{1,2,2,4},3));
    }

    @Test
    void after() throws Exception {
        assertEquals(2,sut.index(new int[]{1,2},3));
    }

    @Test
    void before() throws Exception {
        assertEquals(0,sut.index(new int[]{1,2},0));
    }

    @Test
    void empty() throws Exception {
        assertEquals(0,sut.index(new int[0],4));
    }

    @Test
    void extremes() throws Exception {
        assertEquals(1,sut.index(new int[]{Integer.MIN_VALUE,Integer.MAX_VALUE},Integer.MAX_VALUE));
    }
}
