package dev.practice.dsa.linked_lists;

import java.util.*;

/*
 * D12 — Detect a linked-list cycle
 * Return whether following next pointers reaches a cycle. Do not mutate nodes. Null is not cyclic. O(n) time/O(1) space.
 * Inputs are non-null; do not mutate them unless explicitly allowed.
 * General DSA foundation; not a claim about any company interview.
 * Run: ./mvnw -Dtest=LinkedListCycleTest test
 */
public class LinkedListCycle {
    public static class Node { public final int value; public Node next; public Node(int value) { this.value=value; } }

    public boolean hasCycle(Node head) {
        throw new UnsupportedOperationException("TODO D12: implement your solution");
    }
}
