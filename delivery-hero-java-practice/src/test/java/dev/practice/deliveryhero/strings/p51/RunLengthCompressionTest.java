package dev.practice.deliveryhero.strings.p51;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("strings")
@Timeout(10)
class RunLengthCompressionTest {
    private final RunLengthCompression sut = new RunLengthCompression();
    @Test
    void runs() throws Exception {
        char[] a="aabbccc".toCharArray();int n=sut.compress(a);assertEquals("a2b2c3",new String(a,0,n));
    }

    @Test
    void single() throws Exception {
        char[] a={'x'};assertEquals(1,sut.compress(a));assertEquals('x',a[0]);
    }

    @Test
    void empty() throws Exception {
        assertEquals(0,sut.compress(new char[0]));
    }

    @Test
    void multipleDigits() throws Exception {
        char[] a="a".repeat(12).toCharArray();int n=sut.compress(a);assertEquals("a12",new String(a,0,n));
    }

    @Test
    void separated() throws Exception {
        char[] a="ababa".toCharArray();int n=sut.compress(a);assertEquals("ababa",new String(a,0,n));
    }
}
