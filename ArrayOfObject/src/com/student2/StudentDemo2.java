package com.student2;

public class StudentDemo2 {
	public static void main(String[] args) {
		Course ct[]=new Course[3];
		
		ct[0]=new Course(1, "java");
		ct[1]=new Course(2, ".net");
		ct[2]=new Course(3, "python");
		
		Student[] stud=new Student[3];
		
		stud[0]=new Student(101, "Amit", new double[] {67.5,98,90}, ct[0]);
		stud[1]=new Student(102, "Meera", new double[] {76,90,82.5}, ct[0]);
		double[] m={76,90,82.5};
		stud[2]=new Student(103, "Mandar",m , ct[1]);
		
		for(Student s:stud) {
			System.out.println(s);
		}
	}
}
