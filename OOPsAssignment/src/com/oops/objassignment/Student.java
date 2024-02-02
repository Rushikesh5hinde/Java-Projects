package com.oops.objassignment;

public class Student {
	int roll_no;
	String name;
	long phone;
	
	public void setValue(int roll_no,String name,long phone) {
		this.roll_no=roll_no;
		this.name=name;
		this.phone=phone;
	}
	public void display() {
		System.out.println("Roll No:"+roll_no);
		System.out.println("Name:"+name);
		System.out.println("Phone no:"+phone);
	}
}
