# Delivery Hero — senior Java interview practice

40 exercises (35 core-bank files plus 5 preserved remote additions), 234 exercise test methods, Java 17+, Maven and JUnit 5. Reviewed 3 October 2026 for a Java backend engineer with eight years of experience applying in Berlin.

Start with the [study plan](STUDY_PLAN.md). It contains the ordered question bank, a four-week schedule and a seven-day route. The [research review](research/REVIEW.md) explains the evidence, DSA/practical assessment and removals.

Each exercise now has its short contract, example, evidence and run command **inside its Java source**. There are no separate problem READMEs. JUnit tests remain under `src/test/java`, so your solution and acceptance tests stay usable in a normal Maven IDE project. P means problem ID; gaps preserve existing IDs after pruning.

Open this folder or import `pom.xml` in IntelliJ. Select JDK 17 or newer, reload Maven, then open a Java file from the study plan. P01 retains your worked solution; P36 deliberately contains bugs. The other exercises are unfinished for you to implement.

```sh
# Check the workspace and your existing P01 solution:
./mvnw -Dtest=WorkspaceSmokeTest,WordCountTest test

# Work on one exercise:
./mvnw -Dtest=TwoSumTest test

# Compile all source and test scaffolds without running unfinished exercises:
./mvnw -DskipTests package
```

On Windows use `mvnw.cmd`. First use downloads Maven/dependencies. Running all tests is expected to fail until you finish the exercises; do not disable tests to make the project green. Tests cover stated behavior, not a proof of complexity or complete concurrency correctness.

Record attempts in [PROGRESS.md](PROGRESS.md). [SENIOR_READINESS.md](SENIOR_READINESS.md) adds Java/backend discussion practice. [VALIDATION.md](VALIDATION.md) records what was checked.

Remote additions were preserved during the October 4 merge. See the supplemental table in the study plan; P65 overlaps P61 and need not be studied twice.

For complete, runnable learning examples grouped by category, open [Java design patterns](DESIGN_PATTERNS.md). These eight examples are separate from the unfinished question bank and its exercise counts.
