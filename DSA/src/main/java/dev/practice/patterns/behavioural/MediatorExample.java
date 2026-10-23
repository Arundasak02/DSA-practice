package dev.practice.patterns.behavioural;

import java.util.*;

/*
 * MEDIATOR — centralize coordination between colleagues so they do not call each other.
 * Form mediates between TextField and Button when text changes.
 * Unlike Observer broadcast, the mediator owns the coordination rule.
 * Tradeoff: a mediator can become too large; keep it scoped to one interaction.
 * Try: add a checkbox that also influences button availability.
 */
public class MediatorExample {
    static class Button { boolean enabled; }
    static class TextField {
        private final Form mediator;
        TextField(Form mediator) { this.mediator = mediator; }
        void input(String text) { mediator.changed(text); }
    }
    static class Form {
        final Button submit = new Button();
        final TextField field = new TextField(this);
        void changed(String text) { submit.enabled = !text.isBlank(); }
    }
    public static void main(String[] args) {
        Form form = new Form();
        form.field.input("ACME");
        System.out.println(form.submit.enabled);
    }
    // Output: true
}
