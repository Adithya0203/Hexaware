package shop.exception;

public class InsufficientPaymentException extends Exception{
	public InsufficientPaymentException(String message) {
		super(message);
	}
}
