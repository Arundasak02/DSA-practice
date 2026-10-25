package dev.practice.dsa.trees;

/*
 * D14 — Validate a binary search tree
 * Return whether all left descendants are strictly smaller and all right descendants strictly larger than each node. Duplicates invalid; null valid. At most 1000 nodes. O(n) time.
 * Inputs are non-null; do not mutate them unless explicitly allowed.
 * General DSA foundation; not a claim about any company interview.
 * Run: ./mvnw -Dtest=ValidateBSTTest test
 */
public class ValidateBST {

  public boolean valid(Node root) {
    throw new UnsupportedOperationException("TODO D14: implement your solution");
  }

  public static class Node {

    public final int value;
    public Node left, right;

    public Node(int value) {
      this.value = value;
    }
  }
}
