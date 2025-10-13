package GangsOfFour.CreationalDesignPatterns.Builder.FunctionalBuilder;

/*
The Functional Builder Pattern is a variation of the traditional Builder Pattern that leverages lambda expressions and functional interfaces (like Consumer) to configure the object being built. It aims to make the building process more concise, readable, and immutable, particularly in languages like Java (8+) or Kotlin that support functional programming features.

Functional Builder Pattern Explained
Core Concept

The traditional Builder Pattern involves a separate, nested builder class with setter methods that return the builder itself, allowing for method chaining. The Functional Builder streamlines this by using a lambda function (often a Consumer) to handle the configuration steps.

Instead of calling methods like builder.setName("Alice").setAge(30), you pass a single function to the builder's main method. This function receives the object-under-construction (or the internal builder object) and applies the configurations to it.
 */
public class Main {
    public static void main(String[] args) {
        // Example 1: Full pizza
        Pizza supremePizza = PizzaBuilder.build(b -> {
            b.size("Large");
            b.cheese(true);
            b.pepperoni(true);
            b.mushrooms(true);
        });
        
        System.out.println("Supreme Pizza: " + supremePizza);
        // Output: Pizza [Size=Large, Cheese=true, Pepperoni=true, Mushrooms=true]

        // Example 2: Concise usage for a simple pizza
        Pizza simplePizza = PizzaBuilder.build(
            b -> b.size("Medium").cheese(true) // Only size and cheese are set
        );

        System.out.println("Simple Pizza: " + simplePizza);
        // Output: Pizza [Size=Medium, Cheese=true, Pepperoni=false, Mushrooms=false]
    }
}