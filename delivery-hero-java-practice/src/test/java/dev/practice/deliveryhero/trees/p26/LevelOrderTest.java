package dev.practice.deliveryhero.trees.p26;

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
class LevelOrderTest {
    private final LevelOrder sut = new LevelOrder();
    @Test
    void balanced() throws Exception {
        var r=new LevelOrder.Node(1);r.left=new LevelOrder.Node(2);r.right=new LevelOrder.Node(3);assertEquals(List.of(List.of(1),List.of(2,3)),sut.levels(r));
    }

    @Test
    void empty() throws Exception {
        assertEquals(List.of(),sut.levels(null));
    }

    @Test
    void single() throws Exception {
        assertEquals(List.of(List.of(7)),sut.levels(new LevelOrder.Node(7)));
    }

    @Test
    void skew() throws Exception {
        var r=new LevelOrder.Node(1);r.right=new LevelOrder.Node(2);r.right.left=new LevelOrder.Node(3);assertEquals(List.of(List.of(1),List.of(2),List.of(3)),sut.levels(r));
    }

    @Test
    void duplicates() throws Exception {
        var r=new LevelOrder.Node(1);r.left=new LevelOrder.Node(1);assertEquals(List.of(List.of(1),List.of(1)),sut.levels(r));
    }
}
