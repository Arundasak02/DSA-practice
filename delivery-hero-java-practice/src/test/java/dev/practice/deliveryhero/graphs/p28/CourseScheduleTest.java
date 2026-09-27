package dev.practice.deliveryhero.graphs.p28;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("graphs")
@Timeout(10)
class CourseScheduleTest {
    private final CourseSchedule sut = new CourseSchedule();
    @Test
    void dag() throws Exception {
        assertTrue(sut.canFinish(3,new int[][]{{1,0},{2,1}}));
    }

    @Test
    void cycle() throws Exception {
        assertFalse(sut.canFinish(2,new int[][]{{1,0},{0,1}}));
    }

    @Test
    void self() throws Exception {
        assertFalse(sut.canFinish(1,new int[][]{{0,0}}));
    }

    @Test
    void disconnectedCycle() throws Exception {
        assertFalse(sut.canFinish(4,new int[][]{{1,0},{2,3},{3,2}}));
    }

    @Test
    void empty() throws Exception {
        assertTrue(sut.canFinish(0,new int[0][]));
    }

    @Test
    void duplicateEdge() throws Exception {
        assertTrue(sut.canFinish(2,new int[][]{{1,0},{1,0}}));
    }
}
