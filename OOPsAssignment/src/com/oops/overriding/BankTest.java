package com.oops.overriding;
class Bank{
	float rate=0.02f;
	double pamount;
	
	void displayInterestRate() {
		System.out.println("Interest Rate:"+rate);
	}
}
class Savings extends Bank{
	float rate=0.03f;
	@Override
	void displayInterestRate() {
		System.out.println("Interest Rate:"+rate);
	}
}
class Current extends Bank{
	float rate=0.05f;
	@Override
	void displayInterestRate() {
		System.out.println("Interest Rate:"+rate);
	}
}
public class BankTest {
	public static void main(String[] args) {
		Bank b;
		b=new Savings();
		b.displayInterestRate();
		
		b=new Current();
		b.displayInterestRate();
	}
}
