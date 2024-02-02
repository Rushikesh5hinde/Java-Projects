package com.oops.overriding;
class Company{
	void address() {
		System.out.println("Please provide address");
	}
}
class EBay extends Company{
	@Override
	void address() {
		System.out.println("Pune,Maharashtra");
	}
}
public class CompanyTest {
	public static void main(String[] args) {
		Company c;
		c=new EBay();
		c.address();
	}
}
