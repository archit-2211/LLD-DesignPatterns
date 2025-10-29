package GangsOfFour.StructuralDesignPatterns.Decorator.RequestHandler;

public class BasicRequestHandler implements RequestHandler {

    @Override
    public String handleRequest(String request) {
        return "Handling the Request using Basic Request Handler" + request ; 
    } 
    
    
}
