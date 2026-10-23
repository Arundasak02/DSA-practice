package dev.practice.patterns.structural;

import java.util.*;

/*
 * FLYWEIGHT — share immutable repeated data while keeping per-item state outside it.
 * Style is shared intrinsic state; Label stores extrinsic text and position.
 * StylePool interns styles. This small example is single-threaded with a finite style set.
 * Tradeoff: an unbounded pool retains memory; sharing is useful only for genuinely repeated data.
 * Try: add font size to the pool key and explain why position must not be in Style.
 */
public class FlyweightExample {
    record Style(String color) {}
    record Label(String text, int x, Style style) {}
    static class StylePool {
        private final Map<String, Style> styles = new HashMap<>();
        Style get(String color) { return styles.computeIfAbsent(color, Style::new); }
    }
    public static void main(String[] args) {
        StylePool pool = new StylePool();
        Label a = new Label("buy", 10, pool.get("green"));
        Label b = new Label("sell", 20, pool.get("green"));
        System.out.println(a.style() == b.style());
    }
    // Output: true
}
