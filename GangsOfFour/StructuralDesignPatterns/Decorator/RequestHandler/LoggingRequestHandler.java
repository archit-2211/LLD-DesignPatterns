package GangsOfFour.StructuralDesignPatterns.Decorator.RequestHandler;

public class LoggingRequestHandler extends RequestHandlerDecorator {

    public LoggingRequestHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public String handleRequest(String request) {
        System.out.println("[LOG] Received request: " + request);
        String output = requestHandler.handleRequest(request);
        System.out.println("[LOG] Completed request processing.");
        return output + " | [Logged]";
    }
}
