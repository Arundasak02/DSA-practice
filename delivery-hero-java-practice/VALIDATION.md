# Merge validation — 4 October 2026

Merged the focused preparation branch with remote main, preserving all five remote exercise additions and SQL drills. The combined project has 40 unique exercise IDs, 40 source/test pairs and 234 exercise test methods plus 3 workspace checks. Remote SnakeCase/LfuCache were renumbered to P66/P67 to avoid collisions. P65 is retained as an alternative to P61.

- Clean compilation of all sources and tests passed.
- All 9 workspace/P01 checks passed after the merge.
- Catalog counts, unique IDs, local documentation links, no conflict markers and no per-problem READMEs checked.
- No completed solutions added. The combined full suite was not rerun; unfinished exercises are still expected to fail. The earlier full-suite results below apply only to the pre-merge 35-exercise bank.

## Historical validation before merge

Validated 3 October 2026

- Clean Maven package with tests compiled but not run: passed (`./mvnw -q clean -DskipTests package`).
- Workspace smoke checks and existing P01 solution: all 9 passed (`./mvnw -q -Dtest=WorkspaceSmokeTest,WordCountTest test`).
- Full suite: 204 test methods discovered, 0 skipped: 201 exercise tests plus 3 workspace checks. Baseline: 12 passed, 9 assertion failures, 183 errors. These are expected from 33 unfinished stub exercises and P36's deliberate defects. Three invoice cases happen to pass; that does not make the exercise solved.
- Checked 35 catalog entries, 35 exercise source files, matching tests and in-file briefs; no per-problem Markdown files remain. Checked current local Markdown links. Removed source/test pairs no longer appear in the clean build.
- New/changed P40, P61 and P62 tests compile and execute against their TODO scaffolds. Reviewed negative/extreme integer values, unreachable jumps, input mutation, injected configuration, defaults and instance isolation. No completed solutions were added for these exercises; successful solution behavior has not been verified.
- Existing P01 method body was preserved, with its prior approach notes moved into the source comment. The tracker retained rows for retained exercises. Unrelated workspace files were untouched.

Maven 3.9.9 ran under OpenJDK 23.0.2 on this machine, compiling with Java release 17. A separate JDK 17 runtime and Windows execution were not tested. H2 fixture checks passed; this does not verify PostgreSQL-specific behavior.

P09 currently tests an in-memory API core; the real HTTP adapter is a learner extension scheduled in the plan. P62 tests behavior; review the dependency boundary as well. Concurrency tests are bounded samples, not proofs of correctness for every interleaving. Complexity targets require an explanation, not just a green test.

Full-suite output: ignored `target/refocused-test-run.log`. Expect the complete suite to remain red while exercises are unfinished. Run the individual exercise you are solving.
