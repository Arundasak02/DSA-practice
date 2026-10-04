# Study plan — Delivery Hero senior Java backend

Updated 3 October 2026. Default: four weeks, six study days/week, about two hours/day. Adapt dates to your interview invitation; no interview date or exact team description was supplied.

**Priority:** prepare easy/medium DSA first, while practising service code, tests and Java fundamentals throughout. Allocate roughly **60% of coding practice to DSA and 40% to practical coding**. This is a preparation recommendation, NOT a measured interview probability. Both formats can occur in the same loop. See the [evidence assessment](research/REVIEW.md).

For each two-hour session: 10 minutes recalling yesterday's invariant, 60 minutes solving, 20 minutes edge cases/tests, 10 minutes explaining complexity or design, and 20 minutes senior Java/backend discussion. A practical mock can use the entire 90-minute coding/testing block. If you finish early, repeat a weak problem without notes; do not fill the time with unrelated hard problems.

## Ordered bank

Reported means a candidate named the task; it is not independent verification. Adapted means the report lacks a complete specification or reports only a scenario. Recommended means pattern coverage, not an actual named interview question. All edge contracts and tests were authored for practice. Source links and any necessary prerequisites are in the Java file.

### 1. Reported Berlin fundamentals — start here

| Exercise | Minutes | Why it belongs / evidence |
|---|---:|---|
| [P40 MaximumElement](src/main/java/dev/practice/deliveryhero/arrays/p40/MaximumElement.java) | 10 | Reported · Berlin senior Nov 2025, Python track; algorithm transfers to Java |
| [P01 WordCount](src/main/java/dev/practice/deliveryhero/strings/p01/WordCount.java) | 15 | Reported · Berlin SE2/SSE1 and SE II |
| [P14 TwoSum](src/main/java/dev/practice/deliveryhero/hashing/p14/TwoSum.java) | 20 | Reported · Delivery Hero Berlin senior, Oct/Nov 2025; language-independent |
| [P04 MaximumSubarray](src/main/java/dev/practice/deliveryhero/arrays/p04/MaximumSubarray.java) | 25 | Reported · Berlin SE2/SSE1 |
| [P02 PatternWords](src/main/java/dev/practice/deliveryhero/strings/p02/PatternWords.java) | 25 | Reported · Berlin SE II |
| [P05 KthLargest](src/main/java/dev/practice/deliveryhero/heaps/p05/KthLargest.java) | 25 | Reported · Berlin SE II; duplicate policy added |
| [P61 JumpGame](src/main/java/dev/practice/deliveryhero/greedy/p61/JumpGame.java) | 25 | Reported · Berlin senior Nov 2025, Python track; Java practice contract |

### 2. Reported older Berlin variations — clarify the contract

| Exercise | Minutes | Why it belongs / evidence |
|---|---:|---|
| [P06 BriefcaseLock](src/main/java/dev/practice/deliveryhero/arrays/p06/BriefcaseLock.java) | 15 | Reported · Berlin senior Go; wheel rules reconstructed |
| [P07 ChunkSort](src/main/java/dev/practice/deliveryhero/arrays/p07/ChunkSort.java) | 25 | Reported · Berlin senior Go; ambiguous wording adapted |
| [P03 OcrCompatibility](src/main/java/dev/practice/deliveryhero/strings/p03/OcrCompatibility.java) | 40 | Reported · Berlin SE2/SSE1; grammar reconstructed |
| [P08 StreamingMedian](src/main/java/dev/practice/deliveryhero/heaps/p08/StreamingMedian.java) | 40 | Reported · Berlin senior Go |

### 3. Java and backend practical work

| Exercise | Minutes | Why it belongs / evidence |
|---|---:|---|
| [P09 OrderApi](src/main/java/dev/practice/deliveryhero/practical/p09/OrderApi.java) | 45 | Adapted · Berlin REST and Java-focused CRUD reports; endpoints authored |
| [P36 InvoiceCalculator](src/main/java/dev/practice/deliveryhero/practical/p36/InvoiceCalculator.java) | 30 | Adapted · Glovo report describes debugging, actual service undisclosed |
| [P12 CamelCaseMap](src/main/java/dev/practice/deliveryhero/recursion/p12/CamelCaseMap.java) | 35 | Related-company report · Glovo Spain; Java attempt |
| [P10 SlidingWindowLimiter](src/main/java/dev/practice/deliveryhero/practical/p10/SlidingWindowLimiter.java) | 40 | Adapted · Berlin API-abuse follow-up; algorithm not specified |
| [P34 IdempotentOrders](src/main/java/dev/practice/deliveryhero/practical/p34/IdempotentOrders.java) | 45 | Recommended · related idempotency topic reported, task authored |
| [P35 EventDeduplicator](src/main/java/dev/practice/deliveryhero/practical/p35/EventDeduplicator.java) | 40 | Recommended · stream-processing family reported for Java SDE2; dedup task authored |
| [P62 LegacyCheckout](src/main/java/dev/practice/deliveryhero/practical/p62/LegacyCheckout.java) | 40 | Adapted · Delivery Hero manager interview scenario, Dec 2024; role/location unspecified |
| [P57 BoundedBuffer](src/main/java/dev/practice/deliveryhero/concurrency/p57/BoundedBuffer.java) | 50 | Recommended · Java translation of concurrency preparation |
| [P47 CustomerOrderJoinQuery](src/main/java/dev/practice/deliveryhero/sql/p47/CustomerOrderJoinQuery.java) | 25 | Adapted · Delivery Hero senior Python SQL join report |

