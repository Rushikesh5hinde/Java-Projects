package com.oops.dynamicmethodbinding;

class Bank{
	protected double rate;
	
	void getInterestRate() {
		rate=9;
		System.out.println("Rate of interest is:"+rate);
	}
}
class SBIBank extends Bank{
	
	
	void getInterestRate() {
		rate=8.5;
		System.out.println("SBI Rate of interest is:"+rate);
	}
}
class HDFCBank extends Bank{
	
	
	void getInterestRate() {
		rate=9.5;
		System.out.println("HDFC Rate of interest is:"+rate);
	}
	void showBankDetails() {
		System.out.println("IFSC:hdfc123");
	}
}
public class DynamicMethodBindingDemo {
	public static void main(String[] args) {
		Bank b;
		b=new SBIBank();	//up-casting
		b.getInterestRate();
							//don't need to create multiple object reference
		b=new HDFCBank();
		b.getInterestRate();
//		b.showBankDetails();	cannot access methods other than overridden
		
		HDFCBank b1=new HDFCBank();
		b1.getInterestRate();
		b1.showBankDetails();
	}
}
