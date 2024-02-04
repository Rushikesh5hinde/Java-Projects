package com.task24012024;
@FunctionalInterface
interface Payment{
	
	double getDiscount(double amount);
}
class Cash implements Payment{

	@Override
	public double getDiscount(double amount) {
		System.out.println("you are not applicable for discount!");
		return amount;
	}
}
class CreditCard implements Payment{

	@Override
	public double getDiscount(double amount) {
		double total=amount-(amount*0.2);
		return total;
	}
}
class DebitCard implements Payment{

	@Override
	public double getDiscount(double amount) {
		if(amount<5000) {
			return amount;
		}else {
			double total=amount-(amount*0.2);
			return total;
		}
	}
}
class Paytm implements Payment{

	@Override
	public double getDiscount(double amount) {
		if(amount<1000)
		return amount;
		else {
			return (amount-500);
		}
	}
	
}
public class OnlineShoppingDemo {
	
	public void paymentMode(Payment p,double amt) {
		double discount=p.getDiscount(amt);
		
		System.out.println("Amount to pay:"+discount);
	}
	public static void main(String[] args) {
		
		OnlineShoppingDemo obj=new OnlineShoppingDemo();
		Payment p;
		p=new Cash();
		obj.paymentMode(p, 5000);
		
		p=new CreditCard();
		obj.paymentMode(p, 1000);
		
		p=new DebitCard();
		obj.paymentMode(p, 4000);
		obj.paymentMode(p, 10000);
		
		p=new Paytm();
		obj.paymentMode(p, 800);
		obj.paymentMode(p, 2000);
	}
}