### 4. Essential pattern coverage

| Exercise | Minutes | Why it belongs / evidence |
|---|---:|---|
| [P15 LongestUniqueSubstring](src/main/java/dev/practice/deliveryhero/sliding_window/p15/LongestUniqueSubstring.java) | 25 | Recommended |
| [P16 SubarraySum](src/main/java/dev/practice/deliveryhero/hashing/p16/SubarraySum.java) | 25 | Recommended |
| [P17 MergeIntervals](src/main/java/dev/practice/deliveryhero/intervals/p17/MergeIntervals.java) | 25 | Recommended |
| [P18 MeetingRooms](src/main/java/dev/practice/deliveryhero/intervals/p18/MeetingRooms.java) | 25 | Recommended |
| [P19 LowerBound](src/main/java/dev/practice/deliveryhero/binary_search/p19/LowerBound.java) | 20 | Recommended · binary-search family reported for Java SDE2; exact task undisclosed |
| [P21 ValidBrackets](src/main/java/dev/practice/deliveryhero/stacks/p21/ValidBrackets.java) | 20 | Reported · Glovo senior software engineer |
| [P23 ReverseList](src/main/java/dev/practice/deliveryhero/linked_lists/p23/ReverseList.java) | 25 | Reported · foodpanda software engineer, Singapore |
| [P24 LruCache](src/main/java/dev/practice/deliveryhero/linked_lists/p24/LruCache.java) | 45 | Recommended · cache design pattern |
| [P26 LevelOrder](src/main/java/dev/practice/deliveryhero/trees/p26/LevelOrder.java) | 25 | Recommended |
| [P27 NumberOfIslands](src/main/java/dev/practice/deliveryhero/graphs/p27/NumberOfIslands.java) | 25 | Recommended |
| [P28 CourseSchedule](src/main/java/dev/practice/deliveryhero/graphs/p28/CourseSchedule.java) | 35 | Recommended |
| [P30 CoinChange](src/main/java/dev/practice/deliveryhero/dynamic_programming/p30/CoinChange.java) | 35 | Recommended |
| [P32 TopKFrequent](src/main/java/dev/practice/deliveryhero/heaps/p32/TopKFrequent.java) | 30 | Recommended |

### 5. Broader reports — finish after the core

| Exercise | Minutes | Why it belongs / evidence |
|---|---:|---|
| [P42 FlattenNestedLists](src/main/java/dev/practice/deliveryhero/recursion/p42/FlattenNestedLists.java) | 25 | Reported · Delivery Hero senior Python; recursive Java variant |
| [P43 InsertionOrderedSet](src/main/java/dev/practice/deliveryhero/practical/p43/InsertionOrderedSet.java) | 45 | Reported · foodpanda principal engineer |

P40/P14/P61 have 2025 Berlin senior evidence; that report's language was Python, so only the algorithms transfer. P06–P08 came from an older senior Go report. P12/P36 are Glovo backend evidence; P43 is foodpanda principal evidence. They broaden preparation without being presented as Berlin Java questions. P19/P35 practise families named in a Java backend report whose exact tasks were not disclosed.

## Four-week schedule

The exercise time boxes are first-attempt limits, not total study time. Stop at the limit, identify the obstacle, then finish deliberately. Retry weak exercises after two days and again after seven days. Retry time replaces optional coverage before it displaces the core.

