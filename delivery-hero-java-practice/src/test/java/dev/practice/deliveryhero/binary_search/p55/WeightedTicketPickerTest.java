package dev.practice.deliveryhero.binary_search.p55;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("binary_search")
@Timeout(10)
class WeightedTicketPickerTest {
    private final WeightedTicketPicker sut = new WeightedTicketPicker(new int[]{2,0,3});
    @Test
    void boundaries() throws Exception {
        assertEquals(0,sut.indexForTicket(0));assertEquals(0,sut.indexForTicket(1));assertEquals(2,sut.indexForTicket(2));assertEquals(2,sut.indexForTicket(4));
    }

    @Test
    void single() throws Exception {
        var p=new WeightedTicketPicker(new int[]{7});assertEquals(0,p.indexForTicket(6));
    }

    @Test
    void leadingZeros() throws Exception {
        var p=new WeightedTicketPicker(new int[]{0,0,1});assertEquals(2,p.indexForTicket(0));
    }

    @Test
    void largeTotal() throws Exception {
        var p=new WeightedTicketPicker(new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE});assertEquals(1,p.indexForTicket(4294967293L));
    }

    @Test
    void defensiveCopy() throws Exception {
        int[] a={1,2};var p=new WeightedTicketPicker(a);a[0]=100;assertEquals(1,p.indexForTicket(1));
    }

    @Test
    void exactDistribution() throws Exception {
        int[] counts=new int[3];for(long t=0;t<5;t++)counts[sut.indexForTicket(t)]++;assertArrayEquals(new int[]{2,0,3},counts);
    }
}
