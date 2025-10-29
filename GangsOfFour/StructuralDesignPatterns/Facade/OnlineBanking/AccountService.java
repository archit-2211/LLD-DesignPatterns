package GangsOfFour.StructuralDesignPatterns.Facade.OnlineBanking;

public class AccountService {
    public boolean hasSufficientSavings(String custId, double amount) {
        System.out.println("Checking for sufficient Balance") ;  
        return true; // Assuming that the account has sufficient balance

    }

    public double getBalance(String custId) {
        System.out.println("Fetching account balance");
        return 1000L ; // Assume this is the balance in our account
    }
    
}