| Day | Coding session | Senior discussion (20 minutes) |
|---|---|---|
| 1 | [P40 MaximumElement](src/main/java/dev/practice/deliveryhero/arrays/p40/MaximumElement.java), [P01 WordCount](src/main/java/dev/practice/deliveryhero/strings/p01/WordCount.java), [P14 TwoSum](src/main/java/dev/practice/deliveryhero/hashing/p14/TwoSum.java) | HashMap, equals/hashCode; narrate boundary cases. P01 is solved: redo from memory. |
| 2 | [P02 PatternWords](src/main/java/dev/practice/deliveryhero/strings/p02/PatternWords.java), [P04 MaximumSubarray](src/main/java/dev/practice/deliveryhero/arrays/p04/MaximumSubarray.java) | Overflow, int vs long, loop invariants; compare brute force and improved approaches. |
| 3 | [P05 KthLargest](src/main/java/dev/practice/deliveryhero/heaps/p05/KthLargest.java), [P06 BriefcaseLock](src/main/java/dev/practice/deliveryhero/arrays/p06/BriefcaseLock.java), [P07 ChunkSort](src/main/java/dev/practice/deliveryhero/arrays/p07/ChunkSort.java) | PriorityQueue comparator and duplicates; clarify ambiguous requirements. |
| 4 | [P61 JumpGame](src/main/java/dev/practice/deliveryhero/greedy/p61/JumpGame.java), [P19 LowerBound](src/main/java/dev/practice/deliveryhero/binary_search/p19/LowerBound.java) | Greedy correctness and binary-search boundaries; functional interfaces vs abstract classes. |
| 5 | [P09 OrderApi](src/main/java/dev/practice/deliveryhero/practical/p09/OrderApi.java) | Validation, status codes, persistence boundary and test seams. |
| 6 | [P36 InvoiceCalculator](src/main/java/dev/practice/deliveryhero/practical/p36/InvoiceCalculator.java) | Debug before refactoring; money rounding and production observability. |
| 8 | [P15 LongestUniqueSubstring](src/main/java/dev/practice/deliveryhero/sliding_window/p15/LongestUniqueSubstring.java), [P16 SubarraySum](src/main/java/dev/practice/deliveryhero/hashing/p16/SubarraySum.java) | Window validity versus prefix sums; why negative values change a sliding-window argument. |
| 9 | [P17 MergeIntervals](src/main/java/dev/practice/deliveryhero/intervals/p17/MergeIntervals.java), [P18 MeetingRooms](src/main/java/dev/practice/deliveryhero/intervals/p18/MeetingRooms.java) | Interval endpoint semantics, sorting versus heap sweeps. |
| 10 | [P03 OcrCompatibility](src/main/java/dev/practice/deliveryhero/strings/p03/OcrCompatibility.java) | Parsing contracts, long counters and explaining a streaming invariant. |
| 11 | [P08 StreamingMedian](src/main/java/dev/practice/deliveryhero/heaps/p08/StreamingMedian.java), [P32 TopKFrequent](src/main/java/dev/practice/deliveryhero/heaps/p32/TopKFrequent.java) | Heap invariants, insertion/query tradeoffs and unbounded streams. |
| 12 | [P12 CamelCaseMap](src/main/java/dev/practice/deliveryhero/recursion/p12/CamelCaseMap.java), [P42 FlattenNestedLists](src/main/java/dev/practice/deliveryhero/recursion/p42/FlattenNestedLists.java) | Nested objects, mutation, collisions, recursion depth and meaningful names. |
| 13 | [P10 SlidingWindowLimiter](src/main/java/dev/practice/deliveryhero/practical/p10/SlidingWindowLimiter.java) | 429 response, fairness, distributed limits and cleanup of expired state. |
| 15 | [P21 ValidBrackets](src/main/java/dev/practice/deliveryhero/stacks/p21/ValidBrackets.java), [P23 ReverseList](src/main/java/dev/practice/deliveryhero/linked_lists/p23/ReverseList.java), [P24 LruCache](src/main/java/dev/practice/deliveryhero/linked_lists/p24/LruCache.java) | Deque versus Stack; pointers; cache eviction and concurrent access. |
| 16 | [P26 LevelOrder](src/main/java/dev/practice/deliveryhero/trees/p26/LevelOrder.java), [P27 NumberOfIslands](src/main/java/dev/practice/deliveryhero/graphs/p27/NumberOfIslands.java) | BFS/DFS, visited state, recursion limits and queue memory. |
| 17 | [P28 CourseSchedule](src/main/java/dev/practice/deliveryhero/graphs/p28/CourseSchedule.java), [P30 CoinChange](src/main/java/dev/practice/deliveryhero/dynamic_programming/p30/CoinChange.java) | Cycle detection and DP state definitions; explain complexity before coding. |
| 18 | [P34 IdempotentOrders](src/main/java/dev/practice/deliveryhero/practical/p34/IdempotentOrders.java) | Atomicity, duplicate requests, conflicts, database uniqueness and an outbox. |
| 19 | [P35 EventDeduplicator](src/main/java/dev/practice/deliveryhero/practical/p35/EventDeduplicator.java), [P47 CustomerOrderJoinQuery](src/main/java/dev/practice/deliveryhero/sql/p47/CustomerOrderJoinQuery.java) | Kafka replay/offsets, processing time vs event time; SQL joins, HAVING and indexes. |
| 20 | [P62 LegacyCheckout](src/main/java/dev/practice/deliveryhero/practical/p62/LegacyCheckout.java), [P43 InsertionOrderedSet](src/main/java/dev/practice/deliveryhero/practical/p43/InsertionOrderedSet.java) | Dependency injection, legacy migration, API contracts and independent snapshots. |
| 22 | [P57 BoundedBuffer](src/main/java/dev/practice/deliveryhero/concurrency/p57/BoundedBuffer.java) | Interruption, visibility, deadlocks, backpressure; prefer standard queues in production. |
| 23 | DSA mock: P14 + P04 + P19, 60 min total, no notes | Explain every edge case; add a test before running. |
| 24 | Practical mock: redo P09 or P36, 45 min + 15 min review | Correct behavior first, then readable code, tests and production follow-ups. |
| 25 | Mixed mock: P61 (25 min) + P12 (35 min) | Discuss a failed approach and recover without hiding it. |
| 26 | P09 CRUD extension: add update/delete to the core, then an HTTP adapter if time permits; 90 min | Choose and document update/delete semantics; test missing IDs, invalid payloads and read-after-change. Add HTTP checks in a follow-up session; these extension tests are yours. |
| 27 | Redo your two weakest core exercises, 30 min each; review Java/backend stories | Rehearse one project deep dive with actual scale, tradeoffs and incident recovery. |

