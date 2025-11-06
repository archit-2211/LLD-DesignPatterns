package GangsOfFour.BehavioralDesignPatterns.ChainOfResponsibility.LoanApprover;

public class Manager extends Approver {

    @Override
    public void approveLoan(int amount) {
        if (amount <= 100000) {
            System.out.println("Loan approved by Manager") ; 
            return ; 
        }
        this.next.approveLoan(amount);
    }
    
}
