package PenLLD;
class MultiInk implements Ink {
    private String currentColor;

    public void changeColor(String color) {
        this.currentColor = color;
    }

    public void write(String text) {
        System.out.println("Writing '" + text + "' in color: " + currentColor);
    }
}