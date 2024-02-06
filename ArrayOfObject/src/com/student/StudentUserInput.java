package com.student;

import java.util.Scanner;

public class StudentUserInput {
	static Scanner sc=new Scanner(System.in);
	public static void sortMarks(Student[] st) {
		Student stemp=new Student();
		for(int i=0;i<st.length;i++) {
			for(int j=i+1;j<st.length;j++) {
				if(st[i].getMarks()>st[j].getMarks()) {
					stemp=st[i];
					st[i]=st[j];
					st[j]=stemp;
				}
			}
		}
	}
	public static void enterStudentDetails(Student s) {
		System.out.println("Enter id:");
		s.setId(sc.nextInt());
		System.out.println("Enter name:");
		s.setName(sc.next());
		System.out.println("Enter marks:");
		s.setMarks(sc.nextDouble());
	}
	public static void displayAllStudents(Student[] st) {
		for(Student s:st) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		Student[] stud=new Student[3];
		//using getters and setters
		stud[0]=new Student();
		stud[0].setId(101);
		stud[0].setName("Rushi");
		stud[0].setMarks(94);
		
		stud[1]=new Student();
		stud[1].setId(102);
		stud[1].setName("Onkar");
		stud[1].setMarks(90);
		
		stud[2]=new Student();
		stud[2].setId(103);
		stud[2].setName("Shreyash");
		stud[2].setMarks(98);
		
//		for(int i=0;i<stud.length;i++) {
//			stud[i]=new Student();
//		}
//		for(int i=0;i<stud.length;i++) {
//			System.out.println("Enter id:");
//			stud[i].setId(sc.nextInt());
//			System.out.println("Enter name:");
//			stud[i].setName(sc.next());
//			System.out.println("Enter marks:");
//			stud[i].setMarks(sc.nextDouble());
//		}
//		for(int i=0;i<stud.length;i++) {
//			stud[i]=new Student();
//			enterStudentDetails(stud[i]);
//		}
		System.out.println("-----------------------");
		displayAllStudents(stud);
		sortMarks(stud);
		System.out.println("-----------------------");
		displayAllStudents(stud);
	}
}
