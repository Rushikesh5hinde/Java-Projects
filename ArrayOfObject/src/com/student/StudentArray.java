package com.student;

public class StudentArray {
	static void displayAllStudents(Student[] st) {
		for(Student s:st) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		Student[] stud=new Student[5];
//		System.out.println(stud);	hash code
		
		//using constructors
		stud[0]=new Student(101, "Ram", 90);
		stud[1]=new Student(102, "Rakesh", 80);
		stud[2]=new Student(103, "Shyam", 92);
		stud[3]=new Student(104, "Ayush", 95);
		stud[4]=new Student(105, "Ramesh", 75);
		
//		System.out.println(stud[1].getMarks());
		
		displayAllStudents(stud);
	}
}
