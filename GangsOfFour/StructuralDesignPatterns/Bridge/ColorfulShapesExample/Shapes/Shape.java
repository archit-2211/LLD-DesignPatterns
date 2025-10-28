package GangsOfFour.StructuralDesignPatterns.Bridge.ColorfulShapesExample.Shapes;

import GangsOfFour.StructuralDesignPatterns.Bridge.ColorfulShapesExample.Colors.Color;


/*
 * 
 * In our requirements it was mandatory that we need to have a color for every shape object so we have taken abstract class to take shape color as an attribute. If we didnt have any attribute we would have chosen the interface
 */
public abstract class Shape {
    protected Color shapeColor ; 

    public Shape(Color shapeColor) {
        this.shapeColor = shapeColor ; 
    }


    public abstract void drawShape() ;
    
}
