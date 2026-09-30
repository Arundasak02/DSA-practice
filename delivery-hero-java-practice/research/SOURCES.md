# Research source ledger

Checked 2026-09-27. Dates below refer to the reported interview when available, not the search engine's crawl date. A candidate account is evidence that someone reported a task, not independent verification that the company asked it. Briefs and tests are original practice specifications, not copied interview materials.

## S1

[Delivery Hero SE2/SSE1, Berlin, August 2021 — candidate account](https://leetcode.com/discuss/post/1413476/delivery-hero-se2sse1-berlin-august-2021-awaiting-result/)

- Scope: Berlin, SE2/SSE1 consideration, candidate reports six years of experience. Page displayed August 19, 2021.
- Supports P01 word counting, P03 OCR wildcard strings, P04 maximum subarray with constant auxiliary space.
- Limits: OCR numeric grammar and word boundaries are not fully specified. This workspace defines them. Do not equate P03 with the ambiguous digit-partition problem.
- Access: full candidate text retrieved.

## S2

[Delivery Hero Software Engineer II, Berlin, March 2022 — candidate account](https://leetcode.com/discuss/post/2034030/delivery-hero-software-engineer-ii-berlin-mar-2022-offer-declined/)

- Scope: applied for senior role, reported SE II outcome; 5.5 years' experience.
- Supports P01 word count, P02 equivalent character patterns, P05 largest/second/kth-largest.
- Limits: kth-largest duplicate policy is not stated. The bank counts duplicates. Pattern matching is specified here as a bijection.
- Mentions a 75-minute, four-question assessment without recalling its questions. Those unknown questions have not been invented.
- Access: full candidate text retrieved. Salary/outcome details are not used to infer coding expectations.

## S3

[DeliveryHero senior Golang engineer, Berlin, October 2021 — candidate account](https://leetcode.com/discuss/post/1536999/deliveryhero-senior-golang-engineer-berlin-october-2021-reject/)

- Scope: senior Go role, 8+ years' experience; account states October 21, 2021.
- Supports P06 briefcase lock rotations, P07 sorting fragments of k, P08 streaming median and insertion/query tradeoffs.
- Limits: this was Go, not a Java-specific loop. Lock movement rules and chunk-sort semantics are reconstructed; the terse source does not settle those details.
- Access: full candidate text retrieved.

## S4

[Delivery Hero SEII — Berlin candidate account](https://leetcode.com/discuss/post/4168834/Delivery-Hero-SEII/)

- Scope: Berlin SE II, Go-related technical questions. The retrieved text did not expose a reliable interview date; date left unverified.
- Supports a practical round implementing two REST APIs, plus an API-abuse follow-up. The exact endpoints are not given.
- P09's order domain and API contracts are authored. P10's sliding-window limiter is a practice response to the abuse scenario, not a reported exact coding question.
- An unnamed easy array question is mentioned; it cannot be reconstructed faithfully.
- Access: full candidate text retrieved.

## S5

[Software Engineer Backend, Delivery Hero / Glovo, Spain — candidate account](https://leetcode.com/discuss/post/6976664/interview-experience-software-engineer-b-s19v/)

- Scope: Glovo ML/backend team, Barcelona/Spain, not Delivery Hero Berlin. Interview date not established in the retrieved primary text; a secondary index labels the post July 2025, which is not treated as a verified interview date.
- Supports P12 recursive nested-map key conversion and a debugging exercise followed by production-readiness/SOLID discussion.
- P36's invoice domain and defects are authored. The original service's source code was not published in this report.
- Access: full candidate text retrieved, including the key-conversion task.

## S6

[My Interview Journey with Delivery Hero — Sugumar S](https://www.linkedin.com/posts/sugumarsampath_my-interview-journey-with-delivery-hero-activity-7418664876086210560-LUff)

- Scope: senior automation/testing interview (Selenium, Java, automation framework); location and exact interview date not established. Relative post/comment ages were inconsistent, so no date is inferred.
- Supports P11 valid word abbreviation, including positive skip counts and no leading zeros.
- This is useful adjacent-role practice, not proof of a senior backend Berlin question.
- Access: public post retrieved; no sign-in bypass used.

## S7

[Delivery Hero Software Engineer II candidate reports — Glassdoor](https://www.glassdoor.co.uk/Interview/Delivery-Hero-Software-Engineer-II-Interview-Questions-EI_IE504556.0%2C13_KO14%2C34.htm)

- Scope: several reports with different roles/locations. The August 2020 account does not establish Berlin and mentions frontend/C++ topics. Its repeated-value array prompt is ambiguous; P13 chooses sorted input and retaining at most two copies.
- A separate April 2026 account lists idempotency as a discussion topic. P34 is an authored coding extension, not a reported coding prompt. Location is not explicit in that account.
- Access: public candidate excerpts surfaced by search; no restricted content accessed. Treat as weaker than a complete, specific report.

## S8

[Backend Sr Software Engineer at Delivery Hero SE — accepted-offer account](https://leetcode.com/discuss/post/1526122/interview-experience-backend-sr-software-engineer-at-delivery-hero-se-accepted-offer/)

- Scope: senior backend account; exact interview date not established here.
- Describes a four-question, 75-minute assessment and brief coding tasks within broader technical interviews. The writer deliberately does not disclose exact prompts.
- Used only to shape timed practice, never to invent questions or predict the current loop.
- Access: candidate account retrieved through search.

## S9

[Official Delivery Hero senior Java/Kotlin Fintech role](https://careers.deliveryhero.com/job/senior-software-engineer-java-kotlin-fintech-in-berlin-germany-jid-8234)

- Official role context for Java/Kotlin and payments work in Berlin. The listing may be historical/closed and is not assumed to be the user's exact vacancy.
- Supports the relevance of practical backend preparation, not any specific interview question.
- Access: employer page retrieved.

## Discoveries from the first pass — inclusion updated

The expanded scope now includes the transferable tasks below regardless of geography. See the numbered sources added in the second pass for inclusion decisions.

- [Data Engineer account shared by Prabha Tiwari](https://www.linkedin.com/posts/prabha-tiwari_delivery-hero-data-activity-7433807373221191680-kUOY): theatre row visibility, character counts in first-seen order, and second-highest salary per department. Different role, location/date not established; attribution to an original interviewee is unclear. Now included as P44–P46 with weaker-attribution labels. The SQL contract resolves this question: explicitly decide whether salaries are distinct, how ties behave, and which departments appear when fewer than two distinct salaries exist.
- [Delivery Hero candidate reports, accessed September 2026](https://www.glassdoor.com/Interview/Delivery-Hero-Interview-Questions-E504556.htm): a Data Engineer 1 account reporting May 2025 mentions array reversal and SQL joins, with no full task statement. Graduate and frontend reports are excluded from the backend evidence count.
- [Foodpanda linked-list reversal report](https://www.glassdoor.com/Interview/Reverse-a-linked-list-iteratively-and-recursively-QTN_8665042.htm): different subsidiary; P23 is now labelled reported for foodpanda, with Singapore evidence in S17.
- [2025/2026 Reddit preparation thread](https://www.reddit.com/r/leetcode/comments/1n7lo3g/what_to_expect_at_technical_round_of_delivery/): mostly questions from future interviewees; does not establish concrete historical problems.

## Technical references for recommended exercises

These establish familiar practice variants, not Delivery Hero attribution. Our local contracts are authoritative where they differ (long arithmetic, empty input, ties, immutability).

- [Two Sum](https://leetcode.com/problems/two-sum/), [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/), [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/)
- [Merge Intervals](https://leetcode.com/problems/merge-intervals/), [Meeting Rooms II](https://leetcode.com/problems/meeting-rooms-ii/), [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/)
- [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/), [Decode String](https://leetcode.com/problems/decode-string/), [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/), [LRU Cache](https://leetcode.com/problems/lru-cache/)
- [Range Sum of BST](https://leetcode.com/problems/range-sum-of-bst/), [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/)
- [Number of Islands](https://leetcode.com/problems/number-of-islands/), [Course Schedule](https://leetcode.com/problems/course-schedule/), [Clone Graph](https://leetcode.com/problems/clone-graph/)
- [Coin Change](https://leetcode.com/problems/coin-change/), [Word Search](https://leetcode.com/problems/word-search/), [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/), [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/), [Two City Scheduling](https://leetcode.com/problems/two-city-scheduling/)

## S10

[Delivery Hero senior React candidate report — Glassdoor](https://www.glassdoor.com/Interview/Delivery-Hero-Interview-Questions-E504556.htm?filter.jobTitleExact=Senior+Software+Engineer+%28React%29)

- Interview: December 2020; review January 19, 2021; location not specified. Public body and question entries retrieved.
- Explicitly names array minimum/maximum and reconciliation of user input against stored values. Supports P40 and the topic for P41.
- The reconciliation example marks shared values for removal, conflicting with conventional synchronization semantics. P41 defines a consistent set-difference contract and is labelled adapted. The report also mentions tests and pure-function discussion.

## S11

[Delivery Hero senior Python candidate reports — Glassdoor](https://www.glassdoor.com/Interview/Delivery-Hero-Interview-Questions-E504556.htm?filter.jobTitleExact=%28Senior%29+Software+Engineer+%28Python%29)

- October 2021 interview / December 8, 2021 review names list flattening and a two-table SQL join. Public question entries retrieved. P42 translates the task to Java and adds arbitrary nesting; P47 supplies an authored schema and outer-join requirements.
- A separate August 2021 account names sorting and complexity/copying discussion without a complete sorting prompt. This supports reviewing fundamentals, not attributing a specific sort implementation.

## S12

[Replace every second character — Delivery Hero Android, Glassdoor](https://www.glassdoor.com/Interview/Replace-every-second-character-of-a-word-in-a-text-with-a-specific-symbol-QTN_4003059.htm)

- Public question page retrieved. An answer is dated November 9, 2020; exact interview date and location not established.
- Supports P39. Whitespace, punctuation, indexing and Unicode boundaries are practice choices made explicit in the brief.

## S13

[Define a Set data structure — foodpanda principal engineer candidate account](https://leetcode.com/discuss/post/2505626/Define-a-Set-data-structure-that-supports-given-features-or-Principal-Engineer-Interviewor/)

- Named author Freeze Francis; location and interview date not established. Full public account retrieved.
- Supports P43: insertion/removal, last-in pop, intersection and ordered retrieval. The account stresses code quality and testing. Duplicate insertion, snapshots and intersection ordering are authored clarifications.

## S14

[Delivery Hero data engineer account shared by Prabha Tiwari — LinkedIn](https://www.linkedin.com/posts/prabha-tiwari_delivery-hero-data-activity-7433807373221191680-kUOY)

- Public post retrieved; resembles a reposted account, original interviewee and exact date/location uncertain. Weaker attribution than first-person reports.
- Supports topics for P44 theatre visibility, P45 first-seen character counts, and P46 salary ranking. The salary text does not resolve ties; this bank explicitly uses second distinct salary and includes empty departments.

## S15

[Glovo senior software engineer coding and design questions — Glassdoor](https://www.glassdoor.com.br/Entrevista/Coding-Challenge-Algoritmo-para-resolver-o-problema-dos-par%C3%AAnteses-Algoritmo-para-identificar-se-duas-palavras-eram-a-QTN_5731515.htm)

- Public Portuguese-language question entry retrieved. It reports parentheses validation, anagram checking and bicycle-rental system/object design. Date/location not exposed in this entry.
- Supports P21 and P48; bicycle rental is retained as a design rehearsal in the readiness guide. Our exact character rules are authored.

## S16

[Glovo SE2 Barcelona — Dinner Plate Stacks candidate account](https://leetcode.com/discuss/post/7378630/)

- Public first-person interview post with explicit operations and examples. Location: Barcelona; exact interview date not exposed.
- Supports P50. This harder data-structure exercise is useful stretch practice after ordinary stacks, maps and heaps; it does not establish company-wide difficulty.

## S17

[foodpanda linked-list reversal question — Glassdoor](https://www.glassdoor.com/Interview/Reverse-a-linked-list-iteratively-and-recursively-QTN_8665042.htm) and [Singapore candidate entry](https://www.glassdoor.com/Location/foodpanda-Singapore-Location-EI_IE709546.0%2C9_IL.10%2C19_IC3235921.htm)

- Public question/search excerpts report iterative and recursive reversal for a software engineer; Singapore entry dated November 18, 2025. That is a review date, not a verified interview date.
- P23 is now labelled reported for foodpanda. Its supplied tests cover the iterative contract; recursive reversal is a follow-up, with stack-depth limits acknowledged.

## S18

[Delivery Hero mid-level Android questions — Glassdoor](https://www.glassdoor.com/Interview/mid-level-android-developer-interview-questions-SRCH_KO0%2C27.htm)

- Search-visible candidate entries dated March 30, 2021 explicitly associate Two Sum with Delivery Hero. P14 is now labelled reported for that role.
- This multi-company page was checked per entry: nearby Mobiquity questions are not attributed to Delivery Hero. Other listed Delivery Hero topics include code review and memory leaks.

## S19

[HungerStation candidate reports — Glassdoor](https://www.glassdoor.ca/Interview/HungerStation-Interview-Questions-E2357983.htm)

- Search snapshot includes senior backend interview in November 2025 (review March 2026): OOP/design-pattern coding and backend fundamentals. A January 2026 senior account also mentions domain design. The live page is paginated and changes as newer reviews arrive.
- P58's pricing problem is entirely authored to rehearse that format. No original task source was disclosed. This is a subsidiary/team signal, not a universal Delivery Hero round.

## S20

[Delivery Hero senior software engineer reports — Glassdoor](https://www.glassdoor.com/Interview/Delivery-Hero-Senior-Software-Engineer-Interview-Questions-EI_IE504556.0%2C13_KO14%2C38.htm)

- Public page retrieved, including November 2025/February 2026 accounts. Topics include concurrency models, project architecture, tenant isolation and food-delivery design.
- Used for the senior-readiness discussion checklist only. Vague references to multiple coding tasks do not identify new algorithm problems. Candidate opinions about outcomes are not accepted as proof of assessment criteria.

## S21

[How we hire — official Delivery Hero](https://careers.deliveryhero.com/howwehire)

- Official page checked September 27, 2026. Says stages may vary by team, technical assessment targets domain problem-solving, and expectations/time estimates are supplied in advance.
- Supports preparing multiple formats and confirming the specific round with the recruiter. It does not publish an algorithm question bank.

## S22

[Delivery Hero company-tag problem list — InterviewSolver](https://interviewsolver.com/interview-questions/delivery-hero)

- Public secondary list retrieved; underlying interview records, locations, dates and percentage methodology not independently established.
- Used only as a discovery signal for recommended exercises P51–P55 and P59–P60. These are NOT promoted to reported questions; frequency percentages are deliberately omitted.
- Remaining useful titles are mapped in EXTENSION_BACKLOG.md. Selection priorities are curriculum judgments, not employer-provided rankings.


## S23

[Delivery Hero SDE 2 Java, Germany — candidate account](https://leetcode.com/discuss/post/8281420/)

- Reopened September 30, 2026. Java/backend role; publication/interview year was not established from the retrieved page. Do not label it a verified 2026 interview.
- Names a binary-search-based task and a simple continuously arriving stream task, without exact operations. P19 lower bound and P63 rolling average are adaptations, not recovered exact questions.
- Also lists HAVING, range queries, locks, PostgreSQL/MySQL comparison, functional interfaces, OOP/SOLID, and Kafka partition/key and communication trade-offs. Supports SQL_DRILLS.md and backend discussion practice.

## S24

[camelCase to snake_case — Delivery Hero Senior Software Engineer, Glassdoor](https://www.glassdoor.co.uk/Interview/Q-Write-a-function-to-convert-camelCase-to-snake-case-QTN_6882053.htm)

- Public question page reopened September 30, 2026; explicitly identifies Senior Software Engineer and the conversion task.
- Supports P61. Acronyms, underscores, digits and null semantics are authored practice requirements; exact interview date not established.

## S25

[Reddit candidate comment reporting LFU cache](https://www.reddit.com/r/leetcode/comments/1f0foha/)

- Search-retrieved first-person comment dated July 31, 2025 reports design/code of LFU in a Python-role interview. A preceding March comment mentions a mid-level application; Senior Java is not established.
- Thread creation was August 2024; distinguish it from the later comment date and from the unverified interview date.
- Supports P62 with related-role scope. Capacity rules and LRU tie-breaking are practice contracts. Does not establish LFU as more frequent than LRU.

## S26

[Delivery Hero duplicate-index Two Sum account — LeetCode](https://leetcode.com/discuss/post/1201101/delivery-hero-interview-question-no-idea-how-to-solve-atm/)

- Public candidate text reopened September 30, 2026. Role and interview date not established.
- Describes returning indices summing to a target from an unsorted array with duplicates. Its sample output is incomplete.
- P64 chooses every unordered pair with i < j and an explicit deterministic output order. Those complete requirements are authored.

## S27

[Delivery Hero Senior SWE interview archive — Glassdoor](https://www.glassdoor.com/Interview/Delivery-Hero-Senior-Software-Engineer-Interview-Questions-EI_IE504556.0,13_KO14,38.htm)

- Public report reviewed January 30, 2026 describes a November 2025 Berlin interview with Python questions. It explicitly lists maximum element, Two Sum and Jump Game reachability.
- Supports P14 Senior SWE evidence and P65. P54 minimum jumps remains a different, unverified variant. Java signatures and edge semantics are authored.
- Public reports are self-reported; inaccessible archive entries remain unknown.
