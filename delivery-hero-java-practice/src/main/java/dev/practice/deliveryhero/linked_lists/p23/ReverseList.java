package dev.practice.deliveryhero.linked_lists.p23;

import java.util.*;
import java.util.concurrent.*;
import java.math.*;

/*
 * P23 — Reverse a singly linked list | 25 minutes
 * Evidence: Reported · foodpanda software engineer, Singapore.
 *
 * Reverse an acyclic singly linked list in-place and return its new head. Use the same Node instances,
 * preserving their values. null represents empty. At most 100,000 nodes. Implement iteratively first.
 *
 * Inputs/elements are non-null unless stated. Do not mutate inputs unless allowed. Edge rules and
 * tests are practice specifications.
 *
 * Example: 1 → 2 → 3 → null becomes 3 → 2 → 1 → null.
 * Target: O(n) time, O(1) extra space.
 *
 * Run: ./mvnw -Dtest=ReverseListTest test
 * Source S17: https://www.glassdoor.com/Interview/Reverse-a-linked-list-iteratively-and-recursively-QTN_8665042.htm
 */
public class ReverseList {
    public static class Node {
        public final int value;
        public Node next;
        public Node(int value) { this.value = value; }
    }
    public Node reverse(Node head) {
        throw new UnsupportedOperationException("TODO P23: implement your solution");
    }
}
