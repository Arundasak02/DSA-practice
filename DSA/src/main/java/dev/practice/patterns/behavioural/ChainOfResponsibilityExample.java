package dev.practice.patterns.behavioural;

import java.util.*;

/*
 * CHAIN OF RESPONSIBILITY — pass a request through ordered handlers until one rejects it.
 * Check is a handler; RiskChain invokes checks in order and stops on the first error.
 * This validation-pipeline variant lets several handlers process the same request.
 * Tradeoff: order is significant; tracing a long chain can be difficult.
 * Try: insert a maximum-quantity check without changing RiskChain.
 */
public class ChainOfResponsibilityExample {
    interface Check { Optional<String> reject(int quantity); }
    record RiskChain(List<Check> checks) {
        RiskChain { checks = List.copyOf(checks); }
        Optional<String> validate(int quantity) {
            for (Check check : checks) {
                Optional<String> error = check.reject(quantity);
                if (error.isPresent()) return error;
            }
            return Optional.empty();
        }
    }
    public static void main(String[] args) {
        RiskChain chain = new RiskChain(List.of(q -> q <= 0
            ? Optional.of("quantity must be positive") : Optional.empty()));
        System.out.println(chain.validate(0).orElse("OK"));
    }
    // Output: quantity must be positive
}
