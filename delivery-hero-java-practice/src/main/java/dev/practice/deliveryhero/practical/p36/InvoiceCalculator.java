package dev.practice.deliveryhero.practical.p36;

import java.util.*;
import java.util.concurrent.*;
import java.math.*;

/** P36: Debug a small invoice service. Read README.md in this directory before implementing. */
public class InvoiceCalculator {
    public record Line(long unitCents, int quantity) {}
    public long calculate(List<Line> lines, int discountPercent) {
        // Intentionally buggy. Read the contract and use the tests to diagnose it.
        int subtotal = 0;
        for (Line line : lines) {
            subtotal += (int) line.unitCents();
        }
        return subtotal * (100 - discountPercent) / 100;
    }
}
