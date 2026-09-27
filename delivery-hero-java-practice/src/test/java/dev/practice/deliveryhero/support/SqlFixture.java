package dev.practice.deliveryhero.support;

import java.sql.*;
import java.util.*;

/** Database setup and result formatting only; contains no exercise solutions. */
public final class SqlFixture implements AutoCloseable {
    public static final String[] SALARY_SCHEMA = {
        "CREATE TABLE departments(id INT PRIMARY KEY, name VARCHAR(100))",
        "CREATE TABLE employees(id INT PRIMARY KEY, department_id INT REFERENCES departments(id), salary BIGINT)"
    };
    public static final String[] ORDER_SCHEMA = {
        "CREATE TABLE customers(id INT PRIMARY KEY, name VARCHAR(100))",
        "CREATE TABLE orders(id INT PRIMARY KEY, customer_id INT REFERENCES customers(id), total_cents BIGINT)"
    };
    private final Connection connection;
    public SqlFixture(String... schema) throws SQLException {
        connection=DriverManager.getConnection("jdbc:h2:mem:"+UUID.randomUUID());
        execute(schema);
    }
    public void execute(String... statements) throws SQLException {
        try(Statement s=connection.createStatement()) {
            for(String sql:statements) s.execute(sql);
        }
    }
    public List<String> rows(String query) throws SQLException {
        List<String> rows=new ArrayList<>();
        try(Statement s=connection.createStatement()) {
            s.setQueryTimeout(2);
            try(ResultSet r=s.executeQuery(query)) {
                int n=r.getMetaData().getColumnCount();
                while(r.next()) {
                    StringJoiner row=new StringJoiner("|");
                    for(int i=1;i<=n;i++) {
                        Object value=r.getObject(i);
                        row.add(value==null?"NULL":value.toString());
                    }
                    rows.add(row.toString());
                }
            }
        }
        return rows;
    }
    @Override public void close() throws SQLException { connection.close(); }
}
