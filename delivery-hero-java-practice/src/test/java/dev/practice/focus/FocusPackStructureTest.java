package dev.practice.focus;

import java.nio.file.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FocusPackStructureTest {
    @Test void allFocusExercisesHaveInFileBriefsAndTests() throws Exception {
        Path main=Path.of("src/main/java");
        try(var paths=Files.walk(main.resolve("dev/practice/focus"))) {
            var exercises=paths.filter(p->p.getFileName().toString().matches("(?:SM|JS)\\d{2}.*\\.java")).toList();
            assertEquals(20,exercises.size());
            for(Path source:exercises) {
                String text=Files.readString(source);
                assertTrue(text.contains("Evidence:") && text.contains("Java Streams:"),source.toString());
                Path test=Path.of("src/test/java").resolve(main.relativize(source));
                test=test.resolveSibling(test.getFileName().toString().replace(".java","Test.java"));
                assertTrue(Files.exists(test),test.toString());
            }
        }
    }
}
