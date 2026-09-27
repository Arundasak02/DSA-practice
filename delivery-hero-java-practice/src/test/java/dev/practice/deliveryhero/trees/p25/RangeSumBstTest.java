package dev.practice.deliveryhero.trees.p25;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("trees")
@Timeout(10)
class RangeSumBstTest {
    private final RangeSumBst sut = new RangeSumBst();
    @Test
    void range() throws Exception {
        var r=new RangeSumBst.Node(10);r.left=new RangeSumBst.Node(5);r.right=new RangeSumBst.Node(15);assertEquals(25L,sut.sum(r,10,15));
    }

    @Test
    void empty() throws Exception {
        assertEquals(0L,sut.sum(null,1,3));
    }

    @Test
    void inclusive() throws Exception {
        assertEquals(5L,sut.sum(new RangeSumBst.Node(5),5,5));
    }

    @Test
    void outside() throws Exception {
        assertEquals(0L,sut.sum(new RangeSumBst.Node(5),6,9));
    }

    @Test
    void negative() throws Exception {
        var r=new RangeSumBst.Node(-2);r.left=new RangeSumBst.Node(-4);assertEquals(-6L,sut.sum(r,-4,-2));
    }

    @Test
    void largeSum() throws Exception {
        var r=new RangeSumBst.Node(Integer.MAX_VALUE);r.left=new RangeSumBst.Node(Integer.MAX_VALUE-1);assertEquals(4294967293L,sut.sum(r,0,Integer.MAX_VALUE));
    }
}
