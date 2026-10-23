package dev.practice.patterns.behavioural;

import java.util.*;

/*
 * ITERATOR — traverse a collection without exposing how it is stored.
 * Watchlist is Iterable; its iterator walks an immutable snapshot.
 * Java foreach consumes Iterable. Each iterator has an independent cursor.
 * Tradeoff: specify snapshot versus live traversal and mutation behavior.
 * Try: provide a reverse iterator without exposing the backing list.
 */
public class IteratorExample {
    static class Watchlist implements Iterable<String> {
        private final List<String> symbols;
        Watchlist(List<String> symbols) { this.symbols = List.copyOf(symbols); }
        public Iterator<String> iterator() {
            return new Iterator<>() {
                private int next;
                public boolean hasNext() { return next < symbols.size(); }
                public String next() {
                    if (!hasNext()) throw new NoSuchElementException();
                    return symbols.get(next++);
                }
            };
        }
    }
    public static void main(String[] args) {
        for (String symbol : new Watchlist(List.of("ACME", "BETA"))) System.out.println(symbol);
    }
    // Output: ACME then BETA on separate lines
}
