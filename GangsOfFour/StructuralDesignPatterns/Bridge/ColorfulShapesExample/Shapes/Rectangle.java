package GangsOfFour.StructuralDesignPatterns.Bridge.ColorfulShapesExample.Shapes;

import GangsOfFour.StructuralDesignPatterns.Bridge.ColorfulShapesExample.Colors.Color;

public class Rectangle extends Shape{

    public Rectangle(Color shapeColor) {
        super(shapeColor);
       
    }

    @Override
    public void drawShape() {
        this.shapeColor.applyColor(); 
        System.out.println("Drawing Rectangle");
    }
    
}
