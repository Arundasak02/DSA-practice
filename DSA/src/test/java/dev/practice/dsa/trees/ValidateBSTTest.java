package dev.practice.dsa.trees;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

@Tag("practice")
@Timeout(5)
class ValidateBSTTest {
    private final ValidateBST sut = new ValidateBST();
    @Test void case1() { assertTrue(sut.valid(null)); }
    @Test void case2() { var r=new ValidateBST.Node(0); r.left=new ValidateBST.Node(Integer.MIN_VALUE); r.right=new ValidateBST.Node(Integer.MAX_VALUE); assertTrue(sut.valid(r)); }
    @Test void case3() { var r=new ValidateBST.Node(5); r.right=new ValidateBST.Node(8); r.right.left=new ValidateBST.Node(4); assertFalse(sut.valid(r)); }
    @Test void case4() { var r=new ValidateBST.Node(2); r.left=new ValidateBST.Node(2); assertFalse(sut.valid(r)); }
}
