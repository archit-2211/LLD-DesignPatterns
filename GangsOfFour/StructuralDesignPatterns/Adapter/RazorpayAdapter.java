package GangsOfFour.StructuralDesignPatterns.Adapter;

import GangsOfFour.StructuralDesignPatterns.Adapter.Adaptee.RazorpayAPI;

public class RazorpayAdapter implements PaymentGateway {
    private RazorpayAPI razorpayAPI;
    private String upiId;

    public RazorpayAdapter(String upiId) {
        this.razorpayAPI = new RazorpayAPI();
        this.upiId = upiId;
    }

    @Override
    public void makePayment(double amount) {
        // Convert amount to INR if needed (optional)
        razorpayAPI.payUsingUPI(upiId, amount);
    }
}
