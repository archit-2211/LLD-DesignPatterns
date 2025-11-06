package GangsOfFour.StructuralDesignPatterns.Flyweight.Pubg;

public class Main {

    public static void main(String[] args) {
        Gun AK47 = new AK47() ; 
        Gun M416 = new M416() ; 

        Player p1 = new Player("Archit",1 , 20, 3); 
        Player p2 = new Player("Megha",10, 02, 03);

        p1.setGunOne(AK47);
        p1.setGunTwo(M416);

        p2.setGunOne(M416);
        p2.setGunTwo(AK47);

        /*Same shared objects can be used here but we can create or get this objects using different creational design patterns based on our usecases. */

    }
    
}
