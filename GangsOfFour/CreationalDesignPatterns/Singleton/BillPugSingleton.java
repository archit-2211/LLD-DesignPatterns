package GangsOfFour.CreationalDesignPatterns.Singleton;


/*
 * One line summary : Bill Pugh Singleton works because a static inner class is not loaded until it’s referenced.
That deferred loading lets the JVM handle lazy, thread-safe object creation without explicit synchronization.
 */
public class BillPugSingleton {

    private BillPugSingleton() {} 

    private static class HelperClass {
        private static final BillPugSingleton object = new BillPugSingleton() ; 
    }

    public static BillPugSingleton getObject() {
        return HelperClass.object ; 
    }





    
}


/*
 * This approach leverages the technique of how JVM works 
 * 
 * A few pre-requisites before we get started 
 * Inner class : class definition provided inside a class is known as Inner class 
    Example : 
            class Outer {

                public Outer() {}

                class Inner {

                    public Inner(){}
                }
            
                
            
            
            }

    Now as you can see, we have an outer class and an inner class. When ever we start the execution
    of our code; the JVM creates byte code of the outer classes and it known there is inner class exists

    but it doesnt execute the code written inside inner class untill and unless some part of the 
    code in the innner class is accessed 

    So BillPugh Leverages this technique to create thread safe lazyInitialization Singleton.
    
    When the JVM loads your outer class:
    public class BillPugSingleton {
    ...
    }
    it knows about the inner static class HelperClass (because it’s compiled into a separate .class file, usually named BillPugSingleton$HelperClass.class),
        but it does not load or initialize it yet.
        At this stage:
        Only the metadata of HelperClass is recorded.
        No object creation happens.
        The BillPugSingleton constructor is not called.

    HelperClass is only loaded and initialized when you first access something inside it.
    That happens here:  

    return HelperClass.object;

    Thus, the object is created lazily, only on first use, and is thread-safe because JVM class initialization is synchronized per class.
 */
