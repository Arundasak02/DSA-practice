package dev.practice.patterns.behavioural;

import java.util.Map;

/*
 * INTERPRETER — represent a small grammar as objects that evaluate expressions.
 * Expression is the grammar rule; Literal/Variable are terminals; Add is a nonterminal.
 * Context maps variable names to values. This example builds the syntax tree directly;
 * parsing strings is a separate concern. Arithmetic overflow throws ArithmeticException.
 * Tradeoff: a class per grammar rule becomes unwieldy for a large language; use a parser then.
 * Try: add Multiply without changing Literal or Variable.
 */
public class InterpreterExample {
    interface Expression { long evaluate(Map<String, Long> context); }

    record Literal(long value) implements Expression {
        public long evaluate(Map<String, Long> context) { return value; }
    }

    record Variable(String name) implements Expression {
        public long evaluate(Map<String, Long> context) {
            Long value = context.get(name);
            if (value == null) throw new IllegalArgumentException("Unknown variable: " + name);
            return value;
        }
    }

    record Add(Expression left, Expression right) implements Expression {
        public long evaluate(Map<String, Long> context) {
            return Math.addExact(left.evaluate(context), right.evaluate(context));
        }
    }

    public static void main(String[] args) {
        Expression expression = new Add(new Variable("price"), new Literal(5));
        System.out.println(expression.evaluate(Map.of("price", 100L)));
    }
    // Output: 105
}
