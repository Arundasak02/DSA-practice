package dev.practice.deliveryhero.hashing.p64;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import dev.practice.deliveryhero.hashing.p64.AllTwoSumPairs.Pair;

@Tag("practice")
@Tag("hashing")
@Timeout(10)
class AllTwoSumPairsTest {
    private final AllTwoSumPairs sut=new AllTwoSumPairs();
    @Test void reportedExampleCompleted() { assertEquals(List.of(new Pair(0,5),new Pair(1,5),new Pair(4,7),new Pair(0,8),new Pair(1,8)),sut.find(new int[]{1,1,2,23,4,9,13,6,9},10)); }
    @Test void allDuplicateIndices() { assertEquals(List.of(new Pair(0,1),new Pair(0,2),new Pair(1,2),new Pair(0,3),new Pair(1,3),new Pair(2,3)),sut.find(new int[]{5,5,5,5},10)); }
    @Test void noMatchesOrShortInput() { assertEquals(List.of(),sut.find(new int[]{},0)); assertEquals(List.of(),sut.find(new int[]{5},10)); assertEquals(List.of(),sut.find(new int[]{1,2,3},10)); }
    @Test void negativesAndZeros() { assertEquals(List.of(new Pair(1,2),new Pair(0,3)),sut.find(new int[]{-2,0,0,2},0)); }
    @Test void extremeIntegersAndLongTarget() { assertEquals(List.of(new Pair(0,1)),sut.find(new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE},4294967294L)); assertEquals(List.of(),sut.find(new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE},-2)); assertEquals(List.of(),sut.find(new int[]{0,1},Long.MIN_VALUE)); }
    @Test void inputUnchanged() { int[] values={3,1,2}; int[] before=values.clone(); assertEquals(List.of(new Pair(1,2)),sut.find(values,3)); assertArrayEquals(before,values); }
    @Test void nullRejected() { assertThrows(NullPointerException.class, () -> sut.find(null,0)); }
}
