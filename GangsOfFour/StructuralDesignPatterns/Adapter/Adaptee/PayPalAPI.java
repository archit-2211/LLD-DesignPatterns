package GangsOfFour.StructuralDesignPatterns.Adapter.Adaptee;


public class PayPalAPI {
    public void sendPayment(String email, double amount) {
        System.out.println("PayPal sent $" + amount + " to " + email);
    }
}