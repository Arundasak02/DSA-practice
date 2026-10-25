package dev.practice.dsa.trees;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Tag("practice")
@Timeout(5)
class TreeDepthTest {

  private final TreeDepth sut = new TreeDepth();

  @Test
  void case1() {
    assertEquals(0, sut.depth(null));
  }

  @Test
  void case2() {
    assertEquals(1, sut.depth(new TreeDepth.Node(1)));
  }

  @Test
  void case3() {
    var r = new TreeDepth.Node(1);
    r.left = new TreeDepth.Node(2);
    r.left.right = new TreeDepth.Node(3);
    r.right = new TreeDepth.Node(4);
    assertEquals(3, sut.depth(r));
  }
}
