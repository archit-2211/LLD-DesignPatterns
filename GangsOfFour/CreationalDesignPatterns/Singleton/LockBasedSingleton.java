package GangsOfFour.CreationalDesignPatterns.Singleton;

public class LockBasedSingleton {
    private static volatile LockBasedSingleton object ; 
    private String name ; 

    private LockBasedSingleton() {

    }

    public static LockBasedSingleton getObject() {

        if (object == null){
            synchronized(LockBasedSingleton.class) {
                if (object == null) {
                    object = new LockBasedSingleton();

                }
            }
        }

        return object;
        
    }
    public void setName (String name) {
        this.name = name; 
        System.out.println(this.name);
    }
     
}


/*
 * This strategy is known as double check locking. We have placed lock on entire class object. 
 * In other terms only one thread can execute the code of object creation of this class
 */