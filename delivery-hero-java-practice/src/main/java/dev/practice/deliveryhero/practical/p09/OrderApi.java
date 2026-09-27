package dev.practice.deliveryhero.practical.p09;

import java.util.*;
import java.util.concurrent.*;
import java.math.*;

/** P09: Build two order API operations. Read README.md in this directory before implementing. */
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
