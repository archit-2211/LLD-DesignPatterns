package GangsOfFour.BehavioralDesignPatterns.ChainOfResponsibility.LoanApprover;

public class TeamLead extends Approver {



    @Override
    public void approveLoan(int amount) {
        if (amount <=1000) {
            System.out.println("Loan is appr0ved by team lead") ; 
            return ;
        }
        this.next.approveLoan(amount);
    }
   }
    

