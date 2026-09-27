package dev.practice.deliveryhero.practical.p35;

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
class EventDeduplicatorTest {
    private final EventDeduplicator sut = new EventDeduplicator(10);
    @Test
    void duplicate() throws Exception {
        assertTrue(sut.accept("a",0));assertFalse(sut.accept("a",1));
    }

    @Test
    void boundary() throws Exception {
        sut.accept("a",0);assertFalse(sut.accept("a",9));assertTrue(sut.accept("a",10));
    }

    @Test
    void noRefresh() throws Exception {
        sut.accept("a",0);sut.accept("a",9);assertTrue(sut.accept("a",10));
    }

    @Test
    void differentIds() throws Exception {
        assertTrue(sut.accept("a",0));assertTrue(sut.accept("b",0));assertEquals(2,sut.retainedIds());
    }

    @Test
    void cleanup() throws Exception {
        sut.accept("a",0);sut.accept("b",1);sut.accept("c",11);assertEquals(1,sut.retainedIds());
    }

    @Test
    void sameTime() throws Exception {
        assertTrue(sut.accept("a",0));assertFalse(sut.accept("a",0));assertEquals(1,sut.retainedIds());
    }
}
