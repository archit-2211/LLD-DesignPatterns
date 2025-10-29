package GangsOfFour.StructuralDesignPatterns.Facade.OnlineBanking ; 


public class BankFacade {
    private AccountService accountService = new AccountService();
    private CreditService creditService = new CreditService();
    private LoanService loanService = new LoanService();

    public void applyForLoan(String customerId, double amount) {
        System.out.println("Processing loan request...");
        if (accountService.hasSufficientSavings(customerId, amount) &&
            creditService.hasGoodCreditScore(customerId)) {

            loanService.approveLoan(customerId, amount);
        } else {
            System.out.println("Loan application denied for customer " + customerId);
        }
    }
}