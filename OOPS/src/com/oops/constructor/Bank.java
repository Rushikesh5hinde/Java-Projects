package com.oops.constructor;

public class Bank {
	private double bal=10000;
	
	public Bank() {
		this(10);//calling parameterized constr
		System.out.println("default Constructor");
	}
	public Bank(double bal) {
//		this();//calling default constr
		this("hello");
		System.out.println("Parameterized constr");
	}
	public Bank(String name) {

		System.out.println("String constr");
	}
}
