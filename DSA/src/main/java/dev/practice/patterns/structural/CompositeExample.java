package dev.practice.patterns.structural;

import java.util.List;

/*
 * COMPOSITE — treat a leaf and a group through the same interface.
 * Asset is the component; Position is a leaf; Portfolio is a composite containing Assets.
 * Assume an acyclic tree, nonnegative small amounts in cents; shared leaves count per occurrence.
 * Tradeoff: some operations make sense only for groups; avoid forcing them onto every leaf.
 * Try: nest another Portfolio without changing totalCents in client code.
 */
public class CompositeExample {

  public static void main(String[] args) {
    Asset group = new Portfolio(
        List.of(new Position(100), new Portfolio(List.of(new Position(250)))));
    System.out.println(group.totalCents());
  }

  interface Asset {

    long totalCents();
  }

  record Position(long totalCents) implements Asset {

  }

  record Portfolio(List<Asset> children) implements Asset {

    Portfolio {
      children = List.copyOf(children);
    }

    public long totalCents() {
      return children.stream().mapToLong(Asset::totalCents).sum();
    }
  }
  // Output: 350
}
