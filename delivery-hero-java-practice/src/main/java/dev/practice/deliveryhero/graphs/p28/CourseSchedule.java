package dev.practice.deliveryhero.graphs.p28;

import java.util.*;
import java.util.concurrent.*;
import java.math.*;

/*
 * P28 — Detect cyclic dependencies | 35 minutes
 * Evidence: Recommended.
 *
 * Courses are 0..count-1. Each pair [course, prerequisite] means prerequisite must be completed first.
 * Return whether all courses can finish. Duplicate edges may appear and self-dependencies form cycles.
 * Count 0..100,000, at most 200,000 edges. Valid indices only.
 *
 * Inputs/elements are non-null unless stated. Do not mutate inputs unless allowed. Edge rules and
 * tests are practice specifications.
 *
 * Example: count=2, [[1,0],[0,1]] → false
 * Target: O(V+E) time and space.
 *
 * Run: ./mvnw -Dtest=CourseScheduleTest test
 * Source: curriculum recommendation; not a reported Delivery Hero question.
 */
public class CourseSchedule {

    public boolean canFinish(int count, int[][] prerequisites) {
        throw new UnsupportedOperationException("TODO P28: implement your solution");
    }
}
