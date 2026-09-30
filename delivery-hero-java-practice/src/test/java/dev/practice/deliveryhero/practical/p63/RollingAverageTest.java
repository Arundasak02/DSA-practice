package dev.practice.deliveryhero.practical.p63;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

@Tag("practice")
@Tag("practical")
@Timeout(10)
class RollingAverageTest {
    @Test void empty() { assertTrue(new RollingAverage(3).average().isEmpty()); }
    @Test void fillsAndExpires() { var s=new RollingAverage(3); s.accept(1); assertEquals(1.0,s.average().orElseThrow(),1e-9); s.accept(2); assertEquals(1.5,s.average().orElseThrow(),1e-9); s.accept(3); s.accept(10); assertEquals(5.0,s.average().orElseThrow(),1e-9); }
    @Test void capacityOne() { var s=new RollingAverage(1); s.accept(5); s.accept(-3); assertEquals(-3.0,s.average().orElseThrow(),1e-9); }
    @Test void overflowSafeSum() { var s=new RollingAverage(2); s.accept(Integer.MAX_VALUE); s.accept(Integer.MAX_VALUE); assertEquals((double)Integer.MAX_VALUE,s.average().orElseThrow(),1e-9); s.accept(Integer.MIN_VALUE); assertEquals(-0.5,s.average().orElseThrow(),1e-9); }
    @Test void longStreamRemainsCorrect() { var s=new RollingAverage(100); for(int i=0;i<10000;i++) s.accept(i); assertEquals(9949.5,s.average().orElseThrow(),1e-9); }
    @Test void invalidWindow() { assertThrows(IllegalArgumentException.class, () -> new RollingAverage(0)); assertThrows(IllegalArgumentException.class, () -> new RollingAverage(-1)); }
}
