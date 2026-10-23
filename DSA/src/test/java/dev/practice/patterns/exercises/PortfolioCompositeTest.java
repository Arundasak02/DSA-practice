package dev.practice.patterns.exercises;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.atomic.*;
@Tag("practice")
@Tag("design-patterns")
@Timeout(5)
class PortfolioCompositeTest {
    @Test void nestedAndRepeated() {
        var leaf=PortfolioComposite.position(10);
        var group=PortfolioComposite.portfolio(List.of(leaf,PortfolioComposite.portfolio(List.of(leaf,PortfolioComposite.position(5)))));
        assertEquals(25,group.totalCents());
    }
    @Test void emptyAndInvalid() {
        assertEquals(0,PortfolioComposite.portfolio(List.of()).totalCents());
        assertThrows(IllegalArgumentException.class,()->PortfolioComposite.position(-1));
    }
    @Test void copiesChildren() {
        var list=new ArrayList<PortfolioComposite.Asset>();
        list.add(PortfolioComposite.position(5));
        var p=PortfolioComposite.portfolio(list);
        list.clear();
        assertEquals(5,p.totalCents());
    }
    @Test void supportsNewAssetTypes() {
        var value=new AtomicLong(7);
        var p=PortfolioComposite.portfolio(List.of(value::get));
        assertEquals(7,p.totalCents());
        value.set(9);
        assertEquals(9,p.totalCents());
    }
    @Test void checksOverflow() {
        var p=PortfolioComposite.portfolio(List.of(PortfolioComposite.position(Long.MAX_VALUE),PortfolioComposite.position(1)));
        assertThrows(ArithmeticException.class,p::totalCents);
    }
}
