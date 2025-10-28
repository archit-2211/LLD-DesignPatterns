package GangsOfFour.StructuralDesignPatterns.Bridge.ColorfulShapesExample;

import GangsOfFour.StructuralDesignPatterns.Bridge.ColorfulShapesExample.Colors.BlueColor;
import GangsOfFour.StructuralDesignPatterns.Bridge.ColorfulShapesExample.Colors.RedColor;
import GangsOfFour.StructuralDesignPatterns.Bridge.ColorfulShapesExample.Shapes.*;

public class Main {
    public static void main(String[] args) {
         Shape redSquare = new Square(new RedColor());
        redSquare.drawShape();

        Shape blueCircle = new Circle(new BlueColor());
        blueCircle.drawShape();
    }
    
}
