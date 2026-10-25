# Workspace cleanup

The Maven project moved from `delivery-hero-java-practice/` to `DSA/`; its artifact is now `dsa`.
DSA packages use `dev.practice.dsa.<topic>` without one folder per exercise. Backend, Streams and
worked patterns have separate packages. Import `DSA/pom.xml` again if your IDE still points at the
old location.

The duplicated focus exercises were consolidated into the originals:

| Removed duplicate    | Retained exercise                          |
|----------------------|--------------------------------------------|
| SM01 WordCounting    | P01 WordCount, including existing solution |
| SM02 WordPatterns    | P02 PatternWords                           |
| SM03 CamelToSnake    | P66 SnakeCase                              |
| SM04 NestedCamelKeys | P12 CamelCaseMap                           |
| SM05 OcrStrings      | P03 OcrCompatibility                       |
| P65 JumpReachability | P61 JumpGame                               |

SM06–SM10 remain, with shorter class names and their existing tests. All ten Streams exercises and
eight worked pattern examples remain. The pending CRUD and test-design additions were retained.
D01–D20 add 20 fundamentals with solution stubs and 79 test methods.

Overlapping study guides and company research notes were removed from the active workspace. Relevant
source URLs remain in Java comments. Generated build output, project IDE metadata and empty
modernization/output scaffolding were removed. Maven wrapper files and test fixtures are required
and retained. Root IDE settings were left intact.

A snapshot of the original project, excluding generated build output, was saved outside this
repository before cleanup. No Git history or remote repository name was changed.
