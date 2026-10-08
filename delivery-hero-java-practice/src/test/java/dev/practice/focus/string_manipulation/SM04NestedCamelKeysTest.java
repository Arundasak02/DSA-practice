package dev.practice.focus.string_manipulation;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

@Tag("focus")
@Timeout(10)
class SM04NestedCamelKeysTest {
    private final SM04NestedCamelKeys sut=new SM04NestedCamelKeys();
    @Test void nested() {
        assertEquals(Map.of("userInfo",Map.of("firstName","Arun")),sut.convert(Map.of("user_info",Map.of("first_name","Arun"))));
    }
    @Test void valuesAndEmpty() {
        assertEquals(Map.of("firstName","keep_me"),sut.convert(Map.of("firstName","keep_me"))); assertEquals(Map.of(),sut.convert(Map.of()));
    }
    @Test void collision() {
        assertThrows(IllegalArgumentException.class,()->sut.convert(Map.of("first_name","a","firstName","b")));
    }
    @Test void deepCopy() {
        var child=new HashMap<String,Object>(); child.put("first_name","a"); var input=new HashMap<String,Object>(); input.put("user_info",child); var output=sut.convert(input); child.put("first_name","b"); assertEquals(Map.of("userInfo",Map.of("firstName","a")),output); assertTrue(input.containsKey("user_info"));
    }
}
