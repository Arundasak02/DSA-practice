# Study plan — Senior Java/backend

Use [PRIORITIES.md](PRIORITIES.md) and the priority-ordered [exercise index](README.md#choose-your-next-exercise). Numerical asking probabilities are not available. Each exercise page and catalog entry carries the same tier and learning order.

## First route

| Session | Exercises, in order | Goal |
|---|---|---|
| 1 | P14 → P19 → P61 | Hash lookup, binary-search invariant, precise string conversion |
| 2 | P01 → P04 → P05 | Word boundaries, running optimum, selection |
| 3 | P02 → P03 | Bijection and encoded-string parsing |
| 4 | P40 → P41 → P42 | Scans, reconciliation, nested data |
| 5 | P36 → P09 | Debug/test existing code, then implement API behaviour |
| 6 | P10 → P47 → SQL01–SQL04 | API abuse and practical SQL |
| 7 | P08 → P63 → P64 | Median versus bounded rolling state, duplicate pair enumeration |

A session is a grouping, not a promise that all tasks fit one hour. Split demanding sessions. Finish each task by testing, explaining complexity and responding to a changed requirement.

## If you have only three days

| Day | Focus | Suggested work |
|---|---|---|
| 1 | Coding fluency | P14, P19, P61, P01, P04, P05; retry the weakest |
| 2 | Practical coding | P41, P42, P36, P09; discuss P10 and SQL drills |
| 3 | Changed requirements | Choose weak A-tier work from P02/P03/P08/P63/P64, then a timed mock and senior-readiness discussion |

This is a compressed selection from A, not a requirement to finish the whole tier in three days. P03 is more involved; schedule it when parsing is a weakness. Include SQL before general trees/graphs/DP.

## Then, insurance, and learn last

- **B — Learn next:** P62, P12, P65, P21, P48, P06, P07, P23, P34, P35, P43, P46, P57, P11, P13, P39.
- **C — Insurance:** P15, P16, P17, P18, P20, P22, P24, P28, P32, P33, P38, P49, P58.
- **LAST — Learn last:** P25, P26, P27, P29, P30, P31, P37, P44, P45, P50–P56, P59, P60.

Lower tiers remain in the project for broader preparation. They are not mandatory steps before a mock interview. Start LFU after understanding ordinary map/list invariants; LRU can be used as a prerequisite without changing its evidence label.

## Mock interviews

- **25-minute coding:** P14 or P19; reserve five minutes for cases and complexity.
- **35-minute changed requirements:** P61 followed by acronym/digit clarification, or P14 followed by the P64 contract.
- **45-minute debugging:** P36, its tests, refactoring and production readiness.
- **60-minute practical:** P09 implementation, then validation, retries, concurrency and repeated-client requests.
- **45-minute streams:** P63, then memory bounds, concurrency and event-time versus arrival-time discussion. P08 is a separate median task.

All combinations are authored mocks, not exact reconstructions of a historical round. Score requirements, correctness, complexity, tests and communication; retry weak areas.

## SQL and senior discussion

Complete [SQL_DRILLS.md](SQL_DRILLS.md). Review [SENIOR_READINESS.md](SENIOR_READINESS.md) alongside Java functional interfaces/OOP/SOLID, concurrency, transaction boundaries, Kafka versus HTTP, partition/key selection and production failure handling. Defend choices with concrete workload requirements and simpler alternatives.

## Record every attempt

Clarify empty/null/duplicate/mutation/overflow rules. Implement without opening an external solution, run the named tests, add one adversarial case and explain the invariant. Record elapsed time, hints and retry dates in [PROGRESS.md](PROGRESS.md). Passing tests measures the contract, not interview communication or a proof of complexity.
