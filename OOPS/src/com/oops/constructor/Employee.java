package com.oops.constructor;

public class Employee {
	private int eid;
	private String ename;
	private double esal;
	
	public Employee() {
		System.out.println("default construtor invoked");
	}
	//there can be only one default constructor
	public Employee(int eid) {
		System.out.println("parameterized constructor:"+eid);
	}
	public void showMethod() {
		System.out.println("show method");
	}
}
