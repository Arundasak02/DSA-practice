package dev.practice.deliveryhero.practical.p36;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("practical")
@Timeout(10)
class InvoiceCalculatorTest {
    private final InvoiceCalculator sut = new InvoiceCalculator();
    @Test
    void quantity() throws Exception {
        assertEquals(750L,sut.calculate(List.of(new InvoiceCalculator.Line(250,3)),0));
    }

    @Test
    void roundHalfUp() throws Exception {
        assertEquals(91L,sut.calculate(List.of(new InvoiceCalculator.Line(101,1)),10));
    }

    @Test
    void discountOnce() throws Exception {
        assertEquals(1L,sut.calculate(List.of(new InvoiceCalculator.Line(1,1),new InvoiceCalculator.Line(1,1)),50));
    }

    @Test
    void fullDiscount() throws Exception {
        assertEquals(0L,sut.calculate(List.of(new InvoiceCalculator.Line(999,2)),100));
    }

    @Test
    void invalidDiscount() throws Exception {
        assertThrows(IllegalArgumentException.class,()->sut.calculate(List.of(),101));assertThrows(IllegalArgumentException.class,()->sut.calculate(List.of(),-1));
    }

    @Test
    void largeAmount() throws Exception {
        assertEquals(6000000000L,sut.calculate(List.of(new InvoiceCalculator.Line(3000000000L,2)),0));
    }

    @Test
    void empty() throws Exception {
        assertEquals(0L,sut.calculate(List.of(),0));
    }
}
