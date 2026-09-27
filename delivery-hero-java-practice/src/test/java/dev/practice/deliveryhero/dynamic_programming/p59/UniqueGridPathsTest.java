package dev.practice.deliveryhero.dynamic_programming.p59;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("dynamic_programming")
@Timeout(10)
class UniqueGridPathsTest {
    private final UniqueGridPaths sut = new UniqueGridPaths();
    @Test
    void normal() throws Exception {
        assertEquals(BigInteger.valueOf(28),sut.count(3,7));
    }

    @Test
    void single() throws Exception {
        assertEquals(BigInteger.ONE,sut.count(1,1));
    }

    @Test
    void line() throws Exception {
        assertEquals(BigInteger.ONE,sut.count(1,100));
    }

    @Test
    void empty() throws Exception {
        assertEquals(BigInteger.ZERO,sut.count(0,4));
    }

    @Test
    void beyondLong() throws Exception {
        assertEquals(new BigInteger("35345263800"),sut.count(20,20));assertEquals(new BigInteger("28453041475240576740"),sut.count(35,35));
    }
}
