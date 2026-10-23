package dev.practice.patterns.exercises;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.atomic.*;
@Tag("practice")
@Tag("design-patterns")
@Timeout(5)
class TradeOrderBuilderTest {
    @Test void marketDefaults() {
        var o=new TradeOrderBuilder.Builder().symbol("ACME").quantity(2).build();
        assertEquals(new TradeOrderBuilder.Order("ACME",2,TradeOrderBuilder.Type.MARKET,null),o);
    }
    @Test void limitOrder() {
        var o=new TradeOrderBuilder.Builder().symbol("X").quantity(1).limit(99).build();
        assertEquals(TradeOrderBuilder.Type.LIMIT,o.type());
        assertEquals(Long.valueOf(99),o.limitCents());
    }
    @Test void reuseDoesNotMutateProduct() {
        var b=new TradeOrderBuilder.Builder().symbol("X").quantity(1);
        var first=b.build();
        b.quantity(9);
        assertEquals(1,first.quantity());
        assertEquals(9,b.build().quantity());
    }
    @Test void marketClearsLimit() {
        var o=new TradeOrderBuilder.Builder().symbol("X").quantity(1).limit(10).market().build();
        assertNull(o.limitCents());
        assertEquals(TradeOrderBuilder.Type.MARKET,o.type());
    }
    @Test void validatesOnBuild() {
        var b=new TradeOrderBuilder.Builder();
        assertThrows(IllegalArgumentException.class,b::build);
        b.symbol(" ").quantity(1);
        assertThrows(IllegalArgumentException.class,b::build);
        b.symbol("X").quantity(0);
        assertThrows(IllegalArgumentException.class,b::build);
        b.quantity(1).limit(0);
        assertThrows(IllegalArgumentException.class,b::build);
    }
}
