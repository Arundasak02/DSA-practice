# String and Stream research — 8 October 2026

## What is reported at Delivery Hero

- [Berlin SE2/SSE1, August 2021](https://leetcode.com/discuss/post/1413476/delivery-hero-se2sse1-berlin-august-2021-awaiting-result/): OCR-string comparison and word counting with tests. Supports SM01/SM05. Numeric grammar and word boundaries are specified by this workspace.
- [Berlin SEII, March 2022](https://leetcode.com/discuss/post/2034030/delivery-hero-software-engineer-ii-berlin-mar-2022-offer-declined/): word-pattern matching and word counting. Supports SM01/SM02. The candidate mentions difficulty recalling Java string methods without autocomplete; practise coding without IDE assistance too.
- [Senior SWE camelCase-to-snake_case question](https://www.glassdoor.co.uk/Interview/Q-Write-a-function-to-convert-camelCase-to-snake-case-QTN_6882053.htm): supports SM03. Exact interview date/location unavailable in the retrieved question page; acronym behavior is authored.
- [Glovo Spain backend candidate](https://leetcode.com/discuss/post/6976664/interview-experience-software-engineer-b-s19v/): nested snake_case-to-camelCase map conversion with a Java attempt. Supports SM04 as related-company evidence, not Berlin-specific evidence.

SM06–SM10 are curriculum recommendations. No direct Delivery Hero attribution was established for these exact variants. Self-selected reports cannot establish company-wide frequency; no percentages or “most asked” ranking are claimed.

## Java Stream selection

General interview-preparation results repeatedly emphasized transformations, distinct values, grouping, flattening, ordering, Optional and reductions. This informed topic discovery, not a measured frequency estimate. A [Reddit interview discussion](https://www.reddit.com/r/developersIndia/comments/1w02l12/java_8_streams_api_related_tech_interview/) also discusses tasks such as map ordering and duplicate detection; it is not Delivery Hero-specific. Search hits included commercial/tutorial lists whose popularity and percentage claims were not accepted as evidence.

The coding contracts are original practice specifications. Technical semantics and follow-up topics are grounded in primary references:

- [Java 17 Stream API](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html): pipeline operations, encounter order, non-interference, reductions and result contracts.
- [Java 17 Collectors API](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Collectors.html): collector options, collision policies, grouping and partitioning.
- [Oracle: Processing Data with Java SE 8 Streams, part 2](https://www.oracle.com/java/technologies/architect-streams-pt2.html): practical grouping/reduction examples. The exercise runtime target remains Java 17.

No source found in this pass establishes that these ten Stream API exercises were asked at Delivery Hero. A report mentioning Kafka/continuous stream processing is not evidence of java.util.stream interview questions.

## Search and access

Targeted searches covered Delivery Hero strings, camel/snake conversion, word patterns/counting and Java Stream coding interview topics. Reopened the primary candidate pages, Glassdoor question page, Reddit discussion and Java 17 API documentation. Existing problem mappings are recorded in FOCUS_STUDY_PLAN.md. Public pages only; no exhaustive access to private interview records is claimed.
