package dev.practice.deliveryhero.graphs.p29;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("graphs")
@Timeout(10)
class CloneGraphTest {
    private final CloneGraph sut = new CloneGraph();
    @Test
    void cycle() throws Exception {
        var a=new CloneGraph.Node(1);var b=new CloneGraph.Node(2);a.neighbors.add(b);b.neighbors.add(a);var c=sut.cloneGraph(a);assertNotSame(a,c);assertEquals(1,c.label);var d=c.neighbors.get(0);assertNotSame(b,d);assertEquals(2,d.label);assertSame(c,d.neighbors.get(0));
    }

    @Test
    void selfLoop() throws Exception {
        var a=new CloneGraph.Node(1);a.neighbors.add(a);var c=sut.cloneGraph(a);assertNotSame(a,c);assertSame(c,c.neighbors.get(0));
    }

    @Test
    void nullGraph() throws Exception {
        assertNull(sut.cloneGraph(null));
    }

    @Test
    void sameLabels() throws Exception {
        var a=new CloneGraph.Node(1);var b=new CloneGraph.Node(1);a.neighbors.add(b);var c=sut.cloneGraph(a);assertNotSame(c,c.neighbors.get(0));assertNotSame(b,c.neighbors.get(0));assertEquals(1,c.neighbors.get(0).label);
    }

    @Test
    void parallelEdges() throws Exception {
        var a=new CloneGraph.Node(1);var b=new CloneGraph.Node(2);a.neighbors.add(b);a.neighbors.add(b);var c=sut.cloneGraph(a);assertEquals(2,c.neighbors.size());assertSame(c.neighbors.get(0),c.neighbors.get(1));assertNotSame(a.neighbors,c.neighbors);
    }

    @Test
    void isolated() throws Exception {
        var a=new CloneGraph.Node(9);var c=sut.cloneGraph(a);assertEquals(9,c.label);assertNotSame(a,c);assertTrue(c.neighbors.isEmpty());
    }
}
