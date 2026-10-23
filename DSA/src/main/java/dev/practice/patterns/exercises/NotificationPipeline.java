package dev.practice.patterns.exercises;

import java.util.*;
import java.util.function.*;

/*
 * DP03 — Adapt and decorate a notification sender | 45 minutes
 * Patterns to practise: Adapter + Decorator
 * Implement adapt: convert Sender.send(recipient,text) to LegacySms.submit(text,recipient).
 * Implement logged: call log.accept("SEND:"+recipient) before exactly one delegate call.
 * Implement retrying: attempts >=1, retry only TemporaryFailure, at most attempts calls.
 * Return first success; after exhaustion rethrow the last TemporaryFailure instance.
 * Other runtime failures propagate immediately. Inputs non-null; no sleeps/network calls.
 * Design: wrappers must compose; logging outside retry logs once, inside logs per attempt.
 * Follow-up: discuss idempotency before retrying a real external notification.
 *
 * General interview-style practice; contract/tests are authored, not an exact company question.
 * Run: ./mvnw -Dtest=NotificationPipelineTest test
 * References: docs/DESIGN_PATTERNS.md#sources-and-evidence
 */
public class NotificationPipeline {
    @FunctionalInterface public interface Sender { String send(String recipient, String text); }
    @FunctionalInterface public interface LegacySms { String submit(String body, String phone); }
    public static class TemporaryFailure extends RuntimeException {}
    public static Sender adapt(LegacySms legacy) { throw new UnsupportedOperationException("TODO DP03"); }
    public static Sender logged(Sender delegate, Consumer<String> log) { throw new UnsupportedOperationException("TODO DP03"); }
    public static Sender retrying(Sender delegate, int attempts) { throw new UnsupportedOperationException("TODO DP03"); }
}
