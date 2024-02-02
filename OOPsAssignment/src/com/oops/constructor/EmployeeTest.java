package com.oops.constructor;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1=new Employee(101, "Rakesh", 30000);
		e1.setSal(45000);
		System.out.println(e1.getSal());
	}
}
