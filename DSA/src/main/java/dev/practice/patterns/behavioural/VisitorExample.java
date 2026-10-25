package dev.practice.patterns.behavioural;

/*
 * VISITOR — add operations over a stable set of element types using double dispatch.
 * Stock/Bond accept a Visitor; LabelVisitor supplies type-specific operations.
 * Useful when element types are stable but reporting operations change often.
 * Tradeoff: adding an element type changes every visitor. Pattern matching may be simpler.
 * Try: add a RiskVisitor without adding risk methods to Stock or Bond.
 */
public class VisitorExample {

  public static void main(String[] args) {
    Visitor labels = new LabelVisitor();
    System.out.println(new Stock("ACME").accept(labels));
    System.out.println(new Bond("Treasury").accept(labels));
  }

  interface Instrument {

    String accept(Visitor visitor);
  }

  interface Visitor {

    String visit(Stock stock);

    String visit(Bond bond);
  }

  record Stock(String symbol) implements Instrument {

    public String accept(Visitor visitor) {
      return visitor.visit(this);
    }
  }

  record Bond(String issuer) implements Instrument {

    public String accept(Visitor visitor) {
      return visitor.visit(this);
    }
  }

  static class LabelVisitor implements Visitor {

    public String visit(Stock stock) {
      return "stock:" + stock.symbol();
    }

    public String visit(Bond bond) {
      return "bond:" + bond.issuer();
    }
  }
  // Output: stock:ACME then bond:Treasury on separate lines
}
