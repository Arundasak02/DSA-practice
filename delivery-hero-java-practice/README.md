# Delivery Hero interview preparation — all locations and relevant roles

A source-linked practice workspace for an experienced Java backend engineer. **60 exercises, 340 exercise tests, Java 17+, Maven, JUnit 5. No completed solutions.** P36 is intentionally buggy starter code for a debugging round.

## Start here

1. Open this folder or import `pom.xml` as a Maven project in IntelliJ IDEA, Eclipse or VS Code. Select JDK 17 or newer. No Spring, Docker or external database setup is required. SQL exercises use test-scoped H2 in memory.
2. Run `./mvnw -Dtest=WorkspaceSmokeTest test` to verify your environment.
3. Start with [P01 WordCount](src/main/java/dev/practice/deliveryhero/strings/p01/README.md), edit the neighboring Java file, then run `./mvnw -Dtest=WordCountTest test`.
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

## Choose your next exercise

Time boxes are practice suggestions, not claimed interview durations. IDs are stable; use the study plan for learning order. Every problem folder contains the task, input/output contract, test link, complexity target, and optional collapsed hint when useful.

| ID | Exercise | Pattern | Evidence | Minutes |
|---|---|---|---|---:|
| P01 | [Count words](src/main/java/dev/practice/deliveryhero/strings/p01/README.md) | strings | Reported · Berlin SE2/SSE1 and SE II | 15 |
| P02 | [Find words with the same repetition pattern](src/main/java/dev/practice/deliveryhero/strings/p02/README.md) | strings | Reported · Berlin SE II | 25 |
| P03 | [Compare OCR strings with unknown runs](src/main/java/dev/practice/deliveryhero/strings/p03/README.md) | strings | Reported · Berlin SE2/SSE1; grammar reconstructed | 40 |
| P04 | [Maximum contiguous subarray sum](src/main/java/dev/practice/deliveryhero/arrays/p04/README.md) | arrays | Reported · Berlin SE2/SSE1 | 25 |
| P05 | [Largest, second-largest and kth-largest](src/main/java/dev/practice/deliveryhero/heaps/p05/README.md) | heaps | Reported · Berlin SE II; duplicate policy added | 25 |
| P06 | [Minimum rotations of a combination lock](src/main/java/dev/practice/deliveryhero/arrays/p06/README.md) | arrays | Reported · Berlin senior Go; wheel rules reconstructed | 15 |
| P07 | [Sort each consecutive chunk](src/main/java/dev/practice/deliveryhero/arrays/p07/README.md) | arrays | Reported · Berlin senior Go; ambiguous wording adapted | 25 |
| P08 | [Maintain the median of a stream](src/main/java/dev/practice/deliveryhero/heaps/p08/README.md) | heaps | Reported · Berlin senior Go | 40 |
| P09 | [Build two order API operations](src/main/java/dev/practice/deliveryhero/practical/p09/README.md) | practical | Adapted · Berlin SE II report names two REST APIs, no endpoints | 45 |
| P10 | [Per-client sliding-window rate limiter](src/main/java/dev/practice/deliveryhero/practical/p10/README.md) | practical | Adapted · Berlin API-abuse follow-up; algorithm not specified | 40 |
| P11 | [Validate a word abbreviation](src/main/java/dev/practice/deliveryhero/strings/p11/README.md) | strings | Related-role report · senior automation, location not established | 25 |
| P12 | [Convert nested map keys to camelCase](src/main/java/dev/practice/deliveryhero/recursion/p12/README.md) | recursion | Related-company report · Glovo Spain; Java attempt | 35 |
| P13 | [Keep at most two copies in a sorted array](src/main/java/dev/practice/deliveryhero/arrays/p13/README.md) | arrays | Adapted · older SE II report; original wording ambiguous | 25 |
| P14 | [Find two indices for a target](src/main/java/dev/practice/deliveryhero/hashing/p14/README.md) | hashing | Reported · Delivery Hero mid-level Android | 20 |
| P15 | [Longest substring without repeated characters](src/main/java/dev/practice/deliveryhero/sliding_window/p15/README.md) | sliding window | Recommended | 25 |
| P16 | [Count subarrays with a target sum](src/main/java/dev/practice/deliveryhero/hashing/p16/README.md) | hashing | Recommended | 25 |
| P17 | [Merge closed intervals](src/main/java/dev/practice/deliveryhero/intervals/p17/README.md) | intervals | Recommended | 25 |
| P18 | [Minimum simultaneous meeting rooms](src/main/java/dev/practice/deliveryhero/intervals/p18/README.md) | intervals | Recommended | 25 |
| P19 | [First position at least the target](src/main/java/dev/practice/deliveryhero/binary_search/p19/README.md) | binary search | Recommended | 20 |
| P20 | [Minimum rate to finish independent batches](src/main/java/dev/practice/deliveryhero/binary_search/p20/README.md) | binary search | Recommended · Koko-style pattern | 35 |
| P21 | [Validate bracket nesting](src/main/java/dev/practice/deliveryhero/stacks/p21/README.md) | stacks | Reported · Glovo senior software engineer | 20 |
| P22 | [Decode nested repetitions](src/main/java/dev/practice/deliveryhero/stacks/p22/README.md) | stacks | Recommended | 35 |
| P23 | [Reverse a singly linked list](src/main/java/dev/practice/deliveryhero/linked_lists/p23/README.md) | linked lists | Reported · foodpanda software engineer, Singapore | 25 |
| P24 | [Implement an LRU cache](src/main/java/dev/practice/deliveryhero/linked_lists/p24/README.md) | linked lists | Recommended · cache design pattern | 45 |
| P25 | [Sum a BST value range](src/main/java/dev/practice/deliveryhero/trees/p25/README.md) | trees | Recommended | 25 |
| P26 | [Traverse a binary tree level by level](src/main/java/dev/practice/deliveryhero/trees/p26/README.md) | trees | Recommended | 25 |
| P27 | [Count islands in a grid](src/main/java/dev/practice/deliveryhero/graphs/p27/README.md) | graphs | Recommended | 25 |
| P28 | [Detect cyclic dependencies](src/main/java/dev/practice/deliveryhero/graphs/p28/README.md) | graphs | Recommended | 35 |
| P29 | [Deep-copy a graph with cycles](src/main/java/dev/practice/deliveryhero/graphs/p29/README.md) | graphs | Recommended | 35 |
| P30 | [Minimum coins for an amount](src/main/java/dev/practice/deliveryhero/dynamic_programming/p30/README.md) | dynamic programming | Recommended | 35 |
| P31 | [Find a word along a grid path](src/main/java/dev/practice/deliveryhero/backtracking/p31/README.md) | backtracking | Recommended | 40 |
| P32 | [Top k frequent values with deterministic ties](src/main/java/dev/practice/deliveryhero/heaps/p32/README.md) | heaps | Recommended | 30 |
| P33 | [Maximum profit from one buy then sell](src/main/java/dev/practice/deliveryhero/arrays/p33/README.md) | arrays | Recommended | 20 |
| P34 | [Create orders safely under duplicate retries](src/main/java/dev/practice/deliveryhero/practical/p34/README.md) | practical | Recommended · related idempotency topic reported, task authored | 45 |
| P35 | [Deduplicate events with an expiry window](src/main/java/dev/practice/deliveryhero/practical/p35/README.md) | practical | Recommended · tailored to event-driven Java work | 40 |
| P36 | [Debug a small invoice service](src/main/java/dev/practice/deliveryhero/practical/p36/README.md) | practical | Adapted · Glovo report describes debugging, actual service undisclosed | 30 |
| P37 | [Minimum cost with equal city quotas](src/main/java/dev/practice/deliveryhero/greedy/p37/README.md) | greedy | Recommended | 30 |
| P38 | [Shortest route in an unweighted graph](src/main/java/dev/practice/deliveryhero/graphs/p38/README.md) | graphs | Recommended | 30 |
| P39 | [Mask every second character of each word](src/main/java/dev/practice/deliveryhero/strings/p39/README.md) | strings | Reported · Delivery Hero Android; boundaries defined for practice | 15 |
| P40 | [Find minimum and maximum in one pass](src/main/java/dev/practice/deliveryhero/arrays/p40/README.md) | arrays | Reported · Delivery Hero senior React | 10 |
| P41 | [Plan inserts, updates and removals](src/main/java/dev/practice/deliveryhero/hashing/p41/README.md) | hashing | Adapted · Delivery Hero senior React; reported example inconsistent | 25 |
| P42 | [Flatten a nested list](src/main/java/dev/practice/deliveryhero/recursion/p42/README.md) | recursion | Reported · Delivery Hero senior Python; recursive Java variant | 25 |
| P43 | [Design a set with insertion order and stack-like pop](src/main/java/dev/practice/deliveryhero/practical/p43/README.md) | practical | Reported · foodpanda principal engineer | 45 |
| P44 | [Can everyone see the theatre screen?](src/main/java/dev/practice/deliveryhero/arrays/p44/README.md) | arrays | Reported-topic · Delivery Hero data engineer repost; attribution uncertain | 15 |
| P45 | [Character frequencies in first-seen order](src/main/java/dev/practice/deliveryhero/hashing/p45/README.md) | hashing | Reported-topic · Delivery Hero data engineer repost; attribution uncertain | 15 |
| P46 | [Second distinct salary per department](src/main/java/dev/practice/deliveryhero/sql/p46/README.md) | sql | Adapted · Delivery Hero data engineer salary-ranking report | 30 |
| P47 | [Join customers with their orders](src/main/java/dev/practice/deliveryhero/sql/p47/README.md) | sql | Adapted · Delivery Hero senior Python SQL join report | 25 |
| P48 | [Check whether two strings are anagrams](src/main/java/dev/practice/deliveryhero/hashing/p48/README.md) | hashing | Reported · Glovo senior software engineer | 15 |
| P49 | [First non-repeating character](src/main/java/dev/practice/deliveryhero/hashing/p49/README.md) | hashing | Recommended · useful short string round | 15 |
| P50 | [Stacks with leftmost push and rightmost pop](src/main/java/dev/practice/deliveryhero/stacks/p50/README.md) | stacks | Reported · Glovo SE2 Barcelona | 50 |
| P51 | [Compress consecutive character runs in-place](src/main/java/dev/practice/deliveryhero/strings/p51/README.md) | strings | Recommended · secondary company-tag signal, not verified report | 25 |
| P52 | [Check completeness of a binary tree](src/main/java/dev/practice/deliveryhero/trees/p52/README.md) | trees | Recommended · secondary company-tag signal, not verified report | 25 |
| P53 | [Next lexicographic permutation](src/main/java/dev/practice/deliveryhero/arrays/p53/README.md) | arrays | Recommended · secondary company-tag signal, not verified report | 30 |
| P54 | [Fewest jumps to the last index](src/main/java/dev/practice/deliveryhero/greedy/p54/README.md) | greedy | Recommended · Jump Game II pattern | 30 |
| P55 | [Map random tickets to weighted choices](src/main/java/dev/practice/deliveryhero/binary_search/p55/README.md) | binary search | Recommended · weighted random pick pattern | 30 |
| P56 | [Shortest route with nonnegative travel times](src/main/java/dev/practice/deliveryhero/graphs/p56/README.md) | graphs | Recommended · fills weighted-graph gap | 40 |
| P57 | [Implement a bounded blocking FIFO queue](src/main/java/dev/practice/deliveryhero/concurrency/p57/README.md) | concurrency | Recommended · Java translation of concurrency preparation | 50 |
| P58 | [Extensible delivery pricing rules](src/main/java/dev/practice/deliveryhero/practical/p58/README.md) | practical | Adapted format · HungerStation OOP/design-pattern coding; domain authored | 40 |
| P59 | [Count right-and-down grid paths](src/main/java/dev/practice/deliveryhero/dynamic_programming/p59/README.md) | dynamic programming | Recommended · secondary company-tag signal, not verified report | 25 |
| P60 | [Best profit with at most k trades](src/main/java/dev/practice/deliveryhero/dynamic_programming/p60/README.md) | dynamic programming | Recommended · advanced stock-state DP pattern | 45 |

## How to use the tests

Tests cover representative examples, boundaries and common traps; passing them is not a formal proof. Add at least one adversarial case of your own. Avoid changing the task contract merely to make tests pass. Some tests deliberately exercise long sums, duplicate keys, mutation, or concurrent calls. They use a 10-second safety timeout, not a benchmark. If a correct solution times out while debugging, run without breakpoints or adjust the timeout locally.

For each attempt: clarify assumptions, describe a simple solution, improve it if needed, implement, test, and explain complexity. Close hints during timed practice. Record failed attempts as well as passes; revisit weak problems after two days and again after a week.

Practical exercises use in-memory components so you can focus on behavior and tests. P09 includes an optional HTTP adapter round; its supplied tests cover the API core, not network transport. No reference solutions or answer keys are bundled.
