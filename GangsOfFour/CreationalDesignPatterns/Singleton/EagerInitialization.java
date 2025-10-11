package GangsOfFour.CreationalDesignPatterns.Singleton;

public class EagerInitialization {
    private static  final EagerInitialization object = new EagerInitialization(); 
    private String name; 

    private EagerInitialization() {

    }

    public static EagerInitialization getObject() {
        return object ; 
    }

    public void setName(String name) {
        this.name = name ; 
        System.out.println(this.name) ; 
        
    }


    
}
