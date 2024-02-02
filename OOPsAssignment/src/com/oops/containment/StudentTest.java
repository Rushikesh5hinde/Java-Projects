package com.oops.containment;

import java.util.Scanner;

public class StudentTest {
	Scanner sc=new Scanner(System.in);
	public  void enterStudentDetails(Student s) {
		System.out.println("Enter student roll no:");
		s.setRollno(sc.nextInt());
		System.out.println("Enter student name:");
		s.setSname(sc.next());
		
		Department d=new Department();
		System.out.println("Enter dept id:");
		d.setDeptid(sc.nextInt());
		System.out.println("Enter dept name");
		d.setDeptname(sc.next());
		
		s.setDept(d);
	}
	public static void main(String[] args) {
		StudentTest obj=new StudentTest();
		Student s=new Student();
		obj.enterStudentDetails(s);
		System.out.println(s);
	}
}
