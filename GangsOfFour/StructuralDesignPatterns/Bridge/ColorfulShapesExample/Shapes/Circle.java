package GangsOfFour.StructuralDesignPatterns.Bridge.ColorfulShapesExample.Shapes;

import GangsOfFour.StructuralDesignPatterns.Bridge.ColorfulShapesExample.Colors.Color;

public class Circle extends Shape {

    public Circle(Color shapeColor) {
        super(shapeColor);
        
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing the shape Circle") ; 
    }
    
}
