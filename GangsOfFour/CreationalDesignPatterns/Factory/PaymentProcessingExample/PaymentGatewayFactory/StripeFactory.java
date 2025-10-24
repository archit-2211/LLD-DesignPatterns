package GangsOfFour.CreationalDesignPatterns.Factory.PaymentProcessingExample.PaymentGatewayFactory;

import GangsOfFour.CreationalDesignPatterns.Factory.PaymentProcessingExample.PaymentGateway;
import GangsOfFour.CreationalDesignPatterns.Factory.PaymentProcessingExample.StripePaymentGateway;

public class StripeFactory implements PaymentGatewayFactory {

    @Override
    public PaymentGateway getPaymentGateway() {
        return new StripePaymentGateway() ; 
    } 
    
}
