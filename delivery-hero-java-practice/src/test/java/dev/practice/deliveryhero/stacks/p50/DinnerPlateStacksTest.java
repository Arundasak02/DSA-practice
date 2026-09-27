package dev.practice.deliveryhero.stacks.p50;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("stacks")
@Timeout(10)
class DinnerPlateStacksTest {
    private final DinnerPlateStacks sut = new DinnerPlateStacks(2);
    @Test
    void normal() throws Exception {
        sut.push(1);sut.push(2);sut.push(3);assertEquals(2,sut.popAt(0));assertEquals(3,sut.pop());assertEquals(1,sut.pop());assertEquals(-1,sut.pop());
    }

    @Test
    void leftmostHole() throws Exception {
        for(int i=1;i<=6;i++)sut.push(i);assertEquals(2,sut.popAt(0));assertEquals(4,sut.popAt(1));sut.push(9);sut.push(8);assertEquals(9,sut.popAt(0));assertEquals(8,sut.popAt(1));
    }

    @Test
    void emptyAndMissing() throws Exception {
        assertEquals(-1,sut.pop());assertEquals(-1,sut.popAt(4));assertEquals(-1,sut.popAt(-1));
    }

    @Test
    void interiorIndex() throws Exception {
        for(int i=1;i<=5;i++)sut.push(i);sut.popAt(0);sut.popAt(0);assertEquals(5,sut.popAt(2));assertEquals(4,sut.popAt(1));
    }

    @Test
    void refillAfterDrain() throws Exception {
        sut.push(1);assertEquals(1,sut.pop());sut.push(2);assertEquals(2,sut.popAt(0));
    }

    @Test
    void capacityOne() throws Exception {
        var d=new DinnerPlateStacks(1);d.push(1);d.push(2);assertEquals(1,d.popAt(0));d.push(3);assertEquals(3,d.popAt(0));assertEquals(2,d.pop());
    }
}
