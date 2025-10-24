package GangsOfFour.CreationalDesignPatterns.Factory.PaymentProcessingExample;

public class RazorpayPaymentGateway implements PaymentGateway {

    @Override
    public void processPayment(PaymentInfo paymentInfo) {
        System.out.println("Processing payment using RAZORPAY PAYMEMNT GATEWAY") ; 
    } 

    
    
}
