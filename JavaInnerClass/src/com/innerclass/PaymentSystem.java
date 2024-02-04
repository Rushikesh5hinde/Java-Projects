package com.innerclass;
interface Payment{
	void payBill();
}
class UPI implements Payment{
	@Override
	public void payBill() {
		System.out.println("Pay through UPI");
	}
	public void getDiscount() {
		
	}
}
class CreditCard implements Payment{
	@Override
	public void payBill() {
		System.out.println("Pay through Credit Card");
	}
	public void getDiscount() {
		
	}
}

public class PaymentSystem {
	public static void main(String[] args) {
		UPI obj=new UPI() {
			@Override
			public void getDiscount() {
				System.out.println("1000 rs cashback");
			}
		};
		
		obj.payBill();
		obj.getDiscount();
		System.out.println("-----------------------------");
		CreditCard obj2=new CreditCard() {
			@Override
			public void getDiscount() {
				System.out.println("1500 rs cashback");
			}
		};
		obj2.payBill();
		obj2.getDiscount();
	}
}
