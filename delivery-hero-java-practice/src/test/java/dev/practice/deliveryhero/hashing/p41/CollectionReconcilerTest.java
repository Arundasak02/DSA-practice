package dev.practice.deliveryhero.hashing.p41;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("hashing")
@Timeout(10)
class CollectionReconcilerTest {
    private final CollectionReconciler sut = new CollectionReconciler();
    @Test
    void overlap() throws Exception {
        assertEquals(new CollectionReconciler.Plan(List.of(1,2,3),List.of(4)),sut.reconcile(List.of(1,2,3),List.of(2,4)));
    }

    @Test
    void same() throws Exception {
        assertEquals(new CollectionReconciler.Plan(List.of(2,1),List.of()),sut.reconcile(List.of(2,1),List.of(1,2)));
    }

    @Test
    void removeAll() throws Exception {
        assertEquals(new CollectionReconciler.Plan(List.of(),List.of(3,2)),sut.reconcile(List.of(),List.of(3,2)));
    }

    @Test
    void empty() throws Exception {
        assertEquals(new CollectionReconciler.Plan(List.of(),List.of()),sut.reconcile(List.of(),List.of()));
    }

    @Test
    void snapshot() throws Exception {
        List<Integer> a=new ArrayList<>(List.of(1));List<Integer> b=new ArrayList<>(List.of(2));var p=sut.reconcile(a,b);assertEquals(List.of(1),a);assertEquals(List.of(2),b);a.add(9);b.add(8);assertEquals(List.of(1),p.insertOrUpdate());assertEquals(List.of(2),p.remove());
    }
}
