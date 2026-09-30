package dev.practice.deliveryhero.greedy.p65;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

@Tag("practice")
@Tag("greedy")
@Timeout(10)
class JumpReachabilityTest {
    private final JumpReachability sut=new JumpReachability();
    @Test void reachable() { assertTrue(sut.canReach(new int[]{2,3,1,1,4})); }
    @Test void blocked() { assertFalse(sut.canReach(new int[]{3,2,1,0,4})); assertFalse(sut.canReach(new int[]{0,1})); }
    @Test void emptyAndSingle() { assertFalse(sut.canReach(new int[]{})); assertTrue(sut.canReach(new int[]{0})); }
    @Test void exactReach() { assertTrue(sut.canReach(new int[]{2,0,0})); assertTrue(sut.canReach(new int[]{1,1,0})); }
    @Test void overflowAndMutation() { int[] values={1,Integer.MAX_VALUE,0}; int[] before=values.clone(); assertTrue(sut.canReach(values)); assertArrayEquals(before,values); }
    @Test void nullRejected() { assertThrows(NullPointerException.class, () -> sut.canReach(null)); }
}
