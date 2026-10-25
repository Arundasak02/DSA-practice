package dev.practice.dsa.linked_lists;

/*
 * D11 — Merge sorted linked lists
 * Merge two disjoint acyclic sorted lists using existing nodes. May mutate next pointers. Return head; null means empty. O(n+m) time/O(1) auxiliary space.
 * Inputs are non-null; do not mutate them unless explicitly allowed.
 * General DSA foundation; not a claim about any company interview.
 * Run: ./mvnw -Dtest=MergeSortedListsTest test
 */
public class MergeSortedLists {

  public Node merge(Node a, Node b) {
    throw new UnsupportedOperationException("TODO D11: implement your solution");
  }

  public static class Node {

    public final int value;
    public Node next;

    public Node(int value) {
      this.value = value;
    }
  }
}
