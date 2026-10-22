# Core study plan — 42 questions

This is a focused foundation, not a promise of specific interview questions. Budget roughly six weeks at 60–90 minutes on six days each week; extend the schedule if the topics are new. Treat the question order as fixed and the dates as adjustable.

## Daily routine

- Spend 5–10 minutes restating the contract, writing examples and identifying edge cases.
- Attempt one new problem for 25–35 minutes; allow up to 45 for LRU, minimum window, graph scheduling or backtracking. Explain a brute-force approach first.
- If stuck, use a small hint, then close it and implement from memory. Record that attempt as assisted.
- Run the supplied tests, add one edge case of your own, and explain time/space complexity aloud.
- Use the remaining time for retries from two and seven days ago. On days with two easy problems, shorten the second attempt; never skip review just to meet the calendar.

Before starting, be comfortable with Java arrays, String/codePoints, HashMap, HashSet, ArrayDeque, PriorityQueue, Comparator, List and `long` for intermediate arithmetic. Use `Integer.compare` instead of subtracting in comparators. Learn loops first; Streams are optional practice, not a requirement for DSA.

## Week 1 — Arrays, hashing and strings

HashMap/HashSet, array traversal, prefix/suffix products, long arithmetic. State what your map stores before coding.

| Order | Problem | First attempt budget |
|---|---|---|
| D01 | [Detect duplicates](src/main/java/dev/practice/dsa/hashing/ContainsDuplicate.java) | 25 min |
| P14 | [Find two indices for a target](src/main/java/dev/practice/dsa/hashing/TwoSum.java) | 20 min |
| D07 | [Best single stock trade](src/main/java/dev/practice/dsa/arrays/StockProfit.java) | 25 min |
| P04 | [Maximum contiguous subarray sum](src/main/java/dev/practice/dsa/arrays/MaximumSubarray.java) | 25 min |
| D02 | [Product of array except self](src/main/java/dev/practice/dsa/arrays/ProductExceptSelf.java) | 25 min |
| D03 | [Longest consecutive sequence](src/main/java/dev/practice/dsa/hashing/LongestConsecutive.java) | 25 min |
| SM06 | [First non-repeated code point](src/main/java/dev/practice/dsa/strings/FirstUnique.java) | 25 min |
| SM07 | [Group anagrams](src/main/java/dev/practice/dsa/strings/AnagramGroups.java) | 25 min |
| P01 | [Count words](src/main/java/dev/practice/dsa/strings/WordCount.java) | 15 min |

## Week 2 — Two pointers and sliding windows

Sorted pointers, expand/shrink windows and prefix-sum counts. P16 allows negatives: a simple sliding window is not sufficient.

| Order | Problem | First attempt budget |
|---|---|---|
| SM10 | [Check normalized palindrome](src/main/java/dev/practice/dsa/strings/Palindrome.java) | 20 min |
| D04 | [Two sum in a sorted array](src/main/java/dev/practice/dsa/two_pointers/TwoSumSorted.java) | 25 min |
| D05 | [Unique zero-sum triplets](src/main/java/dev/practice/dsa/two_pointers/ThreeSum.java) | 35 min |
| D06 | [Container with most water](src/main/java/dev/practice/dsa/two_pointers/ContainerWater.java) | 25 min |
| P15 | [Longest substring without repeated characters](src/main/java/dev/practice/dsa/sliding_window/LongestUniqueSubstring.java) | 25 min |
| D08 | [Minimum covering substring](src/main/java/dev/practice/dsa/sliding_window/MinimumWindow.java) | 35 min |
| P16 | [Count subarrays with a target sum](src/main/java/dev/practice/dsa/hashing/SubarraySum.java) | 25 min |

## Week 3 — Search, intervals, stacks and heaps

Binary-search boundaries, comparator ordering, monotonic stacks and PriorityQueue. Start with sorting solutions, then improve where the contract requires it.

