package dev.practice.deliveryhero.recursion.p12;

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
class CamelCaseMapTest {
    private final CamelCaseMap sut = new CamelCaseMap();
    @Test
    void simple() throws Exception {
        assertEquals(Map.of("firstName","Arun"),sut.convert(Map.of("first_name","Arun")));
    }

    @Test
    void nested() throws Exception {
        assertEquals(Map.of("userInfo",Map.of("lastName","AK")),sut.convert(Map.of("user_info",Map.of("last_name","AK"))));
    }

    @Test
    void empty() throws Exception {
        assertEquals(Map.of(),sut.convert(Map.of()));
    }

    @Test
    void valueUnchanged() throws Exception {
        assertEquals(Map.of("name","snake_value"),sut.convert(Map.of("name","snake_value")));
    }

    @Test
    void collision() throws Exception {
        assertThrows(IllegalArgumentException.class,()->sut.convert(Map.of("first_name","a","firstName","b")));
    }

    @Test
    void deepCopy() throws Exception {
        Map<String,Object> inner=new HashMap<>(Map.of("x_y","v"));Map<String,Object> root=new HashMap<>();root.put("a_b",inner);var out=sut.convert(root);assertNotSame(root,out);assertNotSame(inner,out.get("aB"));assertTrue(inner.containsKey("x_y"));
    }
}
