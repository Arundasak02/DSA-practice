package dev.practice.focus.java_streams;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

@Tag("focus")
@Timeout(10)
class JS07SalaryPartitionTest {
    private final JS07SalaryPartition sut=new JS07SalaryPartition();
    @Test void boundary() {
        var a=e("1","A",9);var b=e("2","A",10);assertEquals(Map.of(false,List.of(a),true,List.of(b)),sut.split(List.of(a,b),10));
    }
    @Test void empty() {
        assertEquals(Map.of(false,List.of(),true,List.of()),sut.split(List.of(),10));
    }
    @Test void order() {
        var a=e("a","A",10);var b=e("b","B",20);assertEquals(Map.of(false,List.of(),true,List.of(b,a)),sut.split(List.of(b,a),10));
    }
    private Employee e(String id,String department,long salary) { return new Employee(id,id,department,salary,1); }
}
