package dev.practice.deliveryhero.heaps.p08;

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
class StreamingMedianTest {
    private final StreamingMedian sut = new StreamingMedian();
    @Test
    void oddEven() throws Exception {
        sut.add(1);assertEquals(1.0,sut.median());sut.add(4);assertEquals(2.5,sut.median());sut.add(2);assertEquals(2.0,sut.median());
    }

    @Test
    void negative() throws Exception {
        sut.add(-5);sut.add(-1);assertEquals(-3.0,sut.median());
    }

    @Test
    void duplicates() throws Exception {
        sut.add(7);sut.add(7);sut.add(7);assertEquals(7.0,sut.median());
    }

    @Test
    void extremes() throws Exception {
        sut.add(Integer.MIN_VALUE);sut.add(Integer.MAX_VALUE);assertEquals(-0.5,sut.median());
    }

    @Test
    void empty() throws Exception {
        assertThrows(NoSuchElementException.class,()->sut.median());
    }

    @Test
    void independent() throws Exception {
        sut.add(10);StreamingMedian other=new StreamingMedian();other.add(2);assertEquals(10.0,sut.median());assertEquals(2.0,other.median());
    }
}
