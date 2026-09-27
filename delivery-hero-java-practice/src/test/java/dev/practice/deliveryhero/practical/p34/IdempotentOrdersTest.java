package dev.practice.deliveryhero.practical.p34;

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
class IdempotentOrdersTest {
    private final IdempotentOrders sut = new IdempotentOrders();
    @Test
    void replay() throws Exception {
        var a=sut.create("k","tea",1);assertFalse(a.id().isBlank());assertEquals("tea",a.sku());assertEquals(1,a.quantity());assertEquals(a,sut.create("k","tea",1));
    }

    @Test
    void conflict() throws Exception {
        var a=sut.create("k","tea",1);assertThrows(IllegalArgumentException.class,()->sut.create("k","tea",2));assertEquals(a,sut.create("k","tea",1));
    }

    @Test
    void skuConflict() throws Exception {
        sut.create("k","tea",1);assertThrows(IllegalArgumentException.class,()->sut.create("k","rice",1));
    }

    @Test
    void distinct() throws Exception {
        assertNotEquals(sut.create("a","tea",1).id(),sut.create("b","tea",1).id());
    }

    @Test
    void concurrentReplay() throws Exception {
        ExecutorService pool=Executors.newFixedThreadPool(8);
        try {
            CountDownLatch start=new CountDownLatch(1);
            List<Future<IdempotentOrders.Order>> futures=new ArrayList<>();
            for(int i=0;i<32;i++) futures.add(pool.submit(()->{start.await();return sut.create("k","tea",1);}));
            start.countDown();
            Set<IdempotentOrders.Order> results=new HashSet<>();
            for(var f:futures) results.add(f.get(3,TimeUnit.SECONDS));
            assertEquals(1,results.size());
            assertEquals("tea",results.iterator().next().sku());
        } finally { pool.shutdownNow(); }
    }
}
