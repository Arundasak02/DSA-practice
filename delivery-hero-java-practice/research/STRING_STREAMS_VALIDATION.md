# Focus-pack validation — 8 October 2026

- Maven compiles all new exercise and test sources on the existing Java 17 release target.
- FocusPackStructureTest passes: all 20 exercise source files have in-file evidence/Stream notes and matching JUnit files.
- All 66 acceptance test methods passed against temporary contract implementations outside the repository. The temporary OCR oracle uses sparse known positions; it validates behavior, not the requested constant-space solution.
- All 20 committed solution methods retain TODO exceptions. No answer key or reference implementation is included.
- Catalog IDs, test counts and local guide links were checked. Employee.java is a shared immutable fixture model, not an extra exercise.
- Tests validate examples/boundaries, including duplicates, empty inputs, ordering, Unicode code points, overflow, collisions and mutation. They do not enforce Stream syntax or prove complexity. JS10's reference check used a parallel pipeline, but this is not an exhaustive concurrency proof.
- Existing Pxx exercises, pending CRUD changes and their catalog remain separate. Running all unfinished exercises is expected to fail.
