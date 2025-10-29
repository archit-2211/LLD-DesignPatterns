package GangsOfFour.StructuralDesignPatterns.Facade.OnlineBanking;

public class LoanService {
    public void approveLoan(String customerId, double amount) {
        System.out.println("Loan aproved");
    }
    public void rejectLoan () {
        System.out.println("Loan Rejected") ; 
    }
    
}
