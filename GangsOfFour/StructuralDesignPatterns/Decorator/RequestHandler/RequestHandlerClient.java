package GangsOfFour.StructuralDesignPatterns.Decorator.RequestHandler;

public class RequestHandlerClient {
    public static void main(String[] args) {
        RequestHandler handler = new BasicRequestHandler();

        // Enable runtime decorators
        boolean enableLogging = true;
        boolean enableAuth = true;

        if (enableAuth) {
            handler = new AuthRequestHandler(handler);
        }

        if (enableLogging) {
            handler = new LoggingRequestHandler(handler);
        }

        System.out.println("\n--- Request 1 (Valid) ---");
        System.out.println(handler.handleRequest("getUser?token=abc123"));

        System.out.println("\n--- Request 2 (Invalid) ---");
        System.out.println(handler.handleRequest("getUser"));
    }
}
