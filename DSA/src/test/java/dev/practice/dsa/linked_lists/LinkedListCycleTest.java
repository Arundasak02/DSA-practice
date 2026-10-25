package dev.practice.dsa.linked_lists;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Tag("practice")
@Timeout(5)
class LinkedListCycleTest {

  private final LinkedListCycle sut = new LinkedListCycle();

  @Test
  void case1() {
    assertFalse(sut.hasCycle(null));
  }

  @Test
  void case2() {
    var a = new LinkedListCycle.Node(1);
    a.next = a;
    assertTrue(sut.hasCycle(a));
  }

  @Test
  void case3() {
    var a = new LinkedListCycle.Node(1);
    a.next = new LinkedListCycle.Node(1);
    assertFalse(sut.hasCycle(a));
  }

  @Test
  void case4() {
    var a = new LinkedListCycle.Node(1);
    var b = new LinkedListCycle.Node(2);
    a.next = b;
    b.next = new LinkedListCycle.Node(3);
    b.next.next = b;
    assertTrue(sut.hasCycle(a));
  }
}
