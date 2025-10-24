package GangsOfFour.CreationalDesignPatterns.Factory.PaymentProcessingExample;

public class PaymentInfo {
    
    private double amount ; 
    private String utr ; 
    private String bank ; 

    public Double getAmount() {
        return this.amount; 
    }

    public String getUtr() {
        return this.utr ; 
    }

    public String getBankName() {
        return this.bank ; 
    }
}
