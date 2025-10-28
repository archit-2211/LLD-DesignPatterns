package GangsOfFour.StructuralDesignPatterns.Adapter;

import GangsOfFour.StructuralDesignPatterns.Adapter.Adaptee.PayPalAPI;

public class PayPalAdapter implements PaymentGateway {
    private PayPalAPI paypalAPI;
    private String email;

    public PayPalAdapter(String email) {
        this.paypalAPI = new PayPalAPI();
        this.email = email;
    }

    @Override
    public void makePayment(double amount) {
        paypalAPI.sendPayment(email, amount);
    }
}
