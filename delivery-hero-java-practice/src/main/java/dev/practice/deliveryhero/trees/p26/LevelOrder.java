package dev.practice.deliveryhero.trees.p26;

import java.util.*;
import java.util.concurrent.*;
import java.math.*;

/*
 * P26 — Traverse a binary tree level by level | 25 minutes
 * Evidence: Recommended.
 *
 * Return each level as a list of values, top to bottom and left to right. A general binary tree, not
 * necessarily a BST. null returns an empty list. At most 100,000 nodes. Do not mutate the tree.
 *
 * Inputs/elements are non-null unless stated. Do not mutate inputs unless allowed. Edge rules and
 * tests are practice specifications.
 *
 * Example: root 1 with children 2 and 3 → [[1],[2,3]].
 * Target: O(n) time, O(maximum level width) traversal space, excluding output.
 *
 * Run: ./mvnw -Dtest=LevelOrderTest test
 * Source: curriculum recommendation; not a reported Delivery Hero question.
 */
public class LevelOrder {
    public static class Node {
        public final int value;
        public Node left, right;
        public Node(int value) { this.value = value; }
    }
    public List<List<Integer>> levels(Node root) {
        throw new UnsupportedOperationException("TODO P26: implement your solution");
    }
}
