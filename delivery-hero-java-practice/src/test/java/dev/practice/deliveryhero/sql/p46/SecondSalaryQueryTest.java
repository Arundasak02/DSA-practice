package dev.practice.deliveryhero.sql.p46;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("sql")
@Timeout(10)
class SecondSalaryQueryTest {
    private final SecondSalaryQuery sut = new SecondSalaryQuery();
    @Test
    void normal() throws Exception {
        try(var db=new dev.practice.deliveryhero.support.SqlFixture(dev.practice.deliveryhero.support.SqlFixture.SALARY_SCHEMA)) {
         db.execute("INSERT INTO departments VALUES (1,'A'),(2,'B')", "INSERT INTO employees VALUES (1,1,100),(2,1,90),(3,2,50),(4,2,40)");
         assertEquals(List.of("1|90","2|40"),db.rows(sut.query()));
        }
    }

    @Test
    void distinctTies() throws Exception {
        try(var db=new dev.practice.deliveryhero.support.SqlFixture(dev.practice.deliveryhero.support.SqlFixture.SALARY_SCHEMA)) {
         db.execute("INSERT INTO departments VALUES (1,'A')", "INSERT INTO employees VALUES (1,1,100),(2,1,100),(3,1,80)");
         assertEquals(List.of("1|80"),db.rows(sut.query()));
        }
    }

    @Test
    void missingSecond() throws Exception {
        try(var db=new dev.practice.deliveryhero.support.SqlFixture(dev.practice.deliveryhero.support.SqlFixture.SALARY_SCHEMA)) {
         db.execute("INSERT INTO departments VALUES (1,'A'),(2,'B')", "INSERT INTO employees VALUES (1,1,100),(2,1,100)");
         assertEquals(List.of("1|NULL","2|NULL"),db.rows(sut.query()));
        }
    }

    @Test
    void nullAndLargeSalaries() throws Exception {
        try(var db=new dev.practice.deliveryhero.support.SqlFixture(dev.practice.deliveryhero.support.SqlFixture.SALARY_SCHEMA)) {
         db.execute("INSERT INTO departments VALUES (1,'A')", "INSERT INTO employees VALUES (1,1,NULL),(2,1,5000000000),(3,1,4000000000)");
         assertEquals(List.of("1|4000000000"),db.rows(sut.query()));
        }
    }

    @Test
    void noDepartments() throws Exception {
        try(var db=new dev.practice.deliveryhero.support.SqlFixture(dev.practice.deliveryhero.support.SqlFixture.SALARY_SCHEMA)) {
         assertEquals(List.of(),db.rows(sut.query()));
        }
    }
}
