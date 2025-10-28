package GangsOfFour.StructuralDesignPatterns.Adapter.Adaptee;

public class RazorpayAPI {
    public void payUsingUPI(String upiId, double amountInINR) {
        System.out.println("Razorpay paid ₹" + amountInINR + " via UPI " + upiId);
    }
}
