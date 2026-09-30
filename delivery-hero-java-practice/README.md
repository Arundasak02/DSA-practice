# Delivery Hero — Senior Java interview preparation

A source-linked practice workspace for an experienced Java backend engineer. **65 exercises, 373 exercise tests, Java 17+, Maven, JUnit 5. No completed solutions.** P36 is intentionally buggy starter code for a debugging round.

## Start here

1. Open this folder or import `pom.xml` as a Maven project in IntelliJ IDEA, Eclipse or VS Code. Select JDK 17 or newer. No Spring, Docker or external database setup is required. SQL exercises use test-scoped H2 in memory.
2. Run `./mvnw -Dtest=WorkspaceSmokeTest test` to verify your environment.
3. Start with **P14 → P19 → P61 → P01 → P04 → P05**, following the linked exercises below. Edit the neighboring Java file and run its named test.
4. Follow [the study plan](STUDY_PLAN.md) and mark your progress in [PROGRESS.md](PROGRESS.md).

On Windows use `mvnw.cmd` instead of `./mvnw`. If Maven is already installed, `mvn` works too. First use downloads Maven/dependencies and needs internet. Later runs use your Maven cache.

```sh
./mvnw -Dtest=WorkspaceSmokeTest test    # environment and workspace checks
./mvnw -DskipTests package              # compile all sources AND tests; package the stubs
./mvnw -Dtest=WordCountTest test         # one exercise
./mvnw -Dtest='WordCountTest,PatternWordsTest' test
./mvnw -Dgroups=strings test            # a pattern group
./mvnw -Dgroups=sql test                # in-memory SQL exercises
./mvnw -Dtest=InsertionOrderedSetTest test  # reported foodpanda task
./mvnw test                            # whole bank: RED until exercises are implemented
```

**A fresh `mvn test` is supposed to fail.** The exercise methods throw `UnsupportedOperationException("TODO...")`; tests are real assertions and are neither disabled nor silently skipped. P36 has deliberate bugs. A green smoke check verifies setup only, not your solutions. See [VALIDATION.md](VALIDATION.md) for the delivered verification results.

## What the evidence means

- **Reported:** a candidate account explicitly names the problem. It is self-reported, not employer-confirmed. The Java signatures, constraints and tests are newly authored.
- **Adapted:** the account names a topic or vague task; this workspace supplies explicit practice requirements. Do not claim these are exact questions.
- **Related-role/company:** useful transfer practice, with the role/geography difference preserved.
- **Recommended:** selected to teach a reusable pattern; no claim it was asked at Delivery Hero.

Research checked and broadened **27 September 2026** across locations and relevant roles, including foodpanda, Glovo and HungerStation. Public reports cannot establish *all* historical questions or predict your interview. Evidence spans older concrete reports and newer candidate/process accounts. Priorities reflect transfer to a senior Java interview; geography is context, not an exclusion rule. No frequency percentages or paid-bank claims are treated as evidence. Read the [source ledger](research/SOURCES.md) and [search log](research/SEARCH_LOG.md).

The bank now includes reported collection reconciliation, nested-list flattening, alternate-character masking, an insertion-ordered set and Dinner Plate Stacks, plus SQL joins/ranking and additional recommended patterns. Existing P14, P21 and P23 gained role-specific evidence without changing their solution files. See [what the second research pass found](research/SECOND_PASS.md).

Use [the broader priority plan](STUDY_PLAN.md) to decide what to solve next. Also use the [senior readiness guide](SENIOR_READINESS.md) for Java, SQL, design and production discussions. [Extension references](research/EXTENSION_BACKLOG.md) record lower-priority discoveries without claiming they are all verified interview questions.

## Learning priorities

Updated **30 September 2026** for Senior Java/backend preparation. Numerical asking probabilities would be misleading: public reports are not a representative sample.

| Tier | Action | Interpretation |
|---|---|---|
| A | **Learn first** | Strong reported relevance, or a practical adaptation of relevant interview evidence |
| B | **Learn next** | Older/different role/company evidence or useful backend practice |
| C | **Insurance** | Transferable pattern, limited direct evidence |
| LAST | **Learn last** | Lower value under a short deadline; still available for later preparation |

