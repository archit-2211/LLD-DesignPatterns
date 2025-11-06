package GangsOfFour.BehavioralDesignPatterns.ChainOfResponsibility.LoanApprover;

public abstract class Approver {
    protected Approver next ; 

    public void setNext(Approver next) {
        this.next = next ; 
    }

    public abstract void approveLoan(int amount) ; 
    
}
