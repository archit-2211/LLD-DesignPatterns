package GangsOfFour.StructuralDesignPatterns.Facade.OnlineBanking;


/*
 * This main class is our client it just calls the facade class that internally handles all the complexities and calculations. 
 */

 
public class Main {
    public static void main(String[] args) {
        BankFacade facade = new BankFacade() ; 

        facade.applyForLoan("ARCHIT2211", 1000);
    }
}
