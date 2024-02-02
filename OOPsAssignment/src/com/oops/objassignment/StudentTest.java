package com.oops.objassignment;

public class StudentTest {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setValue(2, "John",123456);
		s1.display();
		
		Student s2=new Student();
		s2.setValue(3, "Sam", 567894);
		s2.display();
	}
}