Priority is separate from evidence. **Adapted** tasks are not exact historical questions. See [the priority audit](PRIORITIES.md), [the revised study plan](STUDY_PLAN.md), and [SQL drills](SQL_DRILLS.md). All 60 original exercise IDs, starter files and tests remain available. General trees/graphs/DP are removed from the short study route, not deleted.

**Added:** P61 camelCase→snake_case, P62 LFU, P63 adapted continuous-stream rolling average, P64 duplicate-index Two Sum, P65 Jump Game reachability. P19 is a lower-bound adaptation of an unspecified binary-search task; P63 is not claimed to be the exact operation from the report. The LFU account concerns a Python role.

## Choose your next exercise

Time boxes are practice suggestions, not claimed interview durations. IDs are stable; the table is sorted by study order rather than numerical ID. Every problem folder contains the task, input/output contract, test link, complexity target, and optional collapsed hint when useful.

| Order | ID | Priority | Exercise | Pattern | Evidence | Minutes |
|---:|---|---|---|---|---|---:|
| 1 | P14 | **A — Learn first** | [Find two indices for a target](src/main/java/dev/practice/deliveryhero/hashing/p14/README.md) | hashing | Reported · Delivery Hero Senior SWE and mid-level Android | 20 |
| 2 | P19 | **A — Learn first** | [First position at least the target](src/main/java/dev/practice/deliveryhero/binary_search/p19/README.md) | binary search | Adapted · Java backend report names binary search; lower-bound variant authored | 20 |
| 3 | P61 | **A — Learn first** | [Convert camelCase to snake_case](src/main/java/dev/practice/deliveryhero/strings/p61/README.md) | strings | Reported · Senior SWE; acronym rules authored | 25 |
| 4 | P01 | **A — Learn first** | [Count words](src/main/java/dev/practice/deliveryhero/strings/p01/README.md) | strings | Reported · Berlin SE2/SSE1 and SE II | 15 |
| 5 | P04 | **A — Learn first** | [Maximum contiguous subarray sum](src/main/java/dev/practice/deliveryhero/arrays/p04/README.md) | arrays | Reported · Berlin SE2/SSE1 | 25 |
| 6 | P05 | **A — Learn first** | [Largest, second-largest and kth-largest](src/main/java/dev/practice/deliveryhero/heaps/p05/README.md) | heaps | Reported · Berlin SE II; duplicate policy added | 25 |
| 7 | P02 | **A — Learn first** | [Find words with the same repetition pattern](src/main/java/dev/practice/deliveryhero/strings/p02/README.md) | strings | Reported · Berlin SE II | 25 |
| 8 | P03 | **A — Learn first** | [Compare OCR strings with unknown runs](src/main/java/dev/practice/deliveryhero/strings/p03/README.md) | strings | Reported · Berlin SE2/SSE1; grammar reconstructed | 40 |
| 9 | P40 | **A — Learn first** | [Find minimum and maximum in one pass](src/main/java/dev/practice/deliveryhero/arrays/p40/README.md) | arrays | Reported · Delivery Hero senior React | 10 |
| 10 | P41 | **A — Learn first** | [Plan inserts, updates and removals](src/main/java/dev/practice/deliveryhero/hashing/p41/README.md) | hashing | Adapted · Delivery Hero senior React; reported example inconsistent | 25 |
| 11 | P42 | **A — Learn first** | [Flatten a nested list](src/main/java/dev/practice/deliveryhero/recursion/p42/README.md) | recursion | Reported · Delivery Hero senior Python; recursive Java variant | 25 |
| 12 | P36 | **A — Learn first** | [Debug a small invoice service](src/main/java/dev/practice/deliveryhero/practical/p36/README.md) | practical | Adapted · Glovo report describes debugging, actual service undisclosed | 30 |
| 13 | P09 | **A — Learn first** | [Build two order API operations](src/main/java/dev/practice/deliveryhero/practical/p09/README.md) | practical | Adapted · Berlin SE II report names two REST APIs, no endpoints | 45 |
| 14 | P10 | **A — Learn first** | [Per-client sliding-window rate limiter](src/main/java/dev/practice/deliveryhero/practical/p10/README.md) | practical | Adapted · Berlin API-abuse follow-up; algorithm not specified | 40 |
| 15 | P47 | **A — Learn first** | [Join customers with their orders](src/main/java/dev/practice/deliveryhero/sql/p47/README.md) | sql | Adapted · Delivery Hero senior Python SQL join report | 25 |
| 16 | P08 | **A — Learn first** | [Maintain the median of a stream](src/main/java/dev/practice/deliveryhero/heaps/p08/README.md) | heaps | Reported · Berlin senior Go | 40 |
| 17 | P63 | **A — Learn first** | [Maintain a rolling average over a continuous stream](src/main/java/dev/practice/deliveryhero/practical/p63/README.md) | practical | Adapted · Java backend stream-processing task; operation undisclosed | 30 |
| 18 | P64 | **A — Learn first** | [Return all Two-Sum index pairs with duplicates](src/main/java/dev/practice/deliveryhero/hashing/p64/README.md) | hashing | Adapted · reported duplicate-index task; full output contract authored | 30 |
| 19 | P62 | **B — Learn next** | [Implement an LFU cache](src/main/java/dev/practice/deliveryhero/linked_lists/p62/README.md) | linked lists | Related-role report · Python; LRU tie-breaking authored | 50 |
| 20 | P12 | **B — Learn next** | [Convert nested map keys to camelCase](src/main/java/dev/practice/deliveryhero/recursion/p12/README.md) | recursion | Related-company report · Glovo Spain; Java attempt | 35 |
| 21 | P65 | **B — Learn next** | [Determine whether the last index is reachable](src/main/java/dev/practice/deliveryhero/greedy/p65/README.md) | greedy | Reported · Senior SWE in Python context; Java contract authored | 20 |
| 22 | P21 | **B — Learn next** | [Validate bracket nesting](src/main/java/dev/practice/deliveryhero/stacks/p21/README.md) | stacks | Reported · Glovo senior software engineer | 20 |
| 23 | P48 | **B — Learn next** | [Check whether two strings are anagrams](src/main/java/dev/practice/deliveryhero/hashing/p48/README.md) | hashing | Reported · Glovo senior software engineer | 15 |
| 24 | P06 | **B — Learn next** | [Minimum rotations of a combination lock](src/main/java/dev/practice/deliveryhero/arrays/p06/README.md) | arrays | Reported · Berlin senior Go; wheel rules reconstructed | 15 |
| 25 | P07 | **B — Learn next** | [Sort each consecutive chunk](src/main/java/dev/practice/deliveryhero/arrays/p07/README.md) | arrays | Reported · Berlin senior Go; ambiguous wording adapted | 25 |
| 26 | P23 | **B — Learn next** | [Reverse a singly linked list](src/main/java/dev/practice/deliveryhero/linked_lists/p23/README.md) | linked lists | Reported · foodpanda software engineer, Singapore | 25 |
| 27 | P34 | **B — Learn next** | [Create orders safely under duplicate retries](src/main/java/dev/practice/deliveryhero/practical/p34/README.md) | practical | Recommended · related idempotency topic reported, task authored | 45 |
| 28 | P35 | **B — Learn next** | [Deduplicate events with an expiry window](src/main/java/dev/practice/deliveryhero/practical/p35/README.md) | practical | Recommended · tailored to event-driven Java work | 40 |
| 29 | P43 | **B — Learn next** | [Design a set with insertion order and stack-like pop](src/main/java/dev/practice/deliveryhero/practical/p43/README.md) | practical | Reported · foodpanda principal engineer | 45 |
| 30 | P46 | **B — Learn next** | [Second distinct salary per department](src/main/java/dev/practice/deliveryhero/sql/p46/README.md) | sql | Adapted · Delivery Hero data engineer salary-ranking report | 30 |
| 31 | P57 | **B — Learn next** | [Implement a bounded blocking FIFO queue](src/main/java/dev/practice/deliveryhero/concurrency/p57/README.md) | concurrency | Recommended · Java translation of concurrency preparation | 50 |
| 32 | P11 | **B — Learn next** | [Validate a word abbreviation](src/main/java/dev/practice/deliveryhero/strings/p11/README.md) | strings | Related-role report · senior automation, location not established | 25 |
| 33 | P13 | **B — Learn next** | [Keep at most two copies in a sorted array](src/main/java/dev/practice/deliveryhero/arrays/p13/README.md) | arrays | Adapted · older SE II report; original wording ambiguous | 25 |
| 34 | P39 | **B — Learn next** | [Mask every second character of each word](src/main/java/dev/practice/deliveryhero/strings/p39/README.md) | strings | Reported · Delivery Hero Android; boundaries defined for practice | 15 |
| 35 | P15 | **C — Insurance** | [Longest substring without repeated characters](src/main/java/dev/practice/deliveryhero/sliding_window/p15/README.md) | sliding window | Recommended | 25 |
| 36 | P16 | **C — Insurance** | [Count subarrays with a target sum](src/main/java/dev/practice/deliveryhero/hashing/p16/README.md) | hashing | Recommended | 25 |
| 37 | P17 | **C — Insurance** | [Merge closed intervals](src/main/java/dev/practice/deliveryhero/intervals/p17/README.md) | intervals | Recommended | 25 |
| 38 | P18 | **C — Insurance** | [Minimum simultaneous meeting rooms](src/main/java/dev/practice/deliveryhero/intervals/p18/README.md) | intervals | Recommended | 25 |
| 39 | P20 | **C — Insurance** | [Minimum rate to finish independent batches](src/main/java/dev/practice/deliveryhero/binary_search/p20/README.md) | binary search | Recommended · Koko-style pattern | 35 |
| 40 | P22 | **C — Insurance** | [Decode nested repetitions](src/main/java/dev/practice/deliveryhero/stacks/p22/README.md) | stacks | Recommended | 35 |
| 41 | P24 | **C — Insurance** | [Implement an LRU cache](src/main/java/dev/practice/deliveryhero/linked_lists/p24/README.md) | linked lists | Recommended · cache design pattern | 45 |
| 42 | P28 | **C — Insurance** | [Detect cyclic dependencies](src/main/java/dev/practice/deliveryhero/graphs/p28/README.md) | graphs | Recommended | 35 |
| 43 | P32 | **C — Insurance** | [Top k frequent values with deterministic ties](src/main/java/dev/practice/deliveryhero/heaps/p32/README.md) | heaps | Recommended | 30 |
| 44 | P33 | **C — Insurance** | [Maximum profit from one buy then sell](src/main/java/dev/practice/deliveryhero/arrays/p33/README.md) | arrays | Recommended | 20 |
| 45 | P38 | **C — Insurance** | [Shortest route in an unweighted graph](src/main/java/dev/practice/deliveryhero/graphs/p38/README.md) | graphs | Recommended | 30 |
| 46 | P49 | **C — Insurance** | [First non-repeating character](src/main/java/dev/practice/deliveryhero/hashing/p49/README.md) | hashing | Recommended · useful short string round | 15 |
| 47 | P58 | **C — Insurance** | [Extensible delivery pricing rules](src/main/java/dev/practice/deliveryhero/practical/p58/README.md) | practical | Adapted format · HungerStation OOP/design-pattern coding; domain authored | 40 |
| 48 | P25 | **LAST — Learn last** | [Sum a BST value range](src/main/java/dev/practice/deliveryhero/trees/p25/README.md) | trees | Recommended | 25 |
| 49 | P26 | **LAST — Learn last** | [Traverse a binary tree level by level](src/main/java/dev/practice/deliveryhero/trees/p26/README.md) | trees | Recommended | 25 |
| 50 | P27 | **LAST — Learn last** | [Count islands in a grid](src/main/java/dev/practice/deliveryhero/graphs/p27/README.md) | graphs | Recommended | 25 |
| 51 | P29 | **LAST — Learn last** | [Deep-copy a graph with cycles](src/main/java/dev/practice/deliveryhero/graphs/p29/README.md) | graphs | Recommended | 35 |
| 52 | P30 | **LAST — Learn last** | [Minimum coins for an amount](src/main/java/dev/practice/deliveryhero/dynamic_programming/p30/README.md) | dynamic programming | Recommended | 35 |
| 53 | P31 | **LAST — Learn last** | [Find a word along a grid path](src/main/java/dev/practice/deliveryhero/backtracking/p31/README.md) | backtracking | Recommended | 40 |
| 54 | P37 | **LAST — Learn last** | [Minimum cost with equal city quotas](src/main/java/dev/practice/deliveryhero/greedy/p37/README.md) | greedy | Recommended | 30 |
| 55 | P44 | **LAST — Learn last** | [Can everyone see the theatre screen?](src/main/java/dev/practice/deliveryhero/arrays/p44/README.md) | arrays | Reported-topic · Delivery Hero data engineer repost; attribution uncertain | 15 |
| 56 | P45 | **LAST — Learn last** | [Character frequencies in first-seen order](src/main/java/dev/practice/deliveryhero/hashing/p45/README.md) | hashing | Reported-topic · Delivery Hero data engineer repost; attribution uncertain | 15 |
| 57 | P50 | **LAST — Learn last** | [Stacks with leftmost push and rightmost pop](src/main/java/dev/practice/deliveryhero/stacks/p50/README.md) | stacks | Reported · Glovo SE2 Barcelona | 50 |
| 58 | P51 | **LAST — Learn last** | [Compress consecutive character runs in-place](src/main/java/dev/practice/deliveryhero/strings/p51/README.md) | strings | Recommended · secondary company-tag signal, not verified report | 25 |
| 59 | P52 | **LAST — Learn last** | [Check completeness of a binary tree](src/main/java/dev/practice/deliveryhero/trees/p52/README.md) | trees | Recommended · secondary company-tag signal, not verified report | 25 |
| 60 | P53 | **LAST — Learn last** | [Next lexicographic permutation](src/main/java/dev/practice/deliveryhero/arrays/p53/README.md) | arrays | Recommended · secondary company-tag signal, not verified report | 30 |
| 61 | P54 | **LAST — Learn last** | [Fewest jumps to the last index](src/main/java/dev/practice/deliveryhero/greedy/p54/README.md) | greedy | Recommended · Jump Game II pattern | 30 |
| 62 | P55 | **LAST — Learn last** | [Map random tickets to weighted choices](src/main/java/dev/practice/deliveryhero/binary_search/p55/README.md) | binary search | Recommended · weighted random pick pattern | 30 |
| 63 | P56 | **LAST — Learn last** | [Shortest route with nonnegative travel times](src/main/java/dev/practice/deliveryhero/graphs/p56/README.md) | graphs | Recommended · fills weighted-graph gap | 40 |
| 64 | P59 | **LAST — Learn last** | [Count right-and-down grid paths](src/main/java/dev/practice/deliveryhero/dynamic_programming/p59/README.md) | dynamic programming | Recommended · secondary company-tag signal, not verified report | 25 |
| 65 | P60 | **LAST — Learn last** | [Best profit with at most k trades](src/main/java/dev/practice/deliveryhero/dynamic_programming/p60/README.md) | dynamic programming | Recommended · advanced stock-state DP pattern | 45 |

## How to use the tests

Tests cover representative examples, boundaries and common traps; passing them is not a formal proof. Add at least one adversarial case of your own. Avoid changing the task contract merely to make tests pass. Some tests deliberately exercise long sums, duplicate keys, mutation, or concurrent calls. They use a 10-second safety timeout, not a benchmark. If a correct solution times out while debugging, run without breakpoints or adjust the timeout locally.

For each attempt: clarify assumptions, describe a simple solution, improve it if needed, implement, test, and explain complexity. Close hints during timed practice. Record failed attempts as well as passes; revisit weak problems after two days and again after a week.

Practical exercises use in-memory components so you can focus on behavior and tests. P09 includes an optional HTTP adapter round; its supplied tests cover the API core, not network transport. No reference solutions or answer keys are bundled.
