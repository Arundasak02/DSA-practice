package dev.practice.focus.java_streams;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

@Tag("focus")
@Timeout(10)
class JS06DepartmentMaximumTest {
    private final JS06DepartmentMaximum sut=new JS06DepartmentMaximum();
    @Test void maxima() {
        var a=e("1","A",10);var b=e("2","A",20);var c=e("3","B",7);assertEquals(Map.of("A",b,"B",c),sut.highest(List.of(a,b,c)));
    }
    @Test void tie() {
        var a=e("a","A",20);var z=e("z","A",20);assertEquals(Map.of("A",a),sut.highest(List.of(z,a)));assertEquals(Map.of("A",a),sut.highest(List.of(a,z)));
    }
    @Test void empty() {
        assertEquals(Map.of(),sut.highest(List.of()));
    }
    private Employee e(String id,String department,long salary) { return new Employee(id,id,department,salary,1); }
}
