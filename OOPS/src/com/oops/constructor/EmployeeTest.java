package com.oops.constructor;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.showMethod();
		Employee e2=new Employee(10);
		e2.showMethod();
	}
}
