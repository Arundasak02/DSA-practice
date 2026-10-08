# String manipulation and Java Streams — focused practice

Researched 8 October 2026. **20 exercises, 66 acceptance test methods**, in two new folders. These are fresh, unsolved practice attempts; they do not replace your existing Pxx work or its catalog. Some reported string tasks intentionally repeat the earlier bank so you can follow one focused route without resetting a solution.

Delivery Hero has reported string tasks, but public accounts do not establish that strings dominate every team's interviews or support a measured frequency ranking. The first five string exercises use candidate reports; the remaining five provide transferable practice. Java Stream exercises are general Java preparation, not claimed Delivery Hero questions. Java Stream API is different from continuously arriving/Kafka event streams.

Every exercise has its contract, source/scope, Stream suitability and test command in its Java comment. Solutions remain TODO. Tests define authored edge behavior, not an exact recovered interview specification.

## String manipulation

| Exercise | Evidence / focus |
|---|---|
| [SM01 — Count words](src/main/java/dev/practice/focus/string_manipulation/SM01WordCounting.java) | Reported: Berlin SE2/SSE1 2021 and SEII 2022 |
| [SM02 — Match character-repetition patterns](src/main/java/dev/practice/focus/string_manipulation/SM02WordPatterns.java) | Reported: Berlin SEII 2022 |
| [SM03 — Convert camelCase to snake_case](src/main/java/dev/practice/focus/string_manipulation/SM03CamelToSnake.java) | Reported: Delivery Hero senior SWE; date/location unspecified |
| [SM04 — Convert nested map keys to camelCase](src/main/java/dev/practice/focus/string_manipulation/SM04NestedCamelKeys.java) | Reported: Glovo Spain backend; Java attempt, not Berlin |
| [SM05 — Compare OCR encodings](src/main/java/dev/practice/focus/string_manipulation/SM05OcrStrings.java) | Reported: Berlin SE2/SSE1 2021; numeric grammar reconstructed |
| [SM06 — First non-repeated code point](src/main/java/dev/practice/focus/string_manipulation/SM06FirstUnique.java) | Recommended string/Stream practice; not established as a DH question |
| [SM07 — Group anagrams](src/main/java/dev/practice/focus/string_manipulation/SM07AnagramGroups.java) | Recommended pattern/collector practice; not established as a DH question |
| [SM08 — Encode consecutive runs](src/main/java/dev/practice/focus/string_manipulation/SM08RunCompression.java) | Recommended string scanning; not established as a DH question |
| [SM09 — Reverse word order](src/main/java/dev/practice/focus/string_manipulation/SM09ReverseWords.java) | Recommended string manipulation; not established as a DH question |
| [SM10 — Check normalized palindrome](src/main/java/dev/practice/focus/string_manipulation/SM10Palindrome.java) | Recommended string/two-pointer practice; not established as a DH question |

## Java Stream API

| Exercise | Evidence / focus |
|---|---|
| [JS01 — Filter and map values](src/main/java/dev/practice/focus/java_streams/JS01FilterMap.java) | General Java Stream interview practice; no DH-specific attribution |
| [JS02 — Second-largest DISTINCT value](src/main/java/dev/practice/focus/java_streams/JS02SecondLargest.java) | General Java Stream interview practice; no DH-specific attribution |
| [JS03 — Count word frequencies](src/main/java/dev/practice/focus/java_streams/JS03WordFrequencies.java) | General Java Stream interview practice; no DH-specific attribution |
| [JS04 — Flatten nested lists and deduplicate](src/main/java/dev/practice/focus/java_streams/JS04FlatDistinct.java) | General Java Stream interview practice; no DH-specific attribution |
| [JS05 — Sum salaries by department](src/main/java/dev/practice/focus/java_streams/JS05SalaryTotals.java) | General Java Stream interview practice; no DH-specific attribution |
| [JS06 — Highest-paid employee per department](src/main/java/dev/practice/focus/java_streams/JS06DepartmentMaximum.java) | General Java Stream interview practice; no DH-specific attribution |
| [JS07 — Partition by salary threshold](src/main/java/dev/practice/focus/java_streams/JS07SalaryPartition.java) | General Java Stream interview practice; no DH-specific attribution |
| [JS08 — Convert list to map with duplicate IDs](src/main/java/dev/practice/focus/java_streams/JS08LatestEmployee.java) | General Java Stream interview practice; no DH-specific attribution |
| [JS09 — Sort employees with deterministic ties](src/main/java/dev/practice/focus/java_streams/JS09SortedNames.java) | General Java Stream interview practice; no DH-specific attribution |
| [JS10 — Reduce a total safely](src/main/java/dev/practice/focus/java_streams/JS10Reduction.java) | General Java Stream interview practice; no DH-specific attribution |

