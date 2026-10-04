package dev.practice.deliveryhero.strings.p66;

/*
 * P66 — Convert camelCase to snake_case | 25 minutes
 * Evidence: Reported · Senior SWE; acronym rules authored.
 *
 * Task and contract: Input contains only ASCII letters, digits and underscores; null is invalid
 * (NullPointerException). Empty input returns empty. Preserve existing underscores and digits.
 * Lowercase all letters. Before an uppercase letter insert an underscore when its predecessor is
 * lowercase/digit, or when its predecessor is uppercase and its successor is lowercase. Do not insert
 * after an existing underscore or at position zero. This keeps acronym runs together. Input length
 * 0..100,000.  The signatures, constraints, examples and tests are authored practice requirements, not
 * a verbatim interview specification.
 *
 * Example: deliveryHeroOrder → delivery_hero_order; HTTPServer → http_server; orderID → order_id.
 *
 * Performance target: O(n) time and O(n) output space. Tests check behavior rather than proving
 * complexity.
 *
 * Run: ./mvnw -Dtest=SnakeCaseTest test
 * Source: research/SOURCES.md — S30
 */
public class SnakeCase {
    public String convert(String input) {
        throw new UnsupportedOperationException("TODO P66: implement your solution");
    }
}
