package GangsOfFour.StructuralDesignPatterns.Proxy.LazyLoadingExample;

public class Main {
    public static void main(String[] args) {
        Image proxyImage = new ProxyImage("Archit Image") ; 
        
        proxyImage.display();
    }
    
}
