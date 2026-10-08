package dev.practice.patterns.structural;

/*
 * DECORATOR — wrap an object to add behavior while preserving its interface.
 * Example: wrap coffee with milk, then sugar; each wrapper adds to the price.
 * Drink is the component; Coffee is concrete; Milk/Sugar are decorators.
 * Why: combine extras without classes such as CoffeeWithMilkAndSugar.
 * Decorator adds behavior; Proxy usually controls access to the same behavior.
 * Assumptions: delegates are non-null; prices use integer cents.
 * Try: add a cream decorator. In backend code, think metrics around a service call.
 */
public class DecoratorExample {
    interface Drink {
        int priceCents();
    }

    static class Coffee implements Drink {
        public int priceCents() { return 200; }
    }

    static class Milk implements Drink {
        private final Drink wrapped;
        Milk(Drink wrapped) { this.wrapped = wrapped; }
        public int priceCents() { return wrapped.priceCents() + 50; }
    }

    static class Sugar implements Drink {
        private final Drink wrapped;
        Sugar(Drink wrapped) { this.wrapped = wrapped; }
        public int priceCents() { return wrapped.priceCents() + 20; }
    }

    public static void main(String[] args) {
        Drink plain = new Coffee();
        Drink withExtras = new Sugar(new Milk(plain));
        System.out.println("Plain: " + plain.priceCents() + " cents");
        System.out.println("Milk + sugar: " + withExtras.priceCents() + " cents");
    }
    // Output: Plain: 200 cents / Milk + sugar: 270 cents
}
