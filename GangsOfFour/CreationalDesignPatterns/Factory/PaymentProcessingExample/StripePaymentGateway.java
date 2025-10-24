package GangsOfFour.CreationalDesignPatterns.Factory.PaymentProcessingExample;

public class StripePaymentGateway implements PaymentGateway {

    @Override
    public void processPayment(PaymentInfo paymentInfo) {
        System.out.println("Processing payment using STRIPE PAYMENT GATEWAY ");
    }
    
}