Days 7, 14 and 21: rest or a light 30-minute recall session. Day 28: review your mistake notes, check the interview setup, and rest. Do not start new topics the evening before the interview.

## If you have only seven days

Use about two hours per day. Skip lower-priority breadth first; do not try to compress all core exercises.

| Day | Focus |
|---|---|
| 1 | P40/P01 quick warm-up, P14/P04; HashMap and complexity |
| 2 | P02/P05/P19; comparator and binary-search boundaries |
| 3 | P61/P08; greedy and streaming invariants |
| 4 | P09/P36; API behavior, debugging and tests |
| 5 | P12/P34; recursive data transformation and atomic retries |
| 6 | P10/P35; window expiry, Kafka reasoning and memory bounds |
| 7 | One 30-minute DSA mock + one 45-minute practical mock; revisit mistakes |

If the recruiter explicitly confirms a practical-only round, move P09/P36/P12/P34/P62 ahead of algorithm breadth. If they confirm an algorithm assessment, prioritize P14/P04/P02/P05/P19/P61/P03/P08 and the essential patterns. Their actual brief takes precedence over public reports.

## When a problem is done

Pass its tests, add one edge case you thought of, explain the invariant and time/space cost, and reproduce the solution without looking two days later. For practical code also explain failure behavior, ownership of mutable state, and one production limitation. Passing familiar tests alone is not readiness.

Ask your recruiter (suggested questions, not sent): “Will the Java coding exercise be algorithmic, service implementation or debugging? Is it in CoderPad or my IDE? May I use JUnit and a framework? Is there an online assessment?”

Community follow-up: the [research notes](research/COMMUNITY_REVIEW.md) support keeping both DSA and practical work. Day 26 now extends P09 to full CRUD. Preserve the existing create/read tests; write the extension tests yourself.

## Preserved remote additions — merge on 4 October 2026

The existing four-week route remains the core plan. These five files preserve the remote update. Two IDs were moved to avoid collisions: remote P61 SnakeCase is P66; remote P62 LfuCache is P67. P65 is an alternative contract for P61's pattern.

| Exercise | Where to fit it |
|---|---|
| [P66 SnakeCase](src/main/java/dev/practice/deliveryhero/strings/p66/SnakeCase.java) | Add to day 2 or substitute for a warm-up; reported conversion task. |
| [P67 LfuCache](src/main/java/dev/practice/deliveryhero/linked_lists/p67/LfuCache.java) | Optional after P24; related Python-role evidence, not a senior Java requirement. |
| [P63 RollingAverage](src/main/java/dev/practice/deliveryhero/practical/p63/RollingAverage.java) | Alternative stream drill on day 19; operation is authored. |
| [P64 AllTwoSumPairs](src/main/java/dev/practice/deliveryhero/hashing/p64/AllTwoSumPairs.java) | Follow-up to P14 on day 1 or a later retry session. |
| [P65 JumpReachability](src/main/java/dev/practice/deliveryhero/greedy/p65/JumpReachability.java) | Optional alternative to P61; skip duplicate practice under time pressure. |

Keep the remote [SQL drills](SQL_DRILLS.md) for the database discussion sessions.
