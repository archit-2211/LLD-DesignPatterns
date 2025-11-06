package GangsOfFour.BehavioralDesignPatterns.ChainOfResponsibility.LoanApprover;

public class Main {
    public static void main(String[] args) {
        Approver lead = new TeamLead();
        Approver manager = new Manager();
        Approver director = new Director();

        lead.setNext(manager);
        manager.setNext(director);

        lead.approveLoan(500);
        lead.approveLoan(5000);
        lead.approveLoan(20000);
    }
}
// We can use fascade class here as base class for approver to contact with outside world and abstract out internal processing of chain of responsibility. 