package com.oops.lab;

public class StudentTest {
	public static void main(String[] args) {
		Student s1=new Student(1, "rushi", 80, 80, 80, 80, 80);
		s1.displayStudent();
		Student s2=new Student(2, "Onkar", 85, 85, 85, 85, 85);
		s2.displayStudent();
		
		s1.comparePercentage(s2);
	}
}
