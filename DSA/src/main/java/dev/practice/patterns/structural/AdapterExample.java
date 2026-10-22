package dev.practice.patterns.structural;

/*
 * ADAPTER — translate an existing API into the interface your application needs.
 * Example: our app expects Notifier.send(message), but a legacy SMS client needs a phone too.
 * Notifier is the target interface; LegacySmsClient is the adaptee; SmsAdapter bridges them.
 * Why: app code stays independent of the legacy method signature.
 * Unlike Decorator, an Adapter reconciles different interfaces.
 * Try: adapt a second provider with a different send method to Notifier.
 */
public class AdapterExample {
    interface Notifier {
        void send(String message);
    }

    static class LegacySmsClient {
        void sendText(String phone, String text) {
            System.out.println("SMS to " + phone + ": " + text);
        }
    }

    static class SmsAdapter implements Notifier {
        private final LegacySmsClient client;
        private final String phone;

        SmsAdapter(LegacySmsClient client, String phone) {
            this.client = client;
            this.phone = phone;
        }

        public void send(String message) {
            client.sendText(phone, message);
        }
    }

    public static void main(String[] args) {
        Notifier notifier = new SmsAdapter(new LegacySmsClient(), "demo-number");
        notifier.send("Order accepted");
    }
    // Output: SMS to demo-number: Order accepted
}
