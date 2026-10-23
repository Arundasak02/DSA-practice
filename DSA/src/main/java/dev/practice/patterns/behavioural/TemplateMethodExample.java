package dev.practice.patterns.behavioural;

import java.util.*;

/*
 * TEMPLATE METHOD — fix the workflow while subclasses supply a variable step.
 * Importer.run is final; parse is the hook; CsvImporter provides parsing.
 * Unlike Strategy composition, variation comes from inheritance here.
 * Tradeoff: subclasses are coupled to superclass workflow; avoid deep inheritance trees.
 * Try: add a pipe-separated importer without changing run.
 */
public class TemplateMethodExample {
    static abstract class Importer {
        final List<String> run(String input) {
            if (input.isBlank()) return List.of();
            return parse(input).stream().map(String::trim).filter(s -> !s.isEmpty()).toList();
        }
        abstract List<String> parse(String input);
    }
    static class CsvImporter extends Importer {
        List<String> parse(String input) { return Arrays.asList(input.split(",")); }
    }
    public static void main(String[] args) {
        System.out.println(new CsvImporter().run(" ACME, , BETA "));
    }
    // Output: [ACME, BETA]
}
