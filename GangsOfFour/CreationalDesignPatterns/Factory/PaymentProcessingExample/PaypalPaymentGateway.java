package GangsOfFour.CreationalDesignPatterns.Factory.PaymentProcessingExample;

public class PaypalPaymentGateway implements PaymentGateway {

    @Override
    public void processPayment(PaymentInfo paymentInfo) {
        System.out.println("Processing payment using PAYPAL PAYMENT GATEWAY");
    }
    
}
