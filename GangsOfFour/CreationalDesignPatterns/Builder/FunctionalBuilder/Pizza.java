package GangsOfFour.CreationalDesignPatterns.Builder.FunctionalBuilder;
public class Pizza {
    private final String size;
    private final boolean hasCheese;
    private final boolean hasPepperoni;
    private final boolean hasMushrooms;

    // Private constructor (same as before)
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