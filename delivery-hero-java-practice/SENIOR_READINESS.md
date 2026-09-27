# Senior Java interview readiness

Use this alongside coding practice, not as an answer script. Prompts below are authored rehearsals unless explicitly identified as reported topics. Aim to support an answer with a concrete tradeoff, a failure mode, a test or measurement, and a real example you can discuss without confidential details.

[Delivery Hero's official hiring page](https://careers.deliveryhero.com/howwehire) describes a domain-focused technical assessment and says the sequence can vary by team. Confirm the exact format, language and tooling with the recruiter. There is no single published company-wide algorithm syllabus.

## Java foundations to connect to your exercises

| Area | Rehearsal prompt | Practice anchor |
|---|---|---|
| Collections | When do equals/hashCode bugs break a map? What if a mutable key changes after insertion? What does a comparator have to guarantee? | P02, P05, P24, P43 |
| Copying and ownership | Is a record deeply immutable? Is returning an unmodifiable view the same as returning a snapshot? What is shared after a shallow copy? | P12, P29, P41–P43 |
| Memory and lifecycle | Why can a cache or per-client map grow forever? Which metric or heap evidence would distinguish retention from allocation pressure? | P10, P24, P35 |
| Concurrency | Explain visibility versus atomicity. Why can a check-then-act sequence race despite using a concurrent map? | P34, P57 |
| Coordination | Why use a condition loop? How does interruption propagate? What happens when an executor saturates? | P57 |
| Numeric correctness | When can sums or comparators overflow? Why should money rounding be an explicit domain rule? | P04, P08, P36, P58 |
| Testing | Which boundary test disproves your first implementation? What would you mock, and what should remain a real integration test? | P09, P36, P46–P47 |

Sorting complexity, copying, code review and memory leaks appear in the role-specific sources [S11](research/SOURCES.md#s11) and [S18](research/SOURCES.md#s18). Java-specific rehearsals here are recommendations, not verbatim questions from those reports.

## Backend and SQL discussion

| Area | Explain or demonstrate |
|---|---|
| SQL joins/ranking | INNER versus LEFT cardinality; NULL; WHERE versus ON; distinct rank versus row number. Extend P47 with a filter while preserving customers without matching orders. |
| Query performance | Read an execution plan; choose a compound index for a real access pattern; explain write and storage costs. Tiny H2 fixtures validate results, not production PostgreSQL performance. |
| Transactions | Explain atomicity, isolation and an anomaly with two concurrent requests. State the transaction boundary before naming an isolation level. |
| Kafka | Partition ordering, consumer groups, offsets, retries, poison messages and replay. Explain the difference between duplicate suppression and an exactly-once business effect. |
| Reliability | Choose a timeout budget, retry policy and idempotency key. Explain why retries during an outage can increase load. |
| Microservices | Show how an outbox or saga would handle an order persisted locally while a downstream service is unavailable. Identify compensation limits. |
| API design | Validation, status codes, error response shape, pagination, versioning, authentication and tenant isolation. |
| Operations | Starting from rising p99 latency, choose the next measurement before changing the system. Include tracing, logs and database/pool saturation. |

Related reports discuss SQL, idempotency, backend design and production work: [S1](research/SOURCES.md#s1), [S4](research/SOURCES.md#s4), [S7](research/SOURCES.md#s7), [S19](research/SOURCES.md#s19), [S20](research/SOURCES.md#s20). The full checklist above is a curated preparation scope, not a claim every item was asked.

## Design rehearsal: bicycle rental

**Reported topic:** a Glovo senior candidate names bicycle-rental system and class design in [S15](research/SOURCES.md#s15). The requirements below are authored.

Time box: 45 minutes. Start with one city and physical stations. Customers rent a bicycle, return it to a station and are charged by elapsed time. A station has finite docks. Two customers may try to rent the same bicycle.

Produce:

1. Your clarification questions and an explicit scope.
2. A small domain model and the invariants around rental, return and payment.
3. API contracts and failure responses.
4. Persistence and concurrency decisions for a double-rental race.
5. Five tests or scenarios, including a full destination station and a payment timeout.
6. One scaling change and the tradeoff it introduces.

Review whether each abstraction has a purpose. Explain what remains correct when payment is retried or the process crashes. No sample architecture is supplied; your reasoning is the exercise.

## Design rehearsal: an order pipeline

A simple food-delivery design topic appears in [S20](research/SOURCES.md#s20). Use invented traffic estimates and state them as assumptions.

Design create-order, payment authorization, restaurant acceptance, courier assignment and customer status updates. Choose two failure paths: duplicate submission and an accepted payment followed by a failed order write. Draw the state transitions and identify where idempotency, event ordering and reconciliation belong. Tie your design back to P09, P34 and P35.

For your Fidelity experience, prepare a comparable explanation of a transaction lifecycle you personally helped build. Explain your ownership and one measured tradeoff without reproducing internal designs or confidential numbers.

## Behavioral evidence to prepare

Prepare five short examples: production incident, technical disagreement, simplifying a design, mentoring someone, and a mistake that changed your approach. For each, note the situation, your decision, alternatives, result and what you would change now. Use follow-up questions to test whether you can go deeper rather than memorizing a speech.

## Self-review before the interview

- Can I solve two short exercises from a blank editor, explain complexity and add edge tests within 40 minutes?
- Can I implement a stateful component such as P43 or P10 while keeping its contract coherent?
- Can I explain why passing a concurrent test is not proof of thread safety?
- Can I write and run a join or ranking query without losing rows or mishandling ties?
- Can I defend one design choice and change it when the interviewer changes a constraint?
- Can I distinguish what I personally implemented from what my team owned?
