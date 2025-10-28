package GangsOfFour.StructuralDesignPatterns.Adapter;

public class PaymentApp {
    public static void main(String[] args) {
        PaymentGateway stripe = new StripeAdapter("1234-5678-9999");
        PaymentGateway paypal = new PayPalAdapter("user@example.com");
        PaymentGateway razorpay = new RazorpayAdapter("archit@upi");

        stripe.makePayment(100.0);
        paypal.makePayment(200.0);
        razorpay.makePayment(5000.0);
    }
}
