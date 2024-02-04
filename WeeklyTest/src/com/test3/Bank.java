package com.test3;

abstract class Account{
	protected int accno;
	protected String pname;
	protected double balance;

	public Account(){

	}
	public Account(int accno,String pname,double balance){
		this.accno=accno;
		this.pname=pname;
		this.balance=balance;
	}

	abstract void deposit(int amount);
	abstract void withdraw(int amount);
	abstract void displayBalance();
	abstract void calculateInterest(double rate);
}
class Savings extends Account{
	protected String type;
	public Savings(){

	}
	public Savings(int accno,String pname,double balance,String type){
		super(accno,pname,balance);
		this.type=type;
	}
	public void withdraw(int amount){
		if(balance<amount)
		System.out.println("Insufficient Balance");
		else{
			balance=balance-amount;
			System.out.println("Amount withdrawn!");
		}
	}
	public void deposit(int amount){
		balance=balance+amount;
		System.out.println("Amount Deposited!");
	}
	public void displayBalance(){
		System.out.println("Your account balance is:"+balance);
	}
	public void calculateInterest(double rate){
		double total=balance+(balance*rate)/100;	
		System.out.println("Balance after Interest:"+total);
	}
	public void accountInfo(){
		System.out.println("This is Savings Account!");
	}
}
class CurrentAccount extends Account{
	protected String type;
	public CurrentAccount(){

	}
	public CurrentAccount(int accno,String pname,double balance,String type){
		super(accno,pname,balance);
		this.type=type;
	}
	public void withdraw(int amount){
		if(balance<amount)
		System.out.println("Insufficient Balance");
		else{
			balance=balance-amount;
			System.out.println("Amount withdrawn!");
		}
	}
	public void deposit(int amount){
		balance=balance+amount;
		System.out.println("Amount Deposited!");
	}
	public void displayBalance(){
		System.out.println("Your account balance is:"+balance);
	}
	public void calculateInterest(double rate){
		double total=balance+(balance*rate)/100;	
		System.out.println("Balance after Interest:"+total);
	}
	public void accountInfo(){
		System.out.println("This is current Account");
	}
}
public class Bank{
	
	public static void main(String[] args){
		Account a1;
	
		a1=new Savings(101,"Tejas",10000,"Savings");
//		a1.accountInfo();
		a1.deposit(5000);
		a1.withdraw(1000);
		a1.displayBalance();
		a1.calculateInterest(6);

		a1=new CurrentAccount(102,"Ravi",10000,"Current");
//		a1.accountInfo();
		a1.deposit(5000);
		a1.withdraw(1000);
		a1.displayBalance();
		a1.calculateInterest(9);
	}
}
