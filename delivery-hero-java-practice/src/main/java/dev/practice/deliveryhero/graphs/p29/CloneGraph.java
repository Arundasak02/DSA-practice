package dev.practice.deliveryhero.graphs.p29;

import java.util.*;
import java.util.concurrent.*;
import java.math.*;

/** P29: Deep-copy a graph with cycles. Read README.md in this directory before implementing. */
public class CloneGraph {
    public static class Node {
        public final int label;
        public final List<Node> neighbors = new ArrayList<>();
        public Node(int label) { this.label = label; }
    }
    public Node cloneGraph(Node start) {
        throw new UnsupportedOperationException("TODO P29: implement your solution");
    }
}
