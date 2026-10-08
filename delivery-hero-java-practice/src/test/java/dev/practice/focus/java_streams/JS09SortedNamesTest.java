package dev.practice.focus.java_streams;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

@Tag("focus")
@Timeout(10)
class JS09SortedNamesTest {
    private final JS09SortedNames sut=new JS09SortedNames();
    @Test void sort() {
        var a=new Employee("1","Zoe","A",10,1);var b=new Employee("2","Amy","A",20,1);var c=new Employee("3","Bob","A",20,1);assertEquals(List.of("Amy","Bob","Zoe"),sut.names(List.of(a,c,b)));
    }
    @Test void extremes() {
        assertEquals(List.of("high","low"),sut.names(List.of(new Employee("1","low","A",0,1),new Employee("2","high","A",Long.MAX_VALUE,1))));
    }
    @Test void noMutation() {
        var a=new Employee("1","Z","A",1,1);var b=new Employee("2","A","A",2,1);var input=new ArrayList<>(List.of(a,b));assertEquals(List.of("A","Z"),sut.names(input));assertEquals(List.of(a,b),input);assertEquals(List.of(),sut.names(List.of()));
    }
}
