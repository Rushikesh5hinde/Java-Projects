package com.oops.constructor;

public class Account {
	public long accountNo;
	public String customerName;
	
	public Account() {
		accountNo=101;
		customerName="Rushi";
		System.out.println("I am in default");
	}
	public Account(long accountNo,String customerName) {
		System.out.println("I am in parameterized constructor");
		this.accountNo=accountNo;
		this.customerName=customerName;
		
	}
}
