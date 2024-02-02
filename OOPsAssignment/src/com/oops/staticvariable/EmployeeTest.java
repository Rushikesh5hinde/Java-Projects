package com.oops.staticvariable;

import java.util.Scanner;

public class EmployeeTest {
	static Scanner sc=new Scanner(System.in);
	public static void enterEmployeeDetails(Employee e) {
		System.out.println("Enter Emp name");
		e.setEmpName(sc.next());
		System.out.println("Enter Emp salary");
		e.setEmpSal(sc.nextDouble());
	}
	public static void main(String[] args) {
		Employee e1=new Employee(); 
		enterEmployeeDetails(e1);
		System.out.println(e1);
		
		Employee e2=new Employee();
		enterEmployeeDetails(e2);
		System.out.println(e2);
		
		Employee e3=new Employee();
		enterEmployeeDetails(e3);
		System.out.println(e3);
	}
}
