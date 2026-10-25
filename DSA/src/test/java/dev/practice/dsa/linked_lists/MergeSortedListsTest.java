package dev.practice.dsa.linked_lists;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Tag("practice")
@Timeout(5)
class MergeSortedListsTest {

  private final MergeSortedLists sut = new MergeSortedLists();

  @Test
  void case1() {
    var a = new MergeSortedLists.Node(1);
    var b = new MergeSortedLists.Node(2);
    a.next = new MergeSortedLists.Node(3);
    var tail = a.next;
    var out = sut.merge(a, b);
    assertSame(a, out);
    assertSame(b, out.next);
    assertSame(tail, out.next.next);
    assertNull(tail.next);
  }

  @Test
  void case2() {
    assertNull(sut.merge(null, null));
  }

  @Test
  void case3() {
    var a = new MergeSortedLists.Node(2);
    assertSame(a, sut.merge(null, a));
  }

  @Test
  void case4() {
    var a = new MergeSortedLists.Node(1);
    var b = new MergeSortedLists.Node(1);
    var out = sut.merge(a, b);
    assertTrue(out == a || out == b);
    assertSame(out == a ? b : a, out.next);
    assertNull(out.next.next);
  }
}
