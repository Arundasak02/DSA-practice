# P35 — Deduplicate events with an expiry window

**Pattern:** practical · **Time box:** 40 minutes  
**Evidence:** Recommended · tailored to event-driven Java work. Curriculum recommendation; not claimed as a Delivery Hero question.

## Task and contract

Construct with positive ttlMillis. accept(eventId,now) returns true for a new ID or one whose accepted timestamp is at most now-ttlMillis; otherwise false. Rejected duplicates do not refresh expiry. Calls are single-threaded and globally nondecreasing in time, 0..10^12. Exact expiry is accepted. Retain state only for IDs whose latest accepted timestamps are in (now-ttlMillis,now]. IDs are non-null strings; up to 100,000 calls. Implement retainedIds() to expose active storage size after the most recent accept.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

TTL=10: a@0 accepted, a@9 rejected, a@10 accepted.

## Work here

- Solution: [EventDeduplicator.java](EventDeduplicator.java)
- Tests: [EventDeduplicatorTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/practical/p35/EventDeduplicatorTest.java)
- Run from the project root: `./mvnw -Dtest=EventDeduplicatorTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

Amortized O(1) accept; space proportional to unexpired distinct IDs. Tests check behavior, not a proof of complexity.

## Senior follow-up

Differentiate duplicate suppression from exactly-once business effects. Explain transactional offset handling, late events, event time vs processing time, and memory bounds.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
