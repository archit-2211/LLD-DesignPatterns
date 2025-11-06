package GangsOfFour.StructuralDesignPatterns.Proxy.LazyLoadingExample;

public class ProxyImage implements Image {

    private RealImage realImage ; 
    private String imageName ; 
    
    public ProxyImage (String name) {
        this.imageName = name ; 


    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(this.imageName) ; 
        }
        realImage.display(); 
    }
    
    
}
