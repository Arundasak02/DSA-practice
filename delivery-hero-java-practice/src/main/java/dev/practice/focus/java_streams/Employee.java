package dev.practice.focus.java_streams;

/** Shared immutable input for JS05-JS09. Strings are non-null; salaries >=0, versions >0. */
public record Employee(String id, String name, String department, long salaryCents, int version) {}
