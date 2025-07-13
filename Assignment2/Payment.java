package com;

interface PaymentGateway{
	void processPayment();
	void cancelTransaction();
	
}
  
class UPIPayments implements PaymentGateway{
	public void processPayment() {
		System.out.println("Payment Successful");
	}
	  public void cancelTransaction() {
		  System.out.println("payment cancelled");
	  }
}
 
class CreditCardPayment implements PaymentGateway{
	public void processPayment() {
		System.out.println("payment successful");
	}
	public void cancelTransaction() {
	  System.out.println("payment cancelled");
}
}

   public class Payment {
    public static void main(String[] args) {
    	PaymentGateway p1=new UPIPayments();
    	p1.processPayment();
    	p1.cancelTransaction();
    	PaymentGateway p2=new UPIPayments();
    	p2.processPayment();
    	p2.cancelTransaction();
    }
}
