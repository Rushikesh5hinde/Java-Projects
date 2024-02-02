package com.oops.staticvariable;

public class Account {
	private int acc_no;
	private String name;
	private float amount;
	private float balance;
	static double interest;
	static String bank;
	static int count;
	
	static{
		bank="SBI";
		interest=0.08;
	}
	{
		count++;
	}
	public Account() {
	
	}

	public Account(int acc_no, String name, float amount) {
		this();
		this.acc_no = acc_no;
		this.name = name;
		this.amount = amount;
	}

	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Account [acc_no=" + acc_no + ", name=" + name +" Bank:"+bank+ "]";
	}
	public String withdrawAmount(double amount) {
		if(this.amount<amount) {
			return "Insufficient Balance";
		}else {
			this.amount-=amount;
			return "Amount withdrawn!";
		}
	}
	public String depositAmount(double amount) {
		this.amount+=amount;
		return "Your account has received with amount:"+amount;
	}
	
}
