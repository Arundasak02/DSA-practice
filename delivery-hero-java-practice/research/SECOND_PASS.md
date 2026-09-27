# What the broader research pass added

Date: 2026-09-27. Scope expanded at the user's request to all Delivery Hero locations and relevant roles, plus useful subsidiary reports and recommendations. The existing folder and exercise IDs remain stable.

## Concrete gaps found

| Evidence | Added or updated | Source |
|---|---|---|
| Delivery Hero Android: alternate-character masking | P39, explicit word boundaries | [S12](SOURCES.md#s12) |
| Delivery Hero senior React: min/max and collection reconciliation | P40–P41; inconsistent source example flagged | [S10](SOURCES.md#s10) |
| Delivery Hero senior Python: flattening and a SQL join | P42, P47; Java / in-memory SQL adaptations | [S11](SOURCES.md#s11) |
| foodpanda principal engineer: ordered set API | P43, with snapshots and operation-sequence tests | [S13](SOURCES.md#s13) |
| Delivery Hero data engineer repost: visibility, counts, salary ranking | P44–P46, weaker attribution disclosed | [S14](SOURCES.md#s14) |
| Glovo senior: anagrams, brackets, bicycle-rental design | P48, evidence update to P21, design rehearsal | [S15](SOURCES.md#s15) |
| Glovo SE2: Dinner Plate Stacks | P50, harder reported exercise | [S16](SOURCES.md#s16) |
| foodpanda Singapore: linked-list reversal | Evidence update to P23, recursive follow-up | [S17](SOURCES.md#s17) |
| Delivery Hero Android: Two Sum | Evidence update to P14 | [S18](SOURCES.md#s18) |
| HungerStation senior backend: OOP/design-pattern coding | Authored P58 pricing exercise; exact task undisclosed | [S19](SOURCES.md#s19) |

## Pattern gaps filled

Added first-unique-character, run-length compression, complete-tree checking, next permutation, jump minimization, weighted selection, Dijkstra, bounded blocking queue, grid-path counting and k-transaction DP. These are recommendations, not newly verified Delivery Hero questions. Some were discovered in a secondary company-tag list; none inherit its unverified frequency claims.

The bank now has **60 exercises**: **22 new runnable exercises**, with all prior solution code preserved. SQL tasks return a query string and run through JDBC/H2 against multiple fixtures. Java concurrency has blocking, interruption and producer/consumer tests. Code-design quality still requires a human review; a green suite alone cannot measure it.

## Search quality checks

- Read specific Glassdoor role pages and individual question entries, not just the company overview.
- Checked employer labels within mixed-company Glassdoor search pages. For example, a merge-sorted-arrays entry near a Delivery Hero entry actually belongs to Meta; it was not counted as a Delivery Hero report.
- Distinguished Delivery Hero from Delhivery and Deliveroo, which appeared in search results but are different employers.
- Used the primary LeetCode post for Dinner Plate Stacks after finding a secondary summary.
- Public Glassdoor bodies and search-visible excerpts were accessible for the sources cited. Not every page/older entry was accessible in full; no private or paywalled content was bypassed.
- Searched Talabat and HungerStation as well as foodpanda and Glovo. Talabat material found mainly described interview formats rather than disclosing an exact new problem. HungerStation justified an OOP rehearsal, not a fabricated historical prompt.
- Retained useful secondary leads as recommendations or extension references, rather than throwing them away or treating them as verified.

This remains a public-source collection, not an exhaustive history. New findings broaden preparation; they do not predict the exact team-specific interview.
