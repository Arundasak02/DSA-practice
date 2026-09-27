package dev.practice.deliveryhero.arrays.p44;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("arrays")
@Timeout(10)
class TheatreVisibilityTest {
    private final TheatreVisibility sut = new TheatreVisibility();
    @Test
    void visible() throws Exception {
        assertTrue(sut.allCanSee(new int[][]{{1,2},{3,4},{5,6}}));
    }

    @Test
    void equal() throws Exception {
        assertFalse(sut.allCanSee(new int[][]{{2},{2}}));
    }

    @Test
    void blocked() throws Exception {
        assertFalse(sut.allCanSee(new int[][]{{1,2},{4,3},{3,5}}));
    }

    @Test
    void oneRow() throws Exception {
        assertTrue(sut.allCanSee(new int[][]{{8,1,2}}));
    }

    @Test
    void empty() throws Exception {
        assertTrue(sut.allCanSee(new int[0][]));assertTrue(sut.allCanSee(new int[][]{{}}));
    }
}
