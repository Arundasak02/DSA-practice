package dev.practice.deliveryhero.intervals.p18;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("intervals")
@Timeout(10)
class MeetingRoomsTest {
    private final MeetingRooms sut = new MeetingRooms();
    @Test
    void overlap() throws Exception {
        assertEquals(2,sut.minimum(new int[][]{{0,30},{5,10},{15,20}}));
    }

    @Test
    void boundary() throws Exception {
        assertEquals(1,sut.minimum(new int[][]{{1,2},{2,3}}));
    }

    @Test
    void same() throws Exception {
        assertEquals(3,sut.minimum(new int[][]{{1,3},{1,3},{1,3}}));
    }

    @Test
    void empty() throws Exception {
        assertEquals(0,sut.minimum(new int[0][]));
    }

    @Test
    void unsorted() throws Exception {
        assertEquals(2,sut.minimum(new int[][]{{5,7},{1,6},{8,9}}));
    }
}
