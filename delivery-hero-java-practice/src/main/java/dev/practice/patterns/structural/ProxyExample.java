package dev.practice.patterns.structural;

/*
 * PROXY — stand in for another object and control access to it.
 * Example: an access proxy checks permission before loading a report.
 * Report is the shared interface; StoredReport is the real subject; AccessProxy is the proxy.
 * Client code calls the same interface regardless of which implementation it receives.
 * Why: keep access policy separate from report-loading logic.
 * This fixed boolean is a demo, NOT production authentication. A real service must use a trusted
 * authorization context and prevent callers from bypassing the proxy.
 * Try: make a lazy proxy that constructs StoredReport only on the first authorized request.
 */
public class ProxyExample {
    interface Report {
        String read();
    }

    static class StoredReport implements Report {
        public String read() {
            System.out.println("Loading report");
            return "Daily order summary";
        }
    }

    static class AccessProxy implements Report {
        private final Report target;
        private final boolean allowed;

        AccessProxy(Report target, boolean allowed) {
            this.target = target;
            this.allowed = allowed;
        }

        public String read() {
            if (!allowed) { throw new SecurityException("Access denied"); }
            return target.read();
        }
    }

    public static void main(String[] args) {
        Report stored = new StoredReport();
        try {
            new AccessProxy(stored, false).read();
        } catch (SecurityException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println(new AccessProxy(stored, true).read());
    }
    // Output: Access denied / Loading report / Daily order summary
}
