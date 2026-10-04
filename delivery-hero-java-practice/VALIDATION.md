# Validation — 3 October 2026

- Clean Maven package with tests compiled but not run: passed (`./mvnw -q clean -DskipTests package`).
- Workspace smoke checks and existing P01 solution: all 9 passed (`./mvnw -q -Dtest=WorkspaceSmokeTest,WordCountTest test`).
- Full suite: 204 test methods discovered, 0 skipped: 201 exercise tests plus 3 workspace checks. Baseline: 12 passed, 9 assertion failures, 183 errors. These are expected from 33 unfinished stub exercises and P36's deliberate defects. Three invoice cases happen to pass; that does not make the exercise solved.
- Checked 35 catalog entries, 35 exercise source files, matching tests and in-file briefs; no per-problem Markdown files remain. Checked current local Markdown links. Removed source/test pairs no longer appear in the clean build.
- New/changed P40, P61 and P62 tests compile and execute against their TODO scaffolds. Reviewed negative/extreme integer values, unreachable jumps, input mutation, injected configuration, defaults and instance isolation. No completed solutions were added for these exercises; successful solution behavior has not been verified.
- Existing P01 method body was preserved, with its prior approach notes moved into the source comment. The tracker retained rows for retained exercises. Unrelated workspace files were untouched.

Maven 3.9.9 ran under OpenJDK 23.0.2 on this machine, compiling with Java release 17. A separate JDK 17 runtime and Windows execution were not tested. H2 fixture checks passed; this does not verify PostgreSQL-specific behavior.

P09 currently tests an in-memory API core; the real HTTP adapter is a learner extension scheduled in the plan. P62 tests behavior; review the dependency boundary as well. Concurrency tests are bounded samples, not proofs of correctness for every interleaving. Complexity targets require an explanation, not just a green test.

Full-suite output: ignored `target/refocused-test-run.log`. Expect the complete suite to remain red while exercises are unfinished. Run the individual exercise you are solving.
