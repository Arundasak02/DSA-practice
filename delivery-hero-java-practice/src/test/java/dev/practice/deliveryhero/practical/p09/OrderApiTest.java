package dev.practice.deliveryhero.practical.p09;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("practical")
@Timeout(10)
class OrderApiTest {
    private final OrderApi sut = new OrderApi();
    @Test
    void createAndRead() throws Exception {
        var r=sut.create(new OrderApi.CreateOrder("tea",2));assertEquals(201,r.status());assertNotNull(r.order());assertFalse(r.order().id().isBlank());assertEquals("tea",r.order().sku());assertEquals(2,r.order().quantity());assertEquals(new OrderApi.Response(200,r.order()),sut.get(r.order().id()));
    }

    @Test
    void missing() throws Exception {
        assertEquals(new OrderApi.Response(404,null),sut.get("missing"));
    }

    @Test
    void invalidQuantity() throws Exception {
        assertEquals(new OrderApi.Response(400,null),sut.create(new OrderApi.CreateOrder("tea",0)));assertEquals(400,sut.create(new OrderApi.CreateOrder("tea",101)).status());
    }

    @Test
    void invalidSku() throws Exception {
        assertEquals(400,sut.create(new OrderApi.CreateOrder("  ",2)).status());
    }

    @Test
    void uniqueIds() throws Exception {
        var a=sut.create(new OrderApi.CreateOrder("tea",1));var b=sut.create(new OrderApi.CreateOrder("tea",1));assertNotEquals(a.order().id(),b.order().id());assertEquals(200,sut.get(a.order().id()).status());
    }

    @Test
    void boundaryAndIsolation() throws Exception {
        var r=sut.create(new OrderApi.CreateOrder("tea",100));assertEquals(201,r.status());assertEquals(404,new OrderApi().get(r.order().id()).status());
    }
}
