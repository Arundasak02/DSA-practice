package dev.practice.patterns.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Tag("practice")
@Tag("design-patterns")
@Timeout(5)
class TradeValidationTest {

  @Test
  void stopsAtFirstRejection() {
    var events = new ArrayList<String>();
    var c = TradeValidation.chain(List.of(t -> {
      events.add("first");
      return Optional.of("NO");
    }, t -> {
      events.add("second");
      return Optional.empty();
    }));
    assertEquals(Optional.of("NO"), c.validate(new TradeValidation.Trade(1, 1)));
    assertEquals(List.of("first"), events);
  }

  @Test
  void acceptsAndPreservesOrder() {
    var events = new ArrayList<Integer>();
    var c = TradeValidation.chain(List.of(t -> {
      events.add(1);
      return Optional.empty();
    }, t -> {
      events.add(2);
      return Optional.empty();
    }));
    assertTrue(c.validate(new TradeValidation.Trade(1, 1)).isEmpty());
    assertEquals(List.of(1, 2), events);
    assertTrue(
        TradeValidation.chain(List.of()).validate(new TradeValidation.Trade(0, 0)).isEmpty());
  }

  @Test
  void snapshotsAndPropagates() {
    var failure = new IllegalStateException();
    var list = new ArrayList<TradeValidation.Check>();
    list.add(t -> {
      throw failure;
    });
    var c = TradeValidation.chain(list);
    list.clear();
    assertSame(failure, assertThrows(IllegalStateException.class,
        () -> c.validate(new TradeValidation.Trade(1, 1))));
  }

  @Test
  void quantityRule() {
    assertEquals(Optional.of("QUANTITY"),
        TradeValidation.positiveQuantity().validate(new TradeValidation.Trade(0, 1)));
    assertTrue(
        TradeValidation.positiveQuantity().validate(new TradeValidation.Trade(1, 1)).isEmpty());
  }

  @Test
  void notionalBoundariesAndOverflow() {
    var c = TradeValidation.maxNotional(100);
    assertTrue(c.validate(new TradeValidation.Trade(2, 50)).isEmpty());
    assertEquals(Optional.of("NOTIONAL"), c.validate(new TradeValidation.Trade(Long.MAX_VALUE, 2)));
    assertTrue(c.validate(new TradeValidation.Trade(0, Long.MAX_VALUE)).isEmpty());
    assertThrows(IllegalArgumentException.class, () -> TradeValidation.maxNotional(-1));
  }
}
