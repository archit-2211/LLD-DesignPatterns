package GangsOfFour.CreationalDesignPatterns.Factory.ShapeExample;

public class ShapeFactory {
    public static Shape getShape(String name) {
        if (name.equals("Triangle")) {
            return new Triangle(); 
        }
        else if (name.equals("Rectangle")) {
            return new Rectangle(); 
        }
        else if (name.equals("Circle")) { 
            return new Circle() ; 
        }
        throw new RuntimeException("Invalid shape chosen");
    }
}
