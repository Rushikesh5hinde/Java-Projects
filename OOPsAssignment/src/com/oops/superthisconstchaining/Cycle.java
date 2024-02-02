package com.oops.superthisconstchaining;

public class Cycle {
	int accountNo;
	int noOfWheels;
	public Cycle() {
		System.out.println("I am default constructor");
	}
	public Cycle(int accountNo, int noOfWheels) {
		this();
		this.accountNo = accountNo;
		this.noOfWheels = noOfWheels;
		System.out.println("I am another constructor");
	}
	public static void main(String[] args) {
		Cycle c1=new Cycle();
		
		Cycle c2=new Cycle(101, 2);
	}
}
