# P09 — Build two order API operations

**Priority:** A — **Learn first** · Study order 13/65.

Reported two REST APIs; order domain and endpoint contracts are authored.

**Pattern:** practical · **Time box:** 45 minutes  
**Evidence:** Adapted · Berlin SE II report names two REST APIs, no endpoints. [S4](../../../../../../../../research/SOURCES.md#s4)

## Task and contract

Implement a transport-independent API core with create(CreateOrder) and get(id), returning Response(status, order). CreateOrder contains sku and quantity. Valid sku is non-blank, quantity 1..100. Invalid create returns 400 and null order; successful create returns 201 and an Order with unique non-blank id, unchanged sku and quantity. get(existing) returns 200; get(unknown) returns 404 and null order. Requests and ids are non-null. Repeated valid creates are separate orders. Up to 100,000 operations; single-threaded baseline. No Spring or network is needed for these tests.

After the core passes, the optional HTTP round is POST /orders with JSON {sku,quantity} and GET /orders/{id}, preserving these statuses. Implement that adapter yourself in your preferred framework; HTTP wiring is not included in the scored tests.

Unless overridden above, arguments and contained elements are non-null; invalid inputs outside the stated domain need not be handled. Do not mutate inputs unless explicitly allowed. Constraints and edge semantics here are authored for practice, not a verbatim interview specification.

## Example

create({tea,2}) → 201; get(returned id) → 200; get(unknown) → 404.

## Work here

- Solution: [OrderApi.java](OrderApi.java)
- Tests: [OrderApiTest.java](../../../../../../../../src/test/java/dev/practice/deliveryhero/practical/p09/OrderApiTest.java)
- Run from the project root: `./mvnw -Dtest=OrderApiTest test`
- Expected initially: red tests from `UnsupportedOperationException`; implement the stub.

## Performance target

Expected O(1) lookup and insert; O(number of orders) storage. Tests check behavior, not a proof of complexity.

## Senior follow-up

Discuss request validation, status codes, persistence, pagination, concurrent requests, duplicate retries, observability, and API versioning. Add an HTTP adapter and integration tests as a second session.

## Your notes

- Assumptions clarified:
- Approach / invariant:
- Time and space:
- Edge case I initially missed:
- Retry date:
