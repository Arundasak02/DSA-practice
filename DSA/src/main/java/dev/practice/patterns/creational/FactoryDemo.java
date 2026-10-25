package dev.practice.patterns.creational;

public class FactoryDemo {

  public static void main(String[] args) {
    // The selected factory supplies a compatible channel and formatter.
    NotificationFactory smsFactory = new SmsFactory();
    Channel smsChannel = smsFactory.createChannel();
    MessageFormatter smsFormatter = smsFactory.createFormatter();
    smsChannel.send(smsFormatter.format("Order accepted"));
  }

  interface Channel {

    void send(String message);
  }

  // Each factory produces related products for one delivery channel.
  interface NotificationFactory {

    Channel createChannel();

    MessageFormatter createFormatter();
  }

  interface MessageFormatter {

    String format(String message);
  }

  static class Email implements Channel {

    public void send(String message) {
      System.out.println("EMAIL:" + message);
    }
  }

  static class SMS implements Channel {

    public void send(String message) {
      System.out.println("SMS:" + message);
    }
  }

  static class EmailFactory implements NotificationFactory {

    @Override
    public Channel createChannel() {
      return new Email();
    }

    @Override
    public MessageFormatter createFormatter() {
      return new EmailFormatter();
    }
  }

  static class SmsFactory implements NotificationFactory {

    @Override
    public Channel createChannel() {
      return new SMS();
    }

    @Override
    public MessageFormatter createFormatter() {
      return new SmsFormatter();
    }
  }

  static class EmailFormatter implements MessageFormatter {

    @Override
    public String format(String message) {
      return "Email formatted: " + message;
    }
  }

  static class SmsFormatter implements MessageFormatter {

    @Override
    public String format(String message) {
      return "SMS formatted: " + message;
    }
  }
}
