package com.oops.getset;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setDetails(101, "Ravi", 40000);
//		e1.showDetails();
		e1.setEsal(60000);
		System.out.println(e1.getEsal());
	}
}
