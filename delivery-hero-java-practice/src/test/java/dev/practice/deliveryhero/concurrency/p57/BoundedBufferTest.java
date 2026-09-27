package dev.practice.deliveryhero.concurrency.p57;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("concurrency")
@Timeout(10)
class BoundedBufferTest {
    private final BoundedBuffer sut = new BoundedBuffer(2);
    @Test
    void fifo() throws Exception {
        sut.put(1);sut.put(2);assertEquals(2,sut.size());assertEquals(1,sut.take());assertEquals(2,sut.take());assertEquals(0,sut.size());
    }

    @Test
    void takeWaits() throws Exception {
        ExecutorService pool=Executors.newSingleThreadExecutor();CountDownLatch entered=new CountDownLatch(1);
        try {var f=pool.submit(()->{entered.countDown();return sut.take();});assertTrue(entered.await(1,TimeUnit.SECONDS));assertThrows(TimeoutException.class,()->f.get(100,TimeUnit.MILLISECONDS));sut.put(7);assertEquals(7,f.get(2,TimeUnit.SECONDS));}finally{pool.shutdownNow();}
    }

    @Test
    void putWaits() throws Exception {
        sut.put(1);sut.put(2);ExecutorService pool=Executors.newSingleThreadExecutor();CountDownLatch entered=new CountDownLatch(1);
        try {var f=pool.submit(()->{entered.countDown();sut.put(3);return true;});assertTrue(entered.await(1,TimeUnit.SECONDS));assertThrows(TimeoutException.class,()->f.get(100,TimeUnit.MILLISECONDS));assertEquals(1,sut.take());assertTrue(f.get(2,TimeUnit.SECONDS));assertEquals(2,sut.take());assertEquals(3,sut.take());}finally{pool.shutdownNow();}
    }

    @Test
    void interruptEmptyTake() throws Exception {
        var failure=new java.util.concurrent.atomic.AtomicReference<Throwable>();CountDownLatch entered=new CountDownLatch(1);
        Thread t=new Thread(()->{entered.countDown();try{sut.take();failure.set(new AssertionError("take returned on empty queue"));}catch(Throwable e){failure.set(e);}});t.setDaemon(true);t.start();
        assertTrue(entered.await(1,TimeUnit.SECONDS));t.interrupt();t.join(2000);assertFalse(t.isAlive());assertInstanceOf(InterruptedException.class,failure.get());assertEquals(0,sut.size());
    }

    @Test
    void noLossOrDuplicates() throws Exception {
        ExecutorService pool=Executors.newFixedThreadPool(4);
        try {List<Future<?>> jobs=new ArrayList<>();Set<Integer> received=ConcurrentHashMap.newKeySet();
        for(int producer=0;producer<2;producer++){final int base=producer*100;jobs.add(pool.submit(()->{for(int i=0;i<100;i++)sut.put(base+i);return null;}));}
        for(int consumer=0;consumer<2;consumer++)jobs.add(pool.submit(()->{for(int i=0;i<100;i++)assertTrue(received.add(sut.take()));return null;}));
        for(var f:jobs)f.get(4,TimeUnit.SECONDS);assertEquals(200,received.size());for(int i=0;i<200;i++)assertTrue(received.contains(i));assertEquals(0,sut.size());
        }finally{pool.shutdownNow();}
    }
}
