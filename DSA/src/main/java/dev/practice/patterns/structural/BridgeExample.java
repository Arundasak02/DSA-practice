package dev.practice.patterns.structural;

/*
 * BRIDGE — separate two dimensions that should evolve independently.
 * Alert is the abstraction; Channel is the implementation. UrgentAlert works with any Channel.
 * Unlike Adapter, both sides are designed to cooperate from the start.
 * Tradeoff: extra indirection; useful when both alert types and transports vary.
 * Try: add a DigestAlert and SmsChannel without a class for every combination.
 */
public class BridgeExample {

  public static void main(String[] args) {
    System.out.println(new UrgentAlert(new EmailChannel()).deliver("limit"));
  }

  interface Channel {

    String send(String text);
  }

  static class EmailChannel implements Channel {

    public String send(String text) {
      return "email:" + text;
    }
  }

  static abstract class Alert {

    protected final Channel channel;

    Alert(Channel channel) {
      this.channel = channel;
    }

    abstract String deliver(String text);
  }

  static class UrgentAlert extends Alert {

    UrgentAlert(Channel channel) {
      super(channel);
    }

    String deliver(String text) {
      return channel.send("URGENT " + text);
    }
  }
  // Output: email:URGENT limit
}
