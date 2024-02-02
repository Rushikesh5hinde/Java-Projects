package com.oops.containment;

import java.util.Scanner;

public class EmployeeTest {
	Scanner sc=new Scanner(System.in);
	
	public void enterEmloyeeDetails(Employee e) {
		System.out.println("Enter emp id");
		e.setId(sc.nextInt());
		System.out.println("Enter emp name");
		e.setName(sc.next());
		System.out.println("Enter salary");
		e.setSalary(sc.nextDouble());
		
		Dept d1=new Dept();
		System.out.println("Enter dept id");
		d1.setDept_id(sc.nextInt());
		System.out.println("Enter dept name");
		d1.setDept_name(sc.next());
		
		e.setDept(d1);
		
		MyDate m1=new MyDate();
		System.out.println("Enter day");
		m1.setDay(sc.nextInt());
		System.out.println("Enter month");
		m1.setMonth(sc.next());
		System.out.println("Enter year");
		m1.setYear(sc.nextInt());
		
		e.setMydate(m1);
	}
	public static void main(String[] args) {
		EmployeeTest obj=new EmployeeTest();
		Employee e1=new Employee();
		obj.enterEmloyeeDetails(e1);
		System.out.println(e1);
		
		Employee e2=new Employee(102, "Rohit", 40000, new Dept(1, "HR"), new MyDate(1, "Jan", 2024));
		System.out.println(e2);
	}
}
