package PenLLD;

class SingleInk implements Ink {
    private String color;

    SingleInk(String color) {
        this.color = color;
    }

    public void write(String text) {
        System.out.println("Writing '" + text + "' in color: " + color);
    }
}