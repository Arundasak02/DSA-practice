# DSA — Java practice

Build confidence through **42 core problems**, then choose from **45 optional exercises**. There are also 23 worked design-pattern examples. This is a general Java interview workspace; historical interview references remain in individual source comments where useful.

## Start here

1. Open this folder, or import `pom.xml`, in IntelliJ/Eclipse/VS Code. Use JDK 17+.
2. Follow [STUDY_PLAN.md](STUDY_PLAN.md), in order. Each link opens the Java problem statement and solution stub.
3. Run one test class, implement the method, explain the complexity, then record a retry in [PROGRESS.md](PROGRESS.md).

```sh
# From this DSA folder; first run downloads Maven/dependencies.
./mvnw -q -DskipTests test-compile
./mvnw -q -Dtest=ContainsDuplicateTest test
# Verify workspace structure and the existing worked solution:
./mvnw -q -Dtest=WorkspaceSmokeTest,WordCountTest test
```

On Windows use `mvnw.cmd`. The full `./mvnw test` command will fail until you implement the unfinished exercises. TODO exceptions are deliberate; tests are not disabled. `InvoiceCalculator` is a debugging exercise and `WordCountTestDesign` asks you to write tests. `WordCount` retains your existing implementation.

## Simple layout

| Location under `src/main/java/dev/practice/` | Purpose |
|---|---|
| `dsa/` | Core and extension algorithms, grouped by pattern |
| `streams/` | Ten Java Streams exercises and their Employee model |
| `backend/` | Eleven practical exercises: CRUD, testing, SQL, concurrency, caching-related services |
| `patterns/` | 23 runnable examples in creational, structural and behavioural groups; 12 TODO exercises in `exercises/` |

Tests mirror these packages under `src/test/java`. [Optional tracks](docs/OPTIONAL_TRACKS.md) lists every non-core exercise. [Design patterns](docs/DESIGN_PATTERNS.md) and [SQL drills](docs/SQL_DRILLS.md) provide the pattern learning path and optional SQL practice.

`catalog.json` is the single exercise index. IDs are stable so old notes still make sense; gaps in numbering are intentional. There are no separate per-problem READMEs. String exercise comments describe Stream suitability where relevant; use loops when they make an algorithm clearer.

See [references](docs/REFERENCES.md) for selection rationale and [migration notes](docs/MIGRATION.md) for consolidated questions.
