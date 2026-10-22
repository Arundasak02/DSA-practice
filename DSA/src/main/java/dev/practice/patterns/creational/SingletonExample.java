package dev.practice.patterns.creational;

/*
 * SINGLETON — expose one shared instance of a type.
 * Example: immutable application settings, using Java's enum initialization.
 * AppSettings.INSTANCE is the singleton; its private final data cannot be changed here.
 * Enum avoids hand-written lazy-initialization locking for this simple example.
 * Scope: one enum instance per defining class loader, not a cross-service/distributed singleton.
 * A singleton does NOT make mutable methods/state automatically thread-safe.
 * Tradeoff: global access hides dependencies and can make tests harder. For services,
 * prefer constructor injection and let the application container manage lifetime.
 * Try: explain how you would inject different settings into a test instead.
 */
public class SingletonExample {
    enum AppSettings {
        INSTANCE;

        private final String currency = "EUR";

        public String currency() { return currency; }
    }

    public static void main(String[] args) {
        AppSettings first = AppSettings.INSTANCE;
        AppSettings second = AppSettings.INSTANCE;
        System.out.println("Same instance: " + (first == second));
        System.out.println("Currency: " + first.currency());
    }
    // Output: Same instance: true / Currency: EUR
}
