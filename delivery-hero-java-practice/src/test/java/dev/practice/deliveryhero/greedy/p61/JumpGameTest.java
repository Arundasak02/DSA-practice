package dev.practice.deliveryhero.greedy.p61;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {
    private final JumpGame subject = new JumpGame();
    @Test void reachable() { assertTrue(subject.canReach(new int[]{2,3,1,1,4})); }
    @Test void blockedByZero() { assertFalse(subject.canReach(new int[]{3,2,1,0,4})); }
    @Test void alreadyAtGoal() { assertTrue(subject.canReach(new int[]{0})); }
    @Test void cannotStart() { assertFalse(subject.canReach(new int[]{0,2})); }
    @Test void canSkipZeros() { assertTrue(subject.canReach(new int[]{2,0,0})); }
    @Test void hugeJumpMustNotOverflow() {
        assertTrue(subject.canReach(new int[]{1,Integer.MAX_VALUE,0,0}));
    }
    @Test void doesNotMutate() {
        int[] a={1,1,1,0}; int[] copy=a.clone();
        assertTrue(subject.canReach(a)); assertArrayEquals(copy,a);
    }
    @Test void longChainAndLateGap() {
        int[] a=new int[100_000]; java.util.Arrays.fill(a,1);
        assertTrue(subject.canReach(a)); a[a.length-2]=0;
        assertFalse(subject.canReach(a));
    }
}
