package dev.practice.backend;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Tag("practice")
@Tag("practical")
@Timeout(10)
class OrderApiTest {

  private final OrderApi sut = new OrderApi();

  @Test
  void createAndRead() throws Exception {
    var r = sut.create(new OrderApi.CreateOrder("tea", 2));
    assertEquals(201, r.status());
    assertNotNull(r.order());
    assertFalse(r.order().id().isBlank());
    assertEquals("tea", r.order().sku());
    assertEquals(2, r.order().quantity());
    assertEquals(new OrderApi.Response(200, r.order()), sut.get(r.order().id()));
  }

  @Test
  void missing() throws Exception {
    assertEquals(new OrderApi.Response(404, null), sut.get("missing"));
  }

  @Test
  void invalidQuantity() throws Exception {
    assertEquals(new OrderApi.Response(400, null), sut.create(new OrderApi.CreateOrder("tea", 0)));
    assertEquals(400, sut.create(new OrderApi.CreateOrder("tea", 101)).status());
  }

  @Test
  void invalidSku() throws Exception {
    assertEquals(400, sut.create(new OrderApi.CreateOrder("  ", 2)).status());
  }

  @Test
  void uniqueIds() throws Exception {
    var a = sut.create(new OrderApi.CreateOrder("tea", 1));
    var b = sut.create(new OrderApi.CreateOrder("tea", 1));
    assertNotEquals(a.order().id(), b.order().id());
    assertEquals(200, sut.get(a.order().id()).status());
  }

  @Test
  void boundaryAndIsolation() throws Exception {
    var r = sut.create(new OrderApi.CreateOrder("tea", 100));
    assertEquals(201, r.status());
    assertEquals(404, new OrderApi().get(r.order().id()).status());
  }

  @Test
  void updateKeepsIdAndChangesReadResult() {
    var first = sut.create(new OrderApi.CreateOrder("tea", 2)).order();
    var result = sut.update(first.id(), new OrderApi.CreateOrder("coffee", 100));
    assertEquals(new OrderApi.Response(200, new OrderApi.Order(first.id(), "coffee", 100)), result);
    assertEquals(result, sut.get(first.id()));
    assertEquals("tea", first.sku());
    assertEquals(2, first.quantity());
  }

  @Test
  void invalidUpdateDoesNotChangeExistingOrder() {
    var original = sut.create(new OrderApi.CreateOrder("tea", 2)).order();
    for (var invalid : List.of(new OrderApi.CreateOrder(" ", 1),
        new OrderApi.CreateOrder("tea", 0), new OrderApi.CreateOrder("tea", 101))) {
      assertEquals(new OrderApi.Response(400, null), sut.update(original.id(), invalid));
      assertEquals(new OrderApi.Response(200, original), sut.get(original.id()));
    }
  }

  @Test
  void updateMissingDoesNotCreate() {
    assertEquals(new OrderApi.Response(404, null),
        sut.update("absent", new OrderApi.CreateOrder("tea", 1)));
    assertEquals(new OrderApi.Response(404, null), sut.get("absent"));
  }

  @Test
  void updateValidatesBeforeLookingUpId() {
    assertEquals(new OrderApi.Response(400, null),
        sut.update("absent", new OrderApi.CreateOrder("tea", 0)));
  }

  @Test
  void deleteRemovesAndRepeatedDeleteIsMissing() {
    var order = sut.create(new OrderApi.CreateOrder("tea", 1)).order();
    assertEquals(new OrderApi.Response(204, null), sut.delete(order.id()));
    assertEquals(new OrderApi.Response(404, null), sut.get(order.id()));
    assertEquals(new OrderApi.Response(404, null), sut.delete(order.id()));
    assertEquals(new OrderApi.Response(404, null),
        sut.update(order.id(), new OrderApi.CreateOrder("tea", 2)));
  }

  @Test
  void deletingMissingIsHarmless() {
    var kept = sut.create(new OrderApi.CreateOrder("tea", 1)).order();
    assertEquals(new OrderApi.Response(404, null), sut.delete("absent"));
    assertEquals(new OrderApi.Response(200, kept), sut.get(kept.id()));
  }

  @Test
  void deletedIdIsNotReused() {
    var first = sut.create(new OrderApi.CreateOrder("tea", 1)).order();
    sut.delete(first.id());
    var second = sut.create(new OrderApi.CreateOrder("tea", 1)).order();
    assertNotEquals(first.id(), second.id());
  }

  @Test
  void updatesAndDeletesAffectOnlyTheirTargetAndInstance() {
    var a = sut.create(new OrderApi.CreateOrder("tea", 1)).order();
    var b = sut.create(new OrderApi.CreateOrder("cake", 2)).order();
    var other = new OrderApi();
    assertEquals(404, other.update(a.id(), new OrderApi.CreateOrder("coffee", 3)).status());
    assertEquals(404, other.delete(a.id()).status());
    assertEquals(new OrderApi.Response(200, a), sut.get(a.id()));
    sut.update(a.id(), new OrderApi.CreateOrder("coffee", 3));
    sut.delete(a.id());
    assertEquals(new OrderApi.Response(200, b), sut.get(b.id()));
  }
}
