# Relevance review — 3 October 2026

Target: senior Java backend engineer, eight years of experience, Delivery Hero Berlin. Related-company and other-language reports contribute transferable exercises but do not establish the exact process for this vacancy. No exact team/job description was supplied.

## What changed

60 exercises became 35: retained 33, removed 27, added P61 Jump Game reachability and P62 legacy-singleton adaptation. P40 now asks only for the maximum, matching newer senior evidence. P14 now has Berlin senior evidence rather than relying on Android evidence. P19 and P35 are linked to reported Java coding families without claiming that their exact tasks were asked. Existing P01 implementation was preserved.

Per-problem READMEs were removed after their contracts were moved into the Java files. Problem IDs remain stable. Tests remain separate JUnit files. The source ledger records the original and newly found sources; it is not a list of 27 independent interviews.

## DSA versus practical coding

| Format | Assessment for preparation | Evidence and limitation |
|---|---|---|
| Easy/medium DSA live coding | High priority; strongest direct named-task evidence | Berlin senior reports name Two Sum, maximum-in-array and Jump Game (S20/S25); older Berlin reports name word counting, pattern matching, OCR, max subarray and kth-largest (S1/S2). |
| Practical service implementation/debugging | Meaningful possibility; prepare alongside DSA | Berlin Java-focused account includes CRUD implementation (S28); Berlin Go report describes two REST APIs (S4); Glovo backend report describes service debugging (S5). Exact team formats still vary. |
| Mixed practical/algorithmic stream processing | Worth preparing | Java SDE2 Germany report names stream processing and binary search (S24), but no precise contract or verified interview date. |
| Large framework take-home or difficult competitive-programming task | Lower priority on the evidence found | No sufficiently matched, accessible report establishes either as the default for your interview. This is absence of evidence, not a zero probability. |

**There is no defensible numerical probability.** Public reports are a small, self-selected, team-mixed sample; some are old, duplicate or incomplete. Counting coding questions as independent interviews would bias the result. DSA and practical coding are also not mutually exclusive. Suggested coding-time allocation: **60% DSA / 40% practical**, plus the senior discussion time in the plan. This is a judgement about preparation, not an empirical chance of receiving either format.

The [current official hiring page](https://careers.deliveryhero.com/howwehire) says the assessment depends on the role and expectations are supplied ahead of time. The [2019 engineering guide](https://deliveryhero.jobs/blog/preparing-for-your-technical-interview-delivery-hero/) supports coding preparation but is too old to promise today's stage sequence. Ask the recruiter about your specific round.

## Practical exercises and what was actually reported

| Practice | Provenance |
|---|---|
| P09 order API core | S4 reports implementing two REST APIs; endpoints and data model here are authored. HTTP integration is a separate study-plan extension. |
| P10 rate limiter | S4 reports an API-abuse follow-up; the sliding-window algorithm was not specified. |
| P36 invoice debugging | S5 reports fixing a one-file service with tests; the actual service was undisclosed. Our invoice bugs are an adaptation. |
| P12 nested map transformation | S5 names snake_case-to-camelCase nested map conversion and a Java attempt. Edge rules here are authored. |
| P43 ordered set | S13 names a foodpanda principal data-structure design task; useful TDD practice, not Berlin evidence. |
| P62 legacy feature | S26 reports a manager-interview singleton scenario. Java coding requirements here are an adaptation, not an exact recalled question. |
| P34/P35/P57 | Authored retries, stream-deduplication and Java-concurrency drills. No claim these exact problems were asked. |

## Removed from active study

Removed means lower value for this focused route, not impossible in an interview. Kept a compact set of recommended hashing/window/interval/search/tree/graph/DP problems because learning transferable patterns is more robust than memorizing reports.

| ID | Exercise | Reason |
|---|---|---|
| P11 | Validate a word abbreviation | Automation-role report; OCR already covers parsing. |
| P13 | Keep at most two copies in a sorted array | Ambiguous older frontend evidence; at-most-two contract was speculative. |
| P20 | Minimum rate to finish independent batches | Redundant binary-search extension; master P19 first. |
| P22 | Decode nested repetitions | Extra parsing/stack depth beyond this compact route. |
| P25 | Sum a BST value range | Redundant tree variation; retain traversal coverage. |
| P29 | Deep-copy a graph with cycles | Additional graph variant beyond BFS/DFS/topological coverage. |
| P31 | Find a word along a grid path | Backtracking has weaker matched evidence; defer. |
| P33 | Maximum profit from one buy then sell | Brokerage theme alone is not interview relevance. |
| P37 | Minimum cost with equal city quotas | No matched company evidence; P61 supplies reported greedy coverage. |
| P38 | Shortest route in an unweighted graph | Unweighted BFS overlaps existing traversal coverage. |
| P39 | Mask every second character of each word | Android warm-up; word count and max already cover basic scanning. |
| P41 | Plan inserts, updates and removals | React report with inconsistent example; reconstructed set rules were weak. |
| P44 | Can everyone see the theatre screen? | Data-engineering repost with uncertain attribution. |
| P45 | Character frequencies in first-seen order | Weak data-engineering repost; hashing already covered. |
| P46 | Second distinct salary per department | Weak data-engineering source; keep backend join practice instead. |
| P48 | Check whether two strings are anagrams | Broader Glovo warm-up; overlaps pattern/hashing basics. |
| P49 | First non-repeating character | Extra warm-up without direct evidence. |
| P50 | Stacks with leftmost push and rightmost pop | Hard Glovo SE2 task; poor early return for the targeted route. |
| P51 | Compress consecutive character runs in-place | Unverified commercial company tag. |
| P52 | Check completeness of a binary tree | Unverified commercial company tag; traversal retained. |
| P53 | Next lexicographic permutation | Unverified commercial company tag. |
| P54 | Fewest jumps to the last index | Wrong variant for newer report: minimum jumps replaced by P61 reachability. |
| P55 | Map random tickets to weighted choices | Unverified commercial company tag. |
| P56 | Shortest route with nonnegative travel times | Weighted graph extension lacks matched evidence. |
| P58 | Extensible delivery pricing rules | HungerStation report did not disclose the coding task; invented pricing domain adds little. |
| P59 | Count right-and-down grid paths | Unverified tag; retain one foundational DP exercise. |
| P60 | Best profit with at most k trades | Unverified tag and disproportionate DP depth. |

## Search limits

Research included Delivery Hero official pages, Glassdoor senior and software-engineer pages (including pagination and linked questions), Java/Go backend LeetCode accounts, related Glovo/foodpanda reports, a firsthand Medium scenario, and targeted searches on Reddit/LinkedIn. Publicly accessible content only; no claim of exhaustive access to Glassdoor's full corpus or private interviews. Search-engine crawl dates were not treated as interview dates. Commercial question-frequency tables and AI-synthesized guides were not used as proof of exact questions. Future-candidate requests for advice were not counted as interview experiences.

## Additional community pass

See [COMMUNITY_REVIEW.md](COMMUNITY_REVIEW.md) for Reddit findings, new S28/S29 evidence, excluded promotional/duplicate material and access limits. The study allocation is unchanged; practical API preparation now has a Java-focused Berlin source.
