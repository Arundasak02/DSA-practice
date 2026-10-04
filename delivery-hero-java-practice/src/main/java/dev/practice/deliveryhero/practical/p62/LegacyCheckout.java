package dev.practice.deliveryhero.practical.p62;

/*
 * P62 — Add a testable feature around a legacy singleton | 40 minutes
 * Evidence: Adapted · Delivery Hero manager interview scenario, Dec 2024; role/location unspecified.
 *
 * A production singleton is used throughout a legacy application. Add a new feature
 * without modifying the legacy dependency. Make the feature independently testable.
 * Implement both constructors and deliveryLabel(). Default construction must use
 * LegacyConfigurator; injected construction must use only its supplied ConfigSource.
 * Reject a null ConfigSource with IllegalArgumentException. Config values may be null.
 * Trim brand; missing/blank brand defaults to "Shop". A trimmed, case-insensitive
 * "true" flag selects "express"; every other flag selects "standard".
 * Return "<brand>: <mode>". Different feature instances must remain isolated.
 * Example: brand="Fidelity", express.enabled="true" -> "Fidelity: express".
 * No Spring or global mutable state is needed. Tests cover behavior; also review
 * whether the new feature can evolve without touching the legacy class.
 * The source reports a singleton/testability discussion, NOT this exact coding task.
 * The checkout domain, interface, rules and tests here are authored adaptations.
 * Discuss after solving: gradual migration, dependency lifetime, rollback and how
 * this boundary lets you test without static mocking. Do not rewrite the whole app.
 *
 * Run: ./mvnw -Dtest=LegacyCheckoutTest test
 * Source S26: https://medium.com/@essammohamedomran/real-world-interview-with-a-tech-manager-at-delivery-hero-9fc5e234e1e1
 */
public class LegacyCheckout {
    // Boundary supplied to make the exercise runnable; production wiring is your task.
    public interface ConfigSource { String get(String key); }

    // Existing production dependency: do not edit this nested class.
    public static final class LegacyConfigurator {
        private static final LegacyConfigurator INSTANCE = new LegacyConfigurator();
        private LegacyConfigurator() {}
        public static LegacyConfigurator instance() { return INSTANCE; }
        public String get(String key) {
            return switch (key) {
                case "brand" -> "Delivery Hero";
                case "express.enabled" -> "false";
                default -> null;
            };
        }
    }

    public LegacyCheckout() {
        throw new UnsupportedOperationException("TODO P62: wire the production dependency");
    }
    public LegacyCheckout(ConfigSource config) {
        throw new UnsupportedOperationException("TODO P62: accept an isolated dependency");
    }
    public String deliveryLabel() {
        throw new UnsupportedOperationException("TODO P62: implement the feature");
    }
}
