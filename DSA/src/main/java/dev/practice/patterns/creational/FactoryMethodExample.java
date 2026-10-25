package dev.practice.patterns.creational;

/*
 * FACTORY METHOD — let a subclass decide which implementation to create.
 * Example: a sender has a common send workflow, but its subclass creates the channel.
 * Channel is the product; Email/Sms are concrete products; Sender is the creator.
 * createChannel() is the factory method, overridden by EmailSender and SmsSender.
 * Why: the common workflow depends on Channel rather than concrete delivery types.
 * A static create(type) with a switch is a SIMPLE FACTORY, a related but different idiom.
 * If creation is trivial, directly constructing/injecting Channel is often simpler.
 * Try: add PushSender and Push without changing Sender.send().
 */
public class FactoryMethodExample {

  public static void main(String[] args) {
    Sender emailSender = new EmailSender();
    Sender smsSender = new SmsSender();

    emailSender.send("Order accepted");
    smsSender.send("Order accepted");
  }

  interface Channel {

    void deliver(String message);
  }

  static class Email implements Channel {

    public void deliver(String message) {
      System.out.println("Email: " + message);
    }
  }

  static class Sms implements Channel {

    public void deliver(String message) {
      System.out.println("SMS: " + message);
    }
  }

  abstract static class Sender {

    protected abstract Channel createChannel();

    public void send(String message) {
      Channel channel = createChannel();
      channel.deliver(message);
    }
  }

  static class EmailSender extends Sender {

    @Override
    protected Channel createChannel() {
      return new Email();
    }
  }

  static class SmsSender extends Sender {

    @Override
    protected Channel createChannel() {
      return new Sms();
    }
  }

  // Output: Email: Order accepted / SMS: Order accepted
}
