package com.oops.assigmentoops;

import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id;
		String name,des;
		double sal;
		System.out.println("Enter Emp Id");
		id=sc.nextInt();
		System.out.println("Enter Emp Name");
		name=sc.next();
		System.out.println("Enter Emp Salary");
		sal=sc.nextDouble();
		System.out.println("Enter Emp designation");
		des=sc.next();
		
		Employee e1=new Employee();
		e1.setData(id, name, sal, des);
		e1.display();
	}
}