| Order | Problem | First attempt budget |
|---|---|---|
| P19 | [First position at least the target](src/main/java/dev/practice/dsa/binary_search/LowerBound.java) | 20 min |
| D09 | [Search a rotated sorted array](src/main/java/dev/practice/dsa/binary_search/SearchRotated.java) | 25 min |
| P17 | [Merge closed intervals](src/main/java/dev/practice/dsa/intervals/MergeIntervals.java) | 25 min |
| P18 | [Minimum simultaneous meeting rooms](src/main/java/dev/practice/dsa/intervals/MeetingRooms.java) | 25 min |
| P21 | [Validate bracket nesting](src/main/java/dev/practice/dsa/stacks/ValidBrackets.java) | 20 min |
| D10 | [Days until warmer temperature](src/main/java/dev/practice/dsa/stacks/DailyTemperatures.java) | 25 min |
| P05 | [Largest, second-largest and kth-largest](src/main/java/dev/practice/dsa/heaps/KthLargest.java) | 25 min |
| P32 | [Top k frequent values with deterministic ties](src/main/java/dev/practice/dsa/heaps/TopKFrequent.java) | 30 min |
| P08 | [Maintain the median of a stream](src/main/java/dev/practice/dsa/heaps/StreamingMedian.java) | 40 min |

## Week 4 — Linked lists, trees and graphs

Pointer updates, dummy nodes, BFS/DFS, visited state, indegrees. P24 combines a map and doubly linked list; draw the links first.

| Order | Problem | First attempt budget |
|---|---|---|
| P23 | [Reverse a singly linked list](src/main/java/dev/practice/dsa/linked_lists/ReverseList.java) | 25 min |
| D11 | [Merge sorted linked lists](src/main/java/dev/practice/dsa/linked_lists/MergeSortedLists.java) | 25 min |
| D12 | [Detect a linked-list cycle](src/main/java/dev/practice/dsa/linked_lists/LinkedListCycle.java) | 25 min |
| P24 | [Implement an LRU cache](src/main/java/dev/practice/dsa/linked_lists/LruCache.java) | 45 min |
| D13 | [Maximum binary-tree depth](src/main/java/dev/practice/dsa/trees/TreeDepth.java) | 25 min |
| P26 | [Traverse a binary tree level by level](src/main/java/dev/practice/dsa/trees/LevelOrder.java) | 25 min |
| D14 | [Validate a binary search tree](src/main/java/dev/practice/dsa/trees/ValidateBST.java) | 25 min |
| P27 | [Count islands in a grid](src/main/java/dev/practice/dsa/graphs/NumberOfIslands.java) | 25 min |
| P28 | [Detect cyclic dependencies](src/main/java/dev/practice/dsa/graphs/CourseSchedule.java) | 35 min |

## Week 5 — Backtracking, DP, greedy and bits

Choose/explore/undo; define DP state and base cases before transitions. Explain why a greedy decision is safe. Distinguish subsequences, combinations and contiguous subarrays.

| Order | Problem | First attempt budget |
|---|---|---|
| D15 | [Generate all subsets](src/main/java/dev/practice/dsa/backtracking/Subsets.java) | 35 min |
| D16 | [Combinations with unlimited reuse](src/main/java/dev/practice/dsa/backtracking/CombinationSum.java) | 35 min |
| D17 | [Find a word in a grid](src/main/java/dev/practice/dsa/backtracking/WordSearch.java) | 35 min |
| D18 | [Count ways to climb stairs](src/main/java/dev/practice/dsa/dynamic_programming/ClimbingStairs.java) | 25 min |
| D19 | [Maximum nonadjacent sum](src/main/java/dev/practice/dsa/dynamic_programming/HouseRobber.java) | 25 min |
| P30 | [Minimum coins for an amount](src/main/java/dev/practice/dsa/dynamic_programming/CoinChange.java) | 35 min |
| P61 | [Can you reach the last index?](src/main/java/dev/practice/dsa/greedy/JumpGame.java) | 25 min |
| D20 | [Count set bits from zero through n](src/main/java/dev/practice/dsa/bits/CountingBits.java) | 25 min |

## Week 6 — Recall and mock interviews

Use no new questions this week. On days 1–3, retry the problems marked assisted or failed in the tracker. On days 4–5, run a 45-minute mock: one unseen-to-you selection from this list, followed by an explanation and test discussion. Day 6 is a mixed review of your weakest two patterns.

A problem is ready only when you can solve it without notes, test edge cases, explain complexity and handle a small variation. Repeat after two days and seven days; a green test run immediately after reading a hint is not mastery. For most medium problems, aim eventually for a clear solution within 25–35 minutes, rather than memorizing lines of code.

## After the core

For Java interviews, do the ten [Streams exercises](docs/OPTIONAL_TRACKS.md#java-streams). For senior backend interviews, prioritize CRUD (P09), test design (P68), debugging (P36), rate limiting (P10) and idempotency (P34), then review the worked design patterns. Choose the remaining DSA extensions when you can explain the core comfortably. Keep these optional tracks separate from your daily DSA target.
