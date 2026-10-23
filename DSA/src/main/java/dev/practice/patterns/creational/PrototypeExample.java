package dev.practice.patterns.creational;

import java.util.*;

/*
 * PROTOTYPE — create a new object by copying an existing configured object.
 * Watchlist.copy is the copy operation; each instance owns its mutable list.
 * Unlike sharing immutable data, mutable nested values may require deep copying.
 * Tradeoff: define identity and copy depth explicitly; Object.clone is not required.
 * Try: add mutable per-symbol settings and preserve independence after copying.
 */
public class PrototypeExample {
    static class Watchlist {
        final List<String> symbols;
        Watchlist(List<String> symbols) { this.symbols = new ArrayList<>(symbols); }
        Watchlist copy() { return new Watchlist(symbols); }
    }
    public static void main(String[] args) {
        Watchlist original = new Watchlist(List.of("ACME"));
        Watchlist copy = original.copy();
        copy.symbols.add("BETA");
        System.out.println(original.symbols.size() + "/" + copy.symbols.size());
    }
    // Output: 1/2
}
