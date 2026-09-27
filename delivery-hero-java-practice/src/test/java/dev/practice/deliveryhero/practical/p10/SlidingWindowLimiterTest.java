package dev.practice.deliveryhero.practical.p10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("practical")
@Timeout(10)
class SlidingWindowLimiterTest {
    private final SlidingWindowLimiter sut = new SlidingWindowLimiter(2, 10);
    @Test
    void quota() throws Exception {
        assertTrue(sut.allow("a",0));assertTrue(sut.allow("a",1));assertFalse(sut.allow("a",2));
    }

    @Test
    void exactBoundary() throws Exception {
        assertTrue(sut.allow("a",0));assertTrue(sut.allow("a",1));assertFalse(sut.allow("a",9));assertTrue(sut.allow("a",10));assertFalse(sut.allow("a",10));assertTrue(sut.allow("a",11));
    }

    @Test
    void clients() throws Exception {
        assertTrue(sut.allow("a",0));assertTrue(sut.allow("a",0));assertFalse(sut.allow("a",0));assertTrue(sut.allow("b",0));
    }

    @Test
    void rejectedNotCounted() throws Exception {
        sut.allow("a",0);sut.allow("a",0);assertFalse(sut.allow("a",9));assertTrue(sut.allow("a",10));assertTrue(sut.allow("a",10));
    }

    @Test
    void longIdle() throws Exception {
        sut.allow("a",0);sut.allow("a",1);assertTrue(sut.allow("a",1000000000000L));
    }
}
