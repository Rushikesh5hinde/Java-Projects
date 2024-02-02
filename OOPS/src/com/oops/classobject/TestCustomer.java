package com.oops.classobject;

class Customer {
	int custid;	//instance variables
	String custName;
	
	public void showDetails() {
		int a=0;//local variable can not be used directly without initialization
		System.out.println("Customer id:"+custid);
		System.out.println("Customer Name:"+custName);
		System.out.println(a);
	}
	public void shop() {
		System.out.println(custid);
//		System.out.println(a); scope of local variable is limited to that method only
	}
}
public class TestCustomer {
	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.showDetails();
	}
}
