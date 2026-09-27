# P46 — Second distinct salary per department

**Pattern:** sql · **Time box:** 30 minutes  
**Evidence:** Adapted · Delivery Hero data engineer salary-ranking report. [S14](../../../../../../../../research/SOURCES.md#s14)

## Task and contract

Return one SQL SELECT statement as a Java text block from query(). Tests execute it against an isolated in-memory H2 database. Schema: departments(id INT PRIMARY KEY, name VARCHAR(100)); employees(id INT PRIMARY KEY, department_id INT REFERENCES departments(id), salary BIGINT NULL). Return two columns in order: department_id, second_salary, one row for EVERY department ordered by id. second_salary is the second highest DISTINCT non-null salary, or SQL NULL if absent. Ignore null salaries. This distinct/tie rule resolves an ambiguity in the reported task. No writes, schema changes or multiple statements. All schema/fixtures are supplied by the tests.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

Department salaries `[100,100,80]` → 80; `[100,100]` → NULL.

## Work here

- Solution: [SecondSalaryQuery.java](SecondSalaryQuery.java)
- Tests: [SecondSalaryQueryTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/sql/p46/SecondSalaryQueryTest.java)
- Run from the project root: `./mvnw -Dtest=SecondSalaryQueryTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

Explain the execution plan and a useful department/salary index. Do not infer production performance from tiny H2 fixtures. Tests check behavior, not a proof of complexity.

<details>
<summary>Prerequisite / small hint (open only if stuck)</summary>

Prerequisites: outer joins and the different tie semantics of ROW_NUMBER, RANK and DENSE_RANK.

</details>

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
