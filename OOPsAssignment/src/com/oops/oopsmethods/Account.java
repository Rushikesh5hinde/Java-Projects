package com.oops.oopsmethods;

public class Account {
	int acc_no;
	String name;
	float amount;
	
	public void insert(int acno,String name1,float amt) {
		acc_no=acno;
		name=name1;
		amount=amt;
	}
	public void display() {
		System.out.println("Account No:"+acc_no);
		System.out.println("Ac Holder Name:"+name);
	}
	public void checkBalance() {
		System.out.println("Your Account Balance is "+amount);
	}
	public void deposit(int deposit) {
		amount=amount+deposit;
		System.out.println("Your Balance after deposit is "+amount);
	}
	public void withdraw(int withdraw) {
		if(withdraw<amount) {
		amount=amount-withdraw;
		System.out.println("Your Balance after withdraw is "+amount);
		}else {
			System.out.println("Insufficint Balance");
		}
	}
}
