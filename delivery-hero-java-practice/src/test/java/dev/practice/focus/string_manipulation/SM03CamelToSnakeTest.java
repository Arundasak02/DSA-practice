package dev.practice.focus.string_manipulation;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

@Tag("focus")
@Timeout(10)
class SM03CamelToSnakeTest {
    private final SM03CamelToSnake sut=new SM03CamelToSnake();
    @Test void camel() {
        assertEquals("delivery_hero_order",sut.convert("deliveryHeroOrder"));
    }
    @Test void acronyms() {
        assertEquals("http_server",sut.convert("HTTPServer")); assertEquals("order_id",sut.convert("orderID"));
    }
    @Test void preservesSeparators() {
        assertEquals("order2_id",sut.convert("order2ID")); assertEquals("already__snake",sut.convert("already__snake"));
    }
    @Test void boundaries() {
        assertEquals("",sut.convert("")); assertEquals("a",sut.convert("A")); assertEquals("_foo",sut.convert("_Foo"));
    }
}
