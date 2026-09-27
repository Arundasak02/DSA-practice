# Study plan for a senior Java backend interview

Use roughly 75–100 minutes per session: 10 minutes recall, 25–40 minutes solving, 15 minutes testing and review, then a short retry of yesterday's weak spot. The time budgets below are preparation choices, not claims about the current interview format.

## Priorities after the broader research pass

Geography does not determine priority. Start with tasks that combine a concrete report, a reusable pattern and relevance to senior Java work. A related-role problem can be more useful than a vague senior-backend report.

| Priority | Work | Reason |
|---|---|---|
| First: coding fluency | P01, P02, P04, P05, P11, P14, P21, P39, P40, P42, P48, P49 | Short scans, maps, parsing, recursion and tests across reported roles |
| First: practical senior coding | P09, P10, P24, P34, P36, P41, P43, P46, P47, P58 | Contracts, state, TDD, collection design, SQL and extensibility |
| Then: pattern coverage | P03, P06–P08, P12–P13, P15–P20, P23, P25–P33, P35, P37–P38, P44–P45, P51–P57, P59 | Fill gaps and transfer an invariant to a new setting |
| Stretch after the basics | P50, P60 | Harder composite data structures and multi-state DP |
| Discussion throughout | SENIOR_READINESS.md | Interview success includes design, debugging and explaining real work |

These are preparation judgments, not frequency rankings or guarantees. First does not mean finish every item before doing a mock; alternate short coding and practical sessions.

## If you have only three days

| Day | Work | Outcome |
|---|---|---|
| 1 | P01, P02, P04, P14, P48; retry the weakest one | Fast, correct coding with explicit assumptions |
| 2 | P43, P09, P47; discuss P34 | Collection design, API contracts, joins and retries |
| 3 | P05 or P08, P36, one timed mock; use senior readiness checklist | Algorithm explanation, debugging and production judgment |

This is compressed: split sessions if you need more time. Add P03 if numeric parsing is weak, P57 if the round emphasizes Java concurrency, and P50 only after stack/heap basics are solid.

## Fourteen-session foundation route (original 38 exercises)

| Session | Exercises in learning order | Recognition cue |
|---|---|---|
| 1 | P01 word count → P06 lock → P07 chunk sort | Scan carefully; turn prose into exact rules |
| 2 | P14 two sum → P02 pattern words → P11 abbreviation | Lookup versus bijection versus pointer movement |
| 3 | P03 OCR compatibility → retry P01 without autocomplete | Compare logical positions without expanding |
| 4 | P33 single-trade profit → P04 max subarray → P16 subarray count | Running optimum versus prefix-history counts |
| 5 | P15 unique substring → P13 duplicate compaction | Maintain a window or a write boundary |
| 6 | P05 kth-largest → P32 top-k → P08 median | Bounded selection versus continuously maintained order |
| 7 | P17 merge intervals → P18 rooms → P37 two cities | Boundary conventions, sweep events, greedy proof |
| 8 | P19 lower bound → P20 minimum rate | Search an index, then search a monotonic answer |
| 9 | P21 brackets → P22 decoding → P12 nested maps | Explicit stack versus recursive structure |
| 10 | P23 reverse list → P24 LRU | Reference identity and constant-time updates |
| 11 | P25 BST range → P26 levels → P38 shortest path | Pruning versus breadth-first exploration |
| 12 | P27 islands → P28 dependencies → P29 clone graph | Components, cycles, identity-preserving traversal |
| 13 | P30 coin change → P31 word search → P36 debugging | Reusable subproblems versus path-local choices |
| 14 | P09 API → P10 limiter; schedule P34/P35 as a longer follow-up | Explicit contracts, state lifetime and atomicity |

Three exercises in a session can exceed 100 minutes. Split sessions 6, 9–14 across two days when needed; depth is more valuable than checking every box. After the route, revisit every failed or hint-assisted attempt.

## Pattern map

