# Delivery validation

Updated 2026-09-27 after expanding the bank from 38 to 60 exercises.

## Verified

- `./mvnw -DskipTests package`: **passed**, compiling all Java sources and tests with release target 17.
- `./mvnw -Dtest=WorkspaceSmokeTest test`: **3 checks passed**: Java/JUnit execution, problem/test/brief structure, and real JDBC/H2 setup/query execution.
- `./mvnw test`: discovered **343 tests**, with **0 skipped**: **340 exercise test methods** plus **3 setup checks**.
- Initial expanded-bank result: **6 passed, 8 assertion failures, 329 errors**. These are expected before solving: TODO exceptions (including wrapped asynchronous exceptions and exception-type assertions), plus four failures in the deliberately defective invoice service. Three invoice cases happen to pass; that does not make it solved.
- Confirmed **60 catalog entries, 60 source classes, 60 problem briefs and 60 exercise test classes**. There are 59 unsolved stub classes and one deliberately buggy service. Test support contains one SQL fixture helper and the setup test class; neither is counted as an exercise.
- Verified local Markdown links and source-ledger anchors, including links from deeply nested exercise folders.
- Reviewed new boundary expectations: whitespace preservation, set ordering/snapshots, duplicate salary ranks, outer-join NULL rows, stack holes, ticket boundaries, directed weighted paths and BigInteger path counts. Verified the two large combinatorial expectations independently.
- SQL tests create isolated databases with real schemas/fixtures; all fixture setup completed without SQL errors before the unsolved query stubs were reached.
- The existing P01–P38 solution files were preserved during expansion; selected briefs and source labels were updated. The progress tracker retained its previous rows and gained new rows.

## Runtime and limits

Maven wrapper 3.3.2 is pinned to Maven 3.9.9. Its bootstrap path was exercised on this machine. The build used the machine's Maven Java environment (OpenJDK 25.0.2) with `--release 17`. A separate JDK 17 runtime and Windows execution were not tested; the project uses Java 17 APIs/features and includes a Windows wrapper.

This validates the scaffolding, not solutions that have not been written. All-suite red is intentional. Complexity targets are review criteria, not benchmarks. Passing a finite concurrency test does not prove all interleavings; review the synchronization invariant as well. Blocking tests have bounded waits, which may be sensitive to extreme machine load or debugger pauses.

P09 tests an in-memory API core; its HTTP adapter remains an optional learner exercise. P58 tests pricing behavior; extensibility is a code-review criterion. H2 validates SQL result semantics for the stated schemas, not every PostgreSQL-specific feature or production execution plan.

Build output and test logs are in ignored `target/`. `initial-test-run.log` records the original bank; `expanded-test-run.log` records this expanded run. Maven can regenerate all build output. No completed exercise solutions or answer keys are supplied.
