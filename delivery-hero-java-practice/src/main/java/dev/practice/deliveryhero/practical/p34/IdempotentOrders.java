package dev.practice.deliveryhero.practical.p34;

import java.util.*;
import java.util.concurrent.*;
import java.math.*;

/** P34: Create orders safely under duplicate retries. Read README.md in this directory before implementing. */
public class IdempotentOrders {
    public record Order(String id, String sku, int quantity) {}
    public Order create(String key, String sku, int quantity) {
        throw new UnsupportedOperationException("TODO P34: implement your solution");
    }
}
