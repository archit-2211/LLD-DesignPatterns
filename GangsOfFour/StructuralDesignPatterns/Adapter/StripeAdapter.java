package GangsOfFour.StructuralDesignPatterns.Adapter;

import GangsOfFour.StructuralDesignPatterns.Adapter.Adaptee.StripeAPI;

public class StripeAdapter implements PaymentGateway {
    private StripeAPI stripeAPI;
    private String cardNumber;

    public StripeAdapter(String cardNumber) {
        this.stripeAPI = new StripeAPI();
        this.cardNumber = cardNumber;
    }

    @Override
    public void makePayment(double amount) {
        stripeAPI.chargeCard(cardNumber, amount);
    }
}
