package shop.entity;

import shop.exception.*;

public class CashPayment extends Payment {
	private double cashReceived;

	public CashPayment(String payerName, double amount, double cashRecieved) throws InsufficientPaymentException {
		super(payerName, amount);
		this.cashReceived = cashRecieved;
		
        if (cashReceived < amount) {
            throw new InsufficientPaymentException("Insufficient cash provided for the payment.");
        }
	}
	
	@Override
	public void processPayment() {
        System.out.println("Processing cash payment of $" + amount + " for " + payerName);
        System.out.println("Cash received: $" + cashReceived);
        if (cashReceived >= amount) {
            double change = cashReceived - amount;
            System.out.println("Change: $" + change);
        } else {
            System.out.println("Insufficient cash received.");
        }
        // Add logic for cash payment handling		
	}
}
