package dev.practice.focus.java_streams;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

@Tag("focus")
@Timeout(10)
class JS08LatestEmployeeTest {
    private final JS08LatestEmployee sut=new JS08LatestEmployee();
    @Test void version() {
        var old=new Employee("1","old","A",10,1);var fresh=new Employee("1","new","B",20,2);assertEquals(Map.of("1",fresh),sut.latest(List.of(fresh,old)));
    }
    @Test void equalVersion() {
        var a=new Employee("1","a","A",10,1);var b=new Employee("1","b","A",10,1);assertEquals(Map.of("1",b),sut.latest(List.of(a,b)));
    }
    @Test void empty() {
        assertEquals(Map.of(),sut.latest(List.of()));
    }
}
