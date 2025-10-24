package GangsOfFour.CreationalDesignPatterns.Factory.PaymentProcessingExample.PaymentGatewayFactory;

import GangsOfFour.CreationalDesignPatterns.Factory.PaymentProcessingExample.PaymentGateway;
import GangsOfFour.CreationalDesignPatterns.Factory.PaymentProcessingExample.PaypalPaymentGateway;

public class PaypalFactory implements PaymentGatewayFactory{

    @Override
    public PaymentGateway getPaymentGateway() {
        return new PaypalPaymentGateway() ; 
    }
    
}
