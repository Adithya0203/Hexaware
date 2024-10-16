package shop.entity;

public class CreditCardPayment extends Payment {
    private String cardNumber;

    // Constructor to initialize cardNumber, payerName, and amount
    public CreditCardPayment(String payerName, double amount, String cardNumber) {
        super(payerName, amount);
        this.cardNumber = cardNumber;
    }

    // Implementation of the processPayment method
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment of $" + amount + " for " + payerName);
        System.out.println("Card Number: " + cardNumber);
        // Add logic here to actually process the credit card payment
    }
}