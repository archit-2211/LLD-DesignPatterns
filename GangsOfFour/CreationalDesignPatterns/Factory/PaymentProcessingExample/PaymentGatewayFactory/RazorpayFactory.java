package GangsOfFour.CreationalDesignPatterns.Factory.PaymentProcessingExample.PaymentGatewayFactory;

import GangsOfFour.CreationalDesignPatterns.Factory.PaymentProcessingExample.PaymentGateway;
import GangsOfFour.CreationalDesignPatterns.Factory.PaymentProcessingExample.RazorpayPaymentGateway;

public class RazorpayFactory implements PaymentGatewayFactory {
    public PaymentGateway getPaymentGateway() {
        return new RazorpayPaymentGateway() ; 
    } 
    
}
