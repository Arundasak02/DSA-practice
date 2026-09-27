package dev.practice.deliveryhero.practical.p58;

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
class DeliveryPricingTest {
    private final DeliveryPricing sut = new DeliveryPricing();
    @Test
    void standard() throws Exception {
        assertEquals(200L,sut.quote(DeliveryPricing.Mode.STANDARD,3,2000,false));assertEquals(300L,sut.quote(DeliveryPricing.Mode.STANDARD,5,2000,false));
    }

    @Test
    void waiver() throws Exception {
        assertEquals(0L,sut.quote(DeliveryPricing.Mode.STANDARD,100,3000,false));
    }

    @Test
    void express() throws Exception {
        assertEquals(700L,sut.quote(DeliveryPricing.Mode.EXPRESS,5,10000,false));
    }

    @Test
    void member() throws Exception {
        assertEquals(160L,sut.quote(DeliveryPricing.Mode.STANDARD,0,0,true));assertEquals(560L,sut.quote(DeliveryPricing.Mode.EXPRESS,5,5000,true));
    }

    @Test
    void waiverThenDiscount() throws Exception {
        assertEquals(0L,sut.quote(DeliveryPricing.Mode.STANDARD,9,3000,true));
    }

    @Test
    void noStateLeak() throws Exception {
        sut.quote(DeliveryPricing.Mode.STANDARD,9,3000,true);assertEquals(500L,sut.quote(DeliveryPricing.Mode.EXPRESS,0,0,false));
    }
}
