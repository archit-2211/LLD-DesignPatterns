package GangsOfFour.CreationalDesignPatterns.Builder.FunctionalBuilder; 
import java.util.function.Consumer;
public class PizzaBuilder {
    // Internal state (not final, as it's mutable during configuration)
    private String size = "Small"; // Default size
    private boolean hasCheese = false;
    private boolean hasPepperoni = false;
    private boolean hasMushrooms = false;

    // Configuration methods (return 'this' for chaining within the lambda)
    public PizzaBuilder size(String size) {
        this.size = size;
        return this;
    }
    
    public PizzaBuilder cheese(boolean value) {
        this.hasCheese = value;
        return this;
    }

    public PizzaBuilder pepperoni(boolean value) {
        this.hasPepperoni = value;
        return this;
    }

    public PizzaBuilder mushrooms(boolean value) {
        this.hasMushrooms = value;
        return this;
    }
    
    // The key component: The static method accepting a Consumer
    public static Pizza build(Consumer<PizzaBuilder> configurator) {
        PizzaBuilder builder = new PizzaBuilder(); // 1. Create a new builder
        configurator.accept(builder);              // 2. Execute the configuration lambda
        return builder.internalBuild();             // 3. Finalize and return the product
    }

    // Private method to finalize construction
    private Pizza internalBuild() {
        return new Pizza(this.size, this.hasCheese, this.hasPepperoni, this.hasMushrooms);
    }
}