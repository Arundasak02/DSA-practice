package dev.practice.patterns.exercises;

import java.util.List;

/*
 * DP08 — Reusable import workflow | 45 minutes
 * Patterns to practise: Template Method
 * Complete final run(lines). Snapshot input, then parse and validate each line in input order.
 * Only after ALL lines succeed, call save once with an immutable list in order, including empty input.
 * Return saved count. Propagate parse/validation/save failures unchanged; do not call save after
 * parse/validation failure. validate defaults to rejecting blank parsed strings with IllegalArgumentException.
 * Inputs, parsed values and list elements non-null. Caller supplies subclass hooks.
 * Design: run must own sequencing; subclasses customize hooks, not reorder the algorithm.
 * Follow-up: discuss memory limits and transactional behavior for large streaming imports.
 *
 * General interview-style practice; contract/tests are authored, not an exact company question.
 * Run: ./mvnw -Dtest=ImportWorkflowTest test
 * References: docs/DESIGN_PATTERNS.md#sources-and-evidence
 */
public class ImportWorkflow {

  public static abstract class Importer {

    public final int run(List<String> lines) {
      throw new UnsupportedOperationException("TODO DP08");
    }

    protected abstract String parse(String line);

    protected void validate(String value) {
      throw new UnsupportedOperationException("TODO DP08");
    }

    protected abstract void save(List<String> values);
  }
}
