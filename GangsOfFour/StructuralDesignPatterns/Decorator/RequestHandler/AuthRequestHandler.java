package GangsOfFour.StructuralDesignPatterns.Decorator.RequestHandler;

public class AuthRequestHandler extends RequestHandlerDecorator {

    public AuthRequestHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public String handleRequest(String request) {
        // Add authentication logic before delegating
        if (!isAuthenticated(request)) {
            System.out.println("[AUTH] Authentication failed for request: " + request);
            return "401 Unauthorized - Access Denied";
        }

        System.out.println("[AUTH] Authentication successful for request: " + request);

        // Delegate to the wrapped handler
        String response = requestHandler.handleRequest(request);

        // Optionally add post-processing behavior
        return response + " | Handled via AuthRequestHandler";
    }

    // A simple authentication check simulation
    private boolean isAuthenticated(String request) {
        // Here you could check a token, API key, session, etc.
        return request != null && request.contains("token");
    }
}
