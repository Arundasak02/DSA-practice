package dev.practice.dsa.trees;

/*
 * D13 — Maximum binary-tree depth
 * Return number of nodes on longest root-to-leaf path. Null has depth 0. Tree has at most 1000 nodes. O(n) time.
 * Inputs are non-null; do not mutate them unless explicitly allowed.
 * General DSA foundation; not a claim about any company interview.
 * Run: ./mvnw -Dtest=TreeDepthTest test
 */
public class TreeDepth {

  public int depth(Node root) {
    throw new UnsupportedOperationException("TODO D13: implement your solution");
  }

  public static class Node {

    public final int value;
    public Node left, right;

    public Node(int value) {
      this.value = value;
    }
  }
}
