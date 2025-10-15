package GangsOfFour.CreationalDesignPatterns.Builder.FunctionalBuilder;
public class Pizza {
    private final String size;
    private final boolean hasCheese;
    private final boolean hasPepperoni;
    private final boolean hasMushrooms;

    // Default constructor (Cannot be accessed out side of this package// If we truly want to make sure main doesnt access this directeluy, both Pizza and PizzabUILDER SHOULD be in one package and main should 
    //be outside of the package
    Pizza(String size, boolean hasCheese, boolean hasPepperoni, boolean hasMushrooms) {
        this.size = size;
        this.hasCheese = hasCheese;
        this.hasPepperoni = hasPepperoni;
        this.hasMushrooms = hasMushrooms;
    }

    public String toString() {
        return "Size : " + this.size + "has Cheese " + this.hasCheese + " has Pepperoni " + this.hasPepperoni + " has Mushrooms " + this.hasMushrooms ;
    }
    
    
}