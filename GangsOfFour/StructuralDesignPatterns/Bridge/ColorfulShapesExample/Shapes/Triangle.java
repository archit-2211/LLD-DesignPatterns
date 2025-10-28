package GangsOfFour.StructuralDesignPatterns.Bridge.ColorfulShapesExample.Shapes;

import GangsOfFour.StructuralDesignPatterns.Bridge.ColorfulShapesExample.Colors.Color;

public class Triangle extends Shape {

    public Triangle(Color shapeColor) {
        super(shapeColor);
 
    }

    @Override
    public void drawShape() {
        this.shapeColor.applyColor() ; 
        System.out.println("Drawing Triangtle") ; 
    }
    
}
