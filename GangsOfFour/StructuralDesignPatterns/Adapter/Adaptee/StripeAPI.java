// Imagine this is the 3rd-party Stripe SDK class
package GangsOfFour.StructuralDesignPatterns.Adapter.Adaptee;
public class StripeAPI {
    public void chargeCard(String cardNumber, double amountInUSD) {
        System.out.println("Stripe charged $" + amountInUSD + " from card " + cardNumber);
    }
}
