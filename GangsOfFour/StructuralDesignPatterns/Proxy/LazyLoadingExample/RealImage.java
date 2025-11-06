package GangsOfFour.StructuralDesignPatterns.Proxy.LazyLoadingExample;

public class RealImage implements Image {
    private String imageName ; 


    protected RealImage(String imageName) {
        this.imageName = imageName ; 
    }

    @Override
    public void display() {
        System.out.println("Displaying the image" + imageName) ; 
    }

    
}