## When to use Streams for strings

| Fit | Questions | Why |
|---|---|---|
| Good | SM02, SM06, SM07 | Filtering and frequency/grouping operations; preserve required ordering. |
| Possible, compare against a loop | SM01, SM03, SM04, SM09, SM10 | Tokenization, adjacent-character rules, recursion or intermediate allocation can outweigh pipeline convenience. |
| Prefer a loop/scanner | SM05, SM08 | Coordinated run state is central; grouping characters can change the problem. |

Implement the clear solution first, then try a Stream variant only where useful. Explain both complexity and allocation costs. Do not use mutable external maps/sets as filter side effects. For Unicode, distinguish UTF-16 chars, code points and user-perceived characters; each question specifies its domain.

## Ten sessions, about 60–90 minutes each

| Session | Exercises | Discussion |
|---|---|---|
| 1 | SM01 + JS01 | Word boundaries, filter/map and lazy evaluation. |
| 2 | SM02 + JS02 | Bijections, duplicate semantics and Optional. |
| 3 | SM03 + JS03 | Acronym boundaries and encounter order. |
| 4 | SM04 + JS04 | Recursion versus flattening one level. |
| 5 | SM05 + JS05 | Expanded versus encoded size; primitive numeric totals. |
| 6 | SM06 + JS06 | Code points, grouping and deterministic ties. |
| 7 | SM07 + JS07 | Grouping versus partitioning. |
| 8 | SM08 + JS08 | Consecutive runs versus global counts; duplicate-key merge policy. |
| 9 | SM09 + JS09 | Order, comparators and avoiding mutation. |
| 10 | SM10 + JS10 | Space tradeoffs, associative reduction and parallel correctness. |

Use 25–40 minutes per first attempt, then explain an invariant and add a missing test. Retry weak tasks after two days. If time is short, prioritize reported SM01–SM05, then JS03–JS08. Existing related exercises: P01/P02/P03/P12/P66; choose fresh attempts here or your original implementation rather than doing both immediately.

## Run

Import the same Maven project. From its folder:

```sh
./mvnw -q -DskipTests package
./mvnw -Dtest=SM01WordCountingTest test
./mvnw -Dtest=JS03WordFrequenciesTest test
./mvnw -Dtest=FocusPackStructureTest test
```

Run all focus acceptance tests with `./mvnw '-Dtest=SM*Test,JS*Test' test`. They intentionally fail until you implement the solutions. Functional tests do not enforce Stream usage, prove asymptotic complexity or prove correctness for every parallel execution; review those explicitly.

## Java Stream follow-up questions

1. Which operations are intermediate/terminal? What makes evaluation lazy? Why is peek unsuitable for required business side effects?
2. How do map and flatMap differ? When does a primitive stream avoid boxing?
3. What happens with duplicate keys in toMap, and how do you choose a merge policy?
4. How do groupingBy and partitioningBy differ? When does result-map iteration order matter?
5. What is the difference between findFirst and findAny? How does source encounter order affect the result?
6. Why must a reduce identity be neutral and the operation associative? Why can a shared mutable accumulator fail in parallel?
7. Can a stream be reused after a terminal operation? Why are parallel streams not automatically faster?
8. Is the result of Stream.toList() modifiable? Does Collectors.toList() promise a specific implementation or mutability?

Use the [official API references and evidence notes](research/STRING_STREAMS_RESEARCH.md) to check your explanations. No answer key is provided for the coding tasks.
