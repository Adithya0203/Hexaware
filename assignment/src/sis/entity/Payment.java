package sis.entity;

public class Payment {
	private int paymentID;
	private int studentID;
	private double amount;
	private String paymentDate;
	
//	constructor
	
	public Payment(int paymentID, int studentID, double amount, String paymentDate) {
		super();
		this.paymentID = paymentID;
		this.studentID = studentID;
		this.amount = amount;
		this.paymentDate = paymentDate;
	}
	
//	getters and setters

	public int getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	
//	toString

	@Override
	public String toString() {
		return "Payment [paymentID=" + paymentID + ", studentID=" + studentID + ", amount=" + amount + ", paymentDate="
				+ paymentDate + "]";
	}
}
