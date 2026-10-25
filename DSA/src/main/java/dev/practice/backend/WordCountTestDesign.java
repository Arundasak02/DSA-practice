package dev.practice.backend;

import dev.practice.dsa.strings.WordCount;
import java.util.function.ToIntFunction;

/*
 * P68 — Write tests for word counting | 30 minutes
 * Evidence: Reported task + test cases, Berlin SE2/SSE1 August 2021 (S1).
 * The test-writing format is reported; this contract and fault-checking harness are authored.
 *
 * Your task is TESTS, not a new word-count solution. In WordCountTestDesignTest.java implement
 * assertContract(counter) using JUnit assertions and the supplied counter.applyAsInt(text).
 * Use fixed expected results; do not calculate expected answers by calling P01 or this subject.
 * Contract: null/empty -> 0; otherwise count maximal runs of non-whitespace BMP characters,
 * using Character.isWhitespace(char) boundaries. Punctuation belongs to its word. Length <=100,000.
 * The null policy is a practice extension of the report. Input and no global state are changed.
 *
 * Plan equivalence classes and boundaries first. Do not inspect P01 tests or the fault list until
 * after your first attempt. Write meaningful assertions, not an unconditional throw/failure.
 * Your suite must accept the existing P01 implementation and reject each supplied faulty variant.
 * Catching exceptions inside assertContract hides defects; let assertion failures propagate.
 * Passing the finite fault set is feedback, not proof that your tests cover every possible bug.
 *
 * The provided subject delegates to your existing P01 solution; preserve it during this exercise.
 * Explain what defect each test detects, then add a case beyond the supplied fault catalogue.
 * Run: ./mvnw -Dtest=WordCountTestDesignTest test
 * Source S1: https://leetcode.com/discuss/post/1413476/delivery-hero-se2sse1-berlin-august-2021-awaiting-result/
 */
public final class WordCountTestDesign {

  private WordCountTestDesign() {
  }

  public static ToIntFunction<String> subject() {
    return new WordCount()::count;
  }
}
