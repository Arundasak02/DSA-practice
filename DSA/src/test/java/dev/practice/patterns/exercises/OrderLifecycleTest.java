package dev.practice.patterns.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Tag("practice")
@Tag("design-patterns")
@Timeout(5)
class OrderLifecycleTest {

  @Test
  void happyPath() {
    var o = OrderLifecycle.create();
    assertEquals(OrderLifecycle.Status.NEW, o.status());
    o.pay();
    o.ship();
    assertEquals(OrderLifecycle.Status.SHIPPED, o.status());
  }

  @Test
  void cannotShipUnpaid() {
    var o = OrderLifecycle.create();
    assertThrows(IllegalStateException.class, o::ship);
    assertEquals(OrderLifecycle.Status.NEW, o.status());
  }

  @Test
  void canCancelBeforeShipping() {
    for (boolean pay : List.of(false, true)) {
      var o = OrderLifecycle.create();
      if (pay) {
        o.pay();
      }
      o.cancel();
      assertEquals(OrderLifecycle.Status.CANCELLED, o.status());
      assertThrows(IllegalStateException.class, o::pay);
      assertThrows(IllegalStateException.class, o::ship);
      assertThrows(IllegalStateException.class, o::cancel);
    }
  }

  @Test
  void rejectsDuplicateAndTerminalActions() {
    var o = OrderLifecycle.create();
    o.pay();
    assertThrows(IllegalStateException.class, o::pay);
    assertEquals(OrderLifecycle.Status.PAID, o.status());
    o.ship();
    assertThrows(IllegalStateException.class, o::pay);
    assertThrows(IllegalStateException.class, o::ship);
    assertThrows(IllegalStateException.class, o::cancel);
    assertEquals(OrderLifecycle.Status.SHIPPED, o.status());
  }

  @Test
  void instancesAreIndependent() {
    var a = OrderLifecycle.create();
    var b = OrderLifecycle.create();
    a.pay();
    assertEquals(OrderLifecycle.Status.NEW, b.status());
  }
}
