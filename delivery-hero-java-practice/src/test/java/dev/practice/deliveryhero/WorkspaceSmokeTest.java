package dev.practice.deliveryhero;

import java.nio.file.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WorkspaceSmokeTest {
    @Test void javaAndJunitWork() {
        assertTrue(Runtime.version().feature() >= 17);
        assertEquals(4, Math.addExact(2,2));
    }
    @Test void sqlFixtureWorks() throws Exception {
        try(var db=new dev.practice.deliveryhero.support.SqlFixture("CREATE TABLE check_data(id INT)")) {
            db.execute("INSERT INTO check_data VALUES (7)");
            assertEquals(java.util.List.of("7"),db.rows("SELECT id FROM check_data"));
        }
    }
    @Test void everyExerciseHasBriefAndTest() throws Exception {
        Path root=Path.of("src/main/java/dev/practice/deliveryhero");
        try(var paths=Files.walk(root)) {
            var files=paths.filter(p->p.toString().endsWith(".java")).toList();
            assertEquals(40,files.size());
            for(var source:files) {
                assertFalse(Files.exists(source.resolveSibling("README.md")),source.toString());
                String code=Files.readString(source);
                assertTrue(code.contains("Evidence:") && code.contains("Run: ./mvnw"),source.toString());
                Path relative=Path.of("src/main/java").relativize(source);
                Path test=Path.of("src/test/java").resolve(relative);
                test=test.resolveSibling(test.getFileName().toString().replace(".java","Test.java"));
                assertTrue(Files.exists(test),test.toString());
            }
        }
    }
}
