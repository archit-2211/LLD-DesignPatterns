package PenLLD; 


abstract class Pen {
    protected String name;
    protected String brand;
    protected double price;

    protected Ink ink;
    protected OnEmptyBehavior onEmptyBehavior;

    Pen(String name, String brand, double price, Ink ink, OnEmptyBehavior onEmptyBehavior) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.ink = ink;
        this.onEmptyBehavior = onEmptyBehavior;
    }

    public void write(String text) {
        ink.write(text);
    }

    public void onEmpty() {
        onEmptyBehavior.handleEmpty();
    }

    public void setOnEmptyBehavior(OnEmptyBehavior newBehavior) {
        this.onEmptyBehavior = newBehavior;
    }

    public void setInk(Ink newInk) {
        this.ink = newInk;
    }
}
