package dev.practice.deliveryhero.practical.p09;

import java.util.*;
import java.util.concurrent.*;
import java.math.*;

/*
 * P09 — Build two order API operations | 45 minutes
 * Evidence: Adapted · Berlin REST report (S4); Java-focused Berlin CRUD report (S28).
 *
 * Implement a transport-independent API core with create(CreateOrder) and get(id), returning
 * Response(status, order). CreateOrder contains sku and quantity. Valid sku is non-blank, quantity
 * 1..100. Invalid create returns 400 and null order; successful create returns 201 and an Order with
 * unique non-blank id, unchanged sku and quantity. get(existing) returns 200; get(unknown) returns 404
 * and null order. Requests and ids are non-null. Repeated valid creates are separate orders. Up to
 * 100,000 operations; single-threaded baseline. No Spring or network is needed for these tests.
 *
 * After the core passes, the optional HTTP round is POST /orders with JSON {sku,quantity} and GET
 * /orders/{id}, preserving these statuses. Implement that adapter yourself in your preferred
 * framework; HTTP wiring is not included in the scored tests.
 *
 * Inputs/elements are non-null unless stated. Do not mutate inputs unless allowed. Edge rules and
 * tests are practice specifications.
 *
 * Example: create({tea,2}) → 201; get(returned id) → 200; get(unknown) → 404.
 * Target: Expected O(1) lookup and insert; O(number of orders) storage.
 * Discuss after solving: Discuss request validation, status codes, persistence, pagination, concurrent
 * requests, duplicate retries, observability, and API versioning. Add an HTTP adapter and integration
 * tests as a second session.
 *
 * Extension: add update/delete with your own tests, then HTTP integration. Domain and
 * endpoint semantics are authored practice choices; neither report discloses them.
 *
 * Run: ./mvnw -Dtest=OrderApiTest test
 * Source S4: https://leetcode.com/discuss/post/4168834/Delivery-Hero-SEII/
 * Source S28: https://medium.com/@shilpikumari14049/delivery-hero-berlin-interview-experience-56c3b255119f
 */
public class OrderApi {
    public record CreateOrder(String sku, int quantity) {}
    public record Order(String id, String sku, int quantity) {}
    public record Response(int status, Order order) {}
    public Response create(CreateOrder request) {
        throw new UnsupportedOperationException("TODO P09: implement your solution");
    }

    public Response get(String id) {
        throw new UnsupportedOperationException("TODO P09: implement your solution");
    }
}