| Pattern | First question to ask | Exercises |
|---|---|---|
| Scanning / two pointers | Can I advance through the input without revisiting positions? | 01, 03, 06, 11, 13 |
| Hash maps / prefix sums | What earlier information would make this decision constant-time? | 02, 14, 16 |
| Sliding window | What invariant defines a valid current window? | 15, 10, 35 |
| Running optimum | What is the best answer ending here or seen so far? | 04, 33 |
| Heaps / streaming | Do I need all values ordered, or just an extreme or boundary? | 05, 08, 32 |
| Sort / intervals / greedy | Does sorting expose overlap or a provable exchange rule? | 07, 17, 18, 37 |
| Binary search | Is there a monotonic false/true boundary? | 19, 20 |
| Stacks / recursive data | What unfinished context must I restore next? | 21, 22, 12 |
| Lists / cache design | Which references and recency invariants must stay consistent? | 23, 24 |
| Trees / BFS / DFS | Is this pruning, levels, components, cycles or shortest hops? | 25–29, 38 |
| Dynamic programming | Which repeated subproblem completely describes future choices? | 30 |
| Backtracking | Which choice must be undone when this path fails? | 31 |
| Stateful backend coding | What is atomic, idempotent, time-bound or externally observable? | 09, 10, 34–36 |

Recognition cues are prompts, not instructions to force every problem into a memorized template. Work out the invariant before choosing a data structure.

## Mock interviews

- **20-minute coding:** P01 or P05 from a blank editor; reserve the last 5 minutes for edge cases and complexity.
- **45-minute technical:** 10 minutes on a real project tradeoff, 25 minutes P03 or P08, 10 minutes on tests and changed constraints.
- **75-minute assessment practice:** P06, P02, P04, P19. This is an authored mock, not the reported assessment's original questions.
- **60-minute practical:** P09 core for 30 minutes, then validation, persistence, HTTP mapping and retry discussion. Optional second session: implement and test the HTTP adapter.
- **60-minute senior follow-up:** P34 or P35; explain process crashes, concurrent calls and what must be persisted. Use P36 for a separate debugging session.

Score each attempt 0–2 on requirements, correctness, complexity, tests and communication. Retry anything below 8/10. Passing JUnit alone does not measure whether you can explain your decisions.

## Use your experience deliberately

Your stated Java/Kafka brokerage background is a useful source of concrete examples. For P34, connect duplicate order submissions to idempotency; for P35, connect replayed events to business-side effects; for P10, discuss protecting an API under bursts. Keep employer implementation details private and use invented examples.

The supplied CV also lists Spring, Elasticsearch, Redis, databases, observability and deployment tooling. Be ready to explain what you personally built, why you chose it, one failure mode and what you would change. These are preparation prompts; this project does not reproduce your CV or contact details.

## Finishing an exercise

1. State assumptions before coding, including empty input, duplicates, mutation and overflow.
2. Explain a straightforward approach and its complexity.
3. Identify the invariant that enables improvement.
4. Implement without opening the hint or an external solution.
5. Run the named tests and add one adversarial case.
6. Explain behavior under one changed constraint from the problem's follow-up.
7. Record elapsed time and retry dates in PROGRESS.md.

## Extension sessions for the new exercises

Choose these by your weaknesses; keep reported and recommended problems mixed so you learn transferable skills.

| Session | Exercises | Focus |
|---|---|---|
| A | P40 → P39 → P45 → P49 | Precise scans, stable ordering and character counts |
| B | P48 → P41 → P43 | Maps/sets, reconciliation and a clean stateful API |
| C | P42 → P12 retry → P36 retry | Nested data, copying and debugging |
| D | P47 → P46 | Join cardinality, NULL handling and distinct ranking |
| E | P51 → P53 → P54 | In-place transformations and greedy invariants |
| F | P52 → P38 retry → P56 | Tree gaps, unweighted BFS and weighted shortest paths |
| G | P55 → P08 retry → P50 | Prefix selection, streaming order and a composite structure |
| H | P57 → P34 retry → P58 | Coordination, atomicity and changing OOP requirements |
| I | P44 → P59 → P60 | Grid scans, counting DP and state-based optimization |

For a broader 75-minute mock choose P39, P48, P41 and P47. For a practical 60-minute mock choose P43 with 15 minutes reserved for requirement changes and tests. For a design rehearsal use the bicycle-rental prompt in SENIOR_READINESS.md. All mock combinations are authored, not reconstructions of an original assessment.
