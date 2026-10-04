# Senior Java/backend discussion practice

Pair this with the coding schedule. These are preparation prompts, not claims that every question was asked. The [Java backend account](https://leetcode.com/discuss/post/8281420/) specifically discusses Java abstractions, Kafka and PostgreSQL; the [Berlin SEII account](https://leetcode.com/discuss/post/4168834/Delivery-Hero-SEII/) adds REST, transactions, concurrency and operational concerns.

| Area | Rehearse aloud using your brokerage work |
|---|---|
| Java | Functional interface vs abstract class; equality and hash keys; immutability; exception boundaries; comparator overflow; collection complexity. |
| Concurrency | Atomicity vs visibility, lock scope, interruption, deadlock, bounded queues, thread-pool saturation; identify a check-then-act race. |
| APIs | Validation, status codes, idempotency keys, conflicting retries, timeouts, rate limiting, safe retries and test layers. |
| SQL | JOIN cardinality, WHERE vs HAVING, index selectivity, query plans, transaction isolation and locks. H2 practice is not proof of PostgreSQL-specific behavior. |
| Kafka | Partition-key choice, ordering scope, replay, consumer offsets, failure between a DB write and acknowledgement, outbox tradeoffs. Avoid claiming exactly-once business effects from a single broker setting. |
| Testing/design | A small working design, clear names, dependency boundaries, focused tests, production logging and metrics. Name patterns only when they solve a concrete problem. |
| Project depth | Explain your role, measured workload, consistency needs, failure mode, alternatives rejected and outcome. Use actual figures; anonymize confidential details. |

Rehearse two 45-minute design discussions: an order/payment flow with safe retries, and an adapter between an internal service and multiple warehouse systems. The latter is reported in an October 2025 [Berlin senior interview](https://www.glassdoor.com/Interview/Delivery-Hero-Senior-Software-Engineer-Interview-Questions-EI_IE504556.0,13_KO14,38_IP2.htm). Clarify requirements briefly, then spend most of the time on data/API boundaries, failure handling and concrete tradeoffs.

Prepare three real stories: a production incident, a design disagreement, and a delivery you led. Explain your actions and results rather than just describing your team's architecture. A senior interview can be lost outside the coding round even when the algorithms pass.
