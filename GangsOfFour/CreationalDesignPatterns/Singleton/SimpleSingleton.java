package GangsOfFour.CreationalDesignPatterns.Singleton;

public class SimpleSingleton {
    private static SimpleSingleton object ; 
    private String name;
    private SimpleSingleton() {

    }

    public static SimpleSingleton getObject() {
        if (object == null) {
            object = new SimpleSingleton() ;
            

        }

        return object ; 

    }

    public void setName(String name) {
        this.name = name ; 
        System.out.println(this.name);
    }
    
}

/*
 *  Any object can be initialised in two ways, lazy initialization and eager initial;ization.
 * 
 * Lazy Initialization : In this initialiation method, we explicitly create object only when required
    in our program. 
    Generally all the objects we create in main class manually are examples of lazy intialization. 

*   Eager Initialization : In this initialization method, the object get created in the start-up time itself, 
    We don't need to write an explicit code for the object creation . 
    Example : In spring boot untill and unless the component or bean is marked to be lazyInitialization
    The spring boot creates the beans on the application startup and stores in the application context 
    This increases the system startup time. 


Simple Singleton Example stated above is an example of lazy initialization.
we explicitly create the object by calling the static method in our main execution function. 

One more thing is that this is not thread safe. 
When we are working in multi threaded environment, when multiple threads try to call the method
at same instance when the object is not created then this creates multiple objects which is not 
thread safe. 

To avoid this we can do 2 things, 
1. Is to implement mutex lock on the critical section of the code i.e the method creation code in the static block 
2. Eager initilization and making the object as final. 
 */