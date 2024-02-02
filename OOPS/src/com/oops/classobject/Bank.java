package com.oops.classobject;

public class Bank {
	int count=0;
	public void showCount() {
		count++;
		System.out.println("Count:"+count);
	}
	public static void main(String[] args) {
		Bank b1=new Bank();
		Bank b2=new Bank();
		Bank b3=new Bank();
		
		b1.showCount();
		b2.showCount();
		b3.showCount();
	}
}
