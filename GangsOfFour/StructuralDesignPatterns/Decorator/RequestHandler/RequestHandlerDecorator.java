package GangsOfFour.StructuralDesignPatterns.Decorator.RequestHandler;


/*
 * 
 * Here using a parameterized constructor we are making sure that, this request handler cannot handle request on its own, its need certain pre processing like only the request that have been handled earlier by other
 * handlers can be handled using decorators. 
 */
public abstract class RequestHandlerDecorator implements RequestHandler {
    protected RequestHandler requestHandler ; 

    public RequestHandlerDecorator(RequestHandler requestHandler) {
        this.requestHandler = requestHandler ; 
    }

    
}
