package com.oops.constr;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1=new Employee();
		System.out.println(e1);
		
		Employee e2=new Employee(101,"Rushikesh");
		System.out.println(e2);
		
		e2.setEsal(50000);
		System.out.println(e2);
		
		Employee e3=new Employee(102,"Rohit",40000);
		System.out.println(e3);
	}
}
