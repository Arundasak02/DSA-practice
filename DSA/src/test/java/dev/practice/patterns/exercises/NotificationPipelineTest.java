package dev.practice.patterns.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Tag("practice")
@Tag("design-patterns")
@Timeout(5)
class NotificationPipelineTest {

  @Test
  void adaptsArgumentOrder() {
    assertEquals("body/123",
        NotificationPipeline.adapt((body, phone) -> body + "/" + phone).send("123", "body"));
  }

  @Test
  void logsBeforeCall() {
    var events = new ArrayList<String>();
    var s = NotificationPipeline.logged((r, t) -> {
      events.add("delegate");
      return "ok";
    }, events::add);
    assertEquals("ok", s.send("a", "b"));
    assertEquals(List.of("SEND:a", "delegate"), events);
  }

  @Test
  void retriesOnlyTransientFailures() {
    var count = new AtomicInteger();
    var s = NotificationPipeline.retrying((r, t) -> {
      if (count.incrementAndGet() < 3) {
        throw new NotificationPipeline.TemporaryFailure();
      }
      return "ok";
    }, 3);
    assertEquals("ok", s.send("a", "b"));
    assertEquals(3, count.get());
  }

  @Test
  void propagatesLastFailure() {
    var count = new AtomicInteger();
    var failure = new NotificationPipeline.TemporaryFailure();
    var s = NotificationPipeline.retrying((r, t) -> {
      count.incrementAndGet();
      throw failure;
    }, 2);
    assertSame(failure,
        assertThrows(NotificationPipeline.TemporaryFailure.class, () -> s.send("a", "b")));
    assertEquals(2, count.get());
    assertThrows(IllegalArgumentException.class,
        () -> NotificationPipeline.retrying((r, t) -> "ok", 0));
  }

  @Test
  void compositionAndPermanentFailure() {
    var logs = new ArrayList<String>();
    var calls = new AtomicInteger();
    var s = NotificationPipeline.logged(NotificationPipeline.retrying((r, t) -> {
      calls.incrementAndGet();
      throw new IllegalStateException();
    }, 3), logs::add);
    assertThrows(IllegalStateException.class, () -> s.send("a", "b"));
    assertEquals(1, calls.get());
    assertEquals(List.of("SEND:a"), logs);
  }
}
