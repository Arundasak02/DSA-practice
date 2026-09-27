package dev.practice.deliveryhero.linked_lists.p23;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("linked_lists")
@Timeout(10)
class ReverseListTest {
    private final ReverseList sut = new ReverseList();
    @Test
    void chain() throws Exception {
        var a=new ReverseList.Node(1);var b=new ReverseList.Node(2);var c=new ReverseList.Node(3);a.next=b;b.next=c;var r=sut.reverse(a);assertSame(c,r);assertSame(b,c.next);assertSame(a,b.next);assertNull(a.next);
    }

    @Test
    void empty() throws Exception {
        assertNull(sut.reverse(null));
    }

    @Test
    void single() throws Exception {
        var a=new ReverseList.Node(9);assertSame(a,sut.reverse(a));assertNull(a.next);
    }

    @Test
    void two() throws Exception {
        var a=new ReverseList.Node(4);var b=new ReverseList.Node(4);a.next=b;assertSame(b,sut.reverse(a));assertSame(a,b.next);assertNull(a.next);
    }

    @Test
    void twice() throws Exception {
        var a=new ReverseList.Node(1);var b=new ReverseList.Node(2);a.next=b;assertSame(a,sut.reverse(sut.reverse(a)));assertSame(b,a.next);assertNull(b.next);
    }
}
