package dev.practice.focus.java_streams;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

@Tag("focus")
@Timeout(10)
class JS05SalaryTotalsTest {
    private final JS05SalaryTotals sut=new JS05SalaryTotals();
    @Test void departments() {
        assertEquals(Map.of("A",30L,"B",7L),sut.total(List.of(e("1","A",10),e("2","B",7),e("3","A",20))));
    }
    @Test void wideTotals() {
        assertEquals(Map.of("A",6000000000L),sut.total(List.of(e("1","A",3000000000L),e("2","A",3000000000L))));
    }
    @Test void empty() {
        assertEquals(Map.of(),sut.total(List.of()));
    }
    private Employee e(String id,String department,long salary) { return new Employee(id,id,department,salary,1); }
}
