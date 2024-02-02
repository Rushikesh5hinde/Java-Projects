package com.oops.getset;

public class StudentTest {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setDetails(101, "Dipak", 76);
		s1.showDetails();
		
		s1.setSmarks(87);
		System.out.println(s1.getMarks());
	}
}
