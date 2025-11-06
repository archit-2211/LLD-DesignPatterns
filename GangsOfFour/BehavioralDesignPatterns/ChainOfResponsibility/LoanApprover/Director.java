package GangsOfFour.BehavioralDesignPatterns.ChainOfResponsibility.LoanApprover;

class Director extends Approver {
    public void approveLoan(int amount) {
        System.out.println("Director approved ₹" + amount);
    }
}