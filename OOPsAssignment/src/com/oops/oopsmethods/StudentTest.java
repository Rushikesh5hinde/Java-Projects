package com.oops.oopsmethods;

public class StudentTest {
	public static void main(String[] args) {
		Student s1=new Student();
//		s1.displayData();
		
		s1.setCustomData(102, "Rahul");
		System.out.println("Student Id:"+s1.sId);
		System.out.println("Student Name:"+s1.sName);
	}
}
