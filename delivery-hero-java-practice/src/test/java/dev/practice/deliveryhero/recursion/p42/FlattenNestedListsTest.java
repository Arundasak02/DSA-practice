package dev.practice.deliveryhero.recursion.p42;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("recursion")
@Timeout(10)
class FlattenNestedListsTest {
    private final FlattenNestedLists sut = new FlattenNestedLists();
    @Test
    void nested() throws Exception {
        assertEquals(List.of(1,2,3,4),sut.flatten(List.of(1,List.of(2,List.of(3)),4)));
    }

    @Test
    void empties() throws Exception {
        assertEquals(List.of(),sut.flatten(List.of(List.of(),List.of(List.of()))));
    }

    @Test
    void flat() throws Exception {
        assertEquals(List.of(3,1,3),sut.flatten(List.of(3,1,3)));
    }

    @Test
    void negative() throws Exception {
        assertEquals(List.of(-2,0),sut.flatten(List.of(List.of(-2),0)));
    }

    @Test
    void copy() throws Exception {
        List<Object> a=new ArrayList<>(List.of(1));var r=sut.flatten(a);a.add(2);assertEquals(List.of(1),r);
    }
}
