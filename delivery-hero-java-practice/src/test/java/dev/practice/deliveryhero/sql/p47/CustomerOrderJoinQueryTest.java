package dev.practice.deliveryhero.sql.p47;

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
class CustomerOrderJoinQueryTest {
    private final CustomerOrderJoinQuery sut = new CustomerOrderJoinQuery();
    @Test
    void oneOrder() throws Exception {
        try(var db=new dev.practice.deliveryhero.support.SqlFixture(dev.practice.deliveryhero.support.SqlFixture.ORDER_SCHEMA)) {
         db.execute("INSERT INTO customers VALUES (1,'Arun')", "INSERT INTO orders VALUES (7,1,500)");
         assertEquals(List.of("1|Arun|7|500"),db.rows(sut.query()));
        }
    }

    @Test
    void customerWithoutOrders() throws Exception {
        try(var db=new dev.practice.deliveryhero.support.SqlFixture(dev.practice.deliveryhero.support.SqlFixture.ORDER_SCHEMA)) {
         db.execute("INSERT INTO customers VALUES (1,'Arun')");assertEquals(List.of("1|Arun|NULL|NULL"),db.rows(sut.query()));
        }
    }

    @Test
    void manyOrders() throws Exception {
        try(var db=new dev.practice.deliveryhero.support.SqlFixture(dev.practice.deliveryhero.support.SqlFixture.ORDER_SCHEMA)) {
         db.execute("INSERT INTO customers VALUES (1,'Arun')", "INSERT INTO orders VALUES (9,1,0),(3,1,600)");
         assertEquals(List.of("1|Arun|3|600","1|Arun|9|0"),db.rows(sut.query()));
        }
    }

    @Test
    void sameNames() throws Exception {
        try(var db=new dev.practice.deliveryhero.support.SqlFixture(dev.practice.deliveryhero.support.SqlFixture.ORDER_SCHEMA)) {
         db.execute("INSERT INTO customers VALUES (2,'A'),(1,'A')", "INSERT INTO orders VALUES (7,2,4000000000)");
         assertEquals(List.of("1|A|NULL|NULL","2|A|7|4000000000"),db.rows(sut.query()));
        }
    }

    @Test
    void empty() throws Exception {
        try(var db=new dev.practice.deliveryhero.support.SqlFixture(dev.practice.deliveryhero.support.SqlFixture.ORDER_SCHEMA)) {
         assertEquals(List.of(),db.rows(sut.query()));
        }
    }
}
