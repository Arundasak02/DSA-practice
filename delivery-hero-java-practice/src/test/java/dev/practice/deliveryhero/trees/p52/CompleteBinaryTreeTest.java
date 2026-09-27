package dev.practice.deliveryhero.trees.p52;

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
class CompleteBinaryTreeTest {
    private final CompleteBinaryTree sut = new CompleteBinaryTree();
    @Test
    void full() throws Exception {
        var r=new CompleteBinaryTree.Node(1);r.left=new CompleteBinaryTree.Node(2);r.right=new CompleteBinaryTree.Node(3);assertTrue(sut.isComplete(r));
    }

    @Test
    void leftOnly() throws Exception {
        var r=new CompleteBinaryTree.Node(1);r.left=new CompleteBinaryTree.Node(2);assertTrue(sut.isComplete(r));
    }

    @Test
    void rightOnly() throws Exception {
        var r=new CompleteBinaryTree.Node(1);r.right=new CompleteBinaryTree.Node(2);assertFalse(sut.isComplete(r));
    }

    @Test
    void gap() throws Exception {
        var r=new CompleteBinaryTree.Node(1);r.left=new CompleteBinaryTree.Node(2);r.right=new CompleteBinaryTree.Node(3);r.right.left=new CompleteBinaryTree.Node(4);assertFalse(sut.isComplete(r));
    }

    @Test
    void empty() throws Exception {
        assertTrue(sut.isComplete(null));
    }

    @Test
    void tooDeepLeft() throws Exception {
        var r=new CompleteBinaryTree.Node(1);r.left=new CompleteBinaryTree.Node(2);r.left.left=new CompleteBinaryTree.Node(3);assertFalse(sut.isComplete(r));
    }
}
