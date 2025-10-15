package GangsOfFour.CreationalDesignPatterns.Prototype;

public class Main {

    public static void main(String[] args) {
          Shape rectangle = new Shape("Rectangle", 010, 5) ; 
    Shape square = new Shape("Square", 10,10) ; 

    PrototypeRegistry shapePrototypeRegistry = new PrototypeRegistry() ; 
    shapePrototypeRegistry.register("Rectangle" , rectangle);
    shapePrototypeRegistry.register("Square", square);
    
        
    }

  
}
