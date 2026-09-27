package dev.practice.deliveryhero.arrays.p06;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("arrays")
@Timeout(10)
class BriefcaseLockTest {
    private final BriefcaseLock sut = new BriefcaseLock();
    @Test
    void zero() throws Exception {
        assertEquals(0,sut.minimumMoves("000"));
    }

    @Test
    void wrap() throws Exception {
        assertEquals(3,sut.minimumMoves("909"+"1"));
    }

    @Test
    void halfTurn() throws Exception {
        assertEquals(15,sut.minimumMoves("555"));
    }

    @Test
    void mixed() throws Exception {
        assertEquals(6,sut.minimumMoves("123"));
    }

    @Test
    void empty() throws Exception {
        assertEquals(0,sut.minimumMoves(""));
    }
}
