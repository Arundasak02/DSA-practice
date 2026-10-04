package dev.practice.deliveryhero.strings.p66;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

@Tag("practice")
@Tag("strings")
@Timeout(10)
class SnakeCaseTest {
    private final SnakeCase sut = new SnakeCase();
    @Test void simple() { assertEquals("delivery_hero_order", sut.convert("deliveryHeroOrder")); }
    @Test void acronyms() { assertEquals("http_server", sut.convert("HTTPServer")); assertEquals("order_id", sut.convert("orderID")); assertEquals("xml_http_request", sut.convert("XMLHttpRequest")); }
    @Test void boundaries() { assertEquals("", sut.convert("")); assertEquals("a", sut.convert("A")); assertEquals("http", sut.convert("HTTP")); }
    @Test void digits() { assertEquals("version2_http", sut.convert("version2HTTP")); assertEquals("http2_server", sut.convert("HTTP2Server")); }
    @Test void underscores() { assertEquals("already_snake", sut.convert("already_snake")); assertEquals("_http_server", sut.convert("_HTTPServer")); assertEquals("order__id", sut.convert("order__ID")); }
    @Test void consecutiveWords() { assertEquals("a_bc", sut.convert("aBC")); }
    @Test void nullRejected() { assertThrows(NullPointerException.class, () -> sut.convert(null)); }
}
