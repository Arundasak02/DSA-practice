# P12 — Convert nested map keys to camelCase

**Pattern:** recursion · **Time box:** 35 minutes  
**Evidence:** Related-company report · Glovo Spain; Java attempt. [S5](../../../../../../../../research/SOURCES.md#s5)

## Task and contract

Return a deep copy of a nested Map<String,Object>, converting every key from snake_case to camelCase. Keys follow [a-z]+(_[a-z]+)* or are already lowerCamelCase without underscores. Values are strings or nested maps only; maps are acyclic, depth ≤100. Preserve strings unchanged. If two keys in the same map convert to the same key, throw IllegalArgumentException. Output key order is unrestricted. Do not mutate or reuse mutable input maps.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

`{user_info: {first_name: "Arun"}} → {userInfo: {firstName: "Arun"}}`

## Work here

- Solution: [CamelCaseMap.java](CamelCaseMap.java)
- Tests: [CamelCaseMapTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/recursion/p12/CamelCaseMapTest.java)
- Run from the project root: `./mvnw -Dtest=CamelCaseMapTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

O(total key characters + map entries) time; O(output + recursion depth) space. Tests check behavior, not a proof of complexity.

## Senior follow-up

Extend to lists, null values and cycle detection only after clarifying a new contract.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
