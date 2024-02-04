package com.abstractclass;

import java.util.Scanner;

abstract class BankAccount{
	private int accno;
	private String type;
	protected String ifsc;
	protected double balance;
	
	public BankAccount() {
		
	}
	public BankAccount(int accno,String type,String ifsc,double balance) {
		this.accno=accno;
		this.type=type;
		this.ifsc=ifsc;
		this.balance=balance;
	}
	public void setAccNo(int accno) {
		this.accno=accno;
	}
	public int getAccNo() {
		return accno;
	}
	public void setType(String type) {
		this.type=type;
	}
	public String getType() {
		return type;
	}
	public abstract void deposit(int amount);
	
	public abstract void withdraw(int amount);
}
class SavingsAccount extends BankAccount{
	protected String name;
	public SavingsAccount() {
		
	}
	public SavingsAccount(int accno,String type,String ifsc,double balance,String name) {
		super(accno,type,ifsc,balance);
		this.name=name;
	}
	@Override
	public void deposit(int amount) {
		balance=balance+amount;
		System.out.println("Balance after deposit:"+balance);
	}
	@Override
	public void withdraw(int amount) {
		
		if(balance<amount)
			System.out.println("Insufficient Balance");
		else {
			balance=balance-amount;
			System.out.println(amount+" is deducted from your account");
			System.out.println("Balance after withdrawl is:"+balance);
		}
	}
}
class CurrentAccount extends BankAccount{
	protected String name;
	public CurrentAccount() {
		
	}
	public CurrentAccount(int accno,String type,String ifsc,double balance,String name) {
		super(accno,type,ifsc,balance);
		this.name=name;
	}
	@Override
	public void deposit(int amount) {
		balance=balance+amount;
		System.out.println("Balance after deposit:"+balance);
	}
	@Override
	public void withdraw(int amount) {
		
		if(balance<amount)
			System.out.println("Insufficient Balance");
		else {
			balance=balance-amount;
			System.out.println(amount+" is deducted from your account");
			System.out.println("Balance after withdrawl is:"+balance);
		}
	}
	
}
public class AbstractClassDemo1 {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		BankAccount b;
		b=new SavingsAccount(101, "Savings", "sbi123", 10000, "amit");
		System.out.println("Enter deposit");
		b.deposit(sc.nextInt());
		System.out.println("Enter amount you want to withdraw");
		b.withdraw(sc.nextInt());
		System.out.println("------------------------------------------");
		b=new CurrentAccount(102, "Current", "hdfc123", 20000, "Rohan");
		System.out.println("Enter amount you want to deposit");
		b.deposit(sc.nextInt());
		System.out.println("Enter amount you want to withdraw");
		b.withdraw(sc.nextInt());
	}
}
