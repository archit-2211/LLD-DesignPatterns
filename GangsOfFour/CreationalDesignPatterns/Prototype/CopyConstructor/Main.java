package GangsOfFour.CreationalDesignPatterns.Prototype.CopyConstructor;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Archit", 25) ; 
        Person p2 = new Person(p1) ; 

        System.out.println(p1);
        System.out.println(p2) ; 

        /*
         * Here we are creating deep copy of the object person p1. 
         * Meaning , we have a new object, with same attributes. 
         * 
         * The address of the object is different for p1 and p2 
         * 
         * If we create a shallow copy then even p2 will refer to p1 object. 
         * 
         * In case of deep copy changes to made to object p2 will not be reflected in object p1, while in shallow copy the changes made in p2 will be reflected in p1. 
         */

        
    }
    
}
