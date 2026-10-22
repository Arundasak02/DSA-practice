package dev.practice;

import org.junit.jupiter.api.Test;
import java.nio.file.*;
import java.util.*;
import java.util.regex.Pattern;
import static org.junit.jupiter.api.Assertions.*;

class WorkspaceSmokeTest {
    @Test void catalogMatchesExerciseFilesAndTests() throws Exception {
        String catalog = Files.readString(Path.of("catalog.json"));
        var entries = Pattern.compile("\"file\": \"([^\"]+)\",\\s*\"test\": \"([^\"]+)\"").matcher(catalog);
        Set<String> indexed = new HashSet<>();
        while (entries.find()) {
            String source = entries.group(1);
            assertTrue(indexed.add(source), "Duplicate catalog path: " + source);
            assertTrue(Files.isRegularFile(Path.of(source)), source);
            assertTrue(Files.isRegularFile(Path.of(entries.group(2))), entries.group(2));
            assertTrue(Files.readString(Path.of(source)).contains("Run: ./mvnw"), "Missing exercise brief: " + source);
        }
        Set<String> actual = new HashSet<>();
        for (String track : List.of("dsa", "backend", "streams")) {
            try (var paths = Files.walk(Path.of("src/main/java/dev/practice", track))) {
                paths.filter(p -> p.toString().endsWith(".java"))
                     .filter(p -> !p.getFileName().toString().equals("Employee.java"))
                     .map(p -> p.toString().replace('\\', '/')).forEach(actual::add);
            }
        }
        assertFalse(indexed.isEmpty());
        assertEquals(actual, indexed);
    }
}
