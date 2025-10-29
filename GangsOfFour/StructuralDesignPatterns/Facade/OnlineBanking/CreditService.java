package GangsOfFour.StructuralDesignPatterns.Facade.OnlineBanking;

public class CreditService {
    public boolean hasGoodCreditScore(String custId) {
        System.out.println("Checking the credit Score of " + custId) ; 
        return true; // Assume has good credit score
    }
    public void updateCreditScore(int score) {
        System.out.println("Credit Score updated " + score) ; 

    }
    
}
