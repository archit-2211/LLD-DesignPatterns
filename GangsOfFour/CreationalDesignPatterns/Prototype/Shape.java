package GangsOfFour.CreationalDesignPatterns.Prototype;
public class Shape implements Prototype {
    private String type;
    private int x;
    private int y;

    public Shape(String type, int x, int y) {
        this.type = type;
        this.x = x;
        this.y = y;
    }

    // Copy constructor for cloning
    public Shape(Shape other) {
        this.type = other.type;
        this.x = other.x;
        this.y = other.y;
    }

    @Override
    public Shape clone() {
        return new Shape(this); // uses copy constructor internally
    }

    @Override
    public String toString() {
        return type + " at (" + x + ", " + y + ")";
    }
}
