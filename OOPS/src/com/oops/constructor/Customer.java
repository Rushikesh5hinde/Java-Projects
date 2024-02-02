package com.oops.constructor;
//constructor overloding-constructor with diff parameter
//in constructor overloading we cannot take same constructor multiple times
public class Customer {
	private int custid;
	private String custname;
	private String custemail;
	private String custcontact;
	
	public Customer() {
		
	}
	//add customer
	public Customer(String custname,String custemail,String custcontact) {
		this.custname=custname;
		this.custemail=custemail;
		this.custcontact=custcontact;
	}
	//update customer
	public Customer(int custid,String custname,String custemail,String custcontact) {
		this.custid=custid;
		this.custname=custname;
		this.custemail=custemail;
		this.custcontact=custcontact;
	}
	public Customer(int custid) {
		this.custid=custid;
	}
}
