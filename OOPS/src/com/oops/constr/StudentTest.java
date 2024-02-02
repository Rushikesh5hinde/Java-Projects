package com.oops.constr;

class Student{
	private int id;
	private String name;
	private float percent;
	
	Student(){
		System.out.println("Default Const");
	}
	Student(int id,String name){
		this();
		this.name=name;
		System.out.println("Para1");
	}
	Student(int id,String name,float percent){
		this(id,name);
		this.percent=percent;
		System.out.println("Para2");
	}
}

public class StudentTest {
	public static void main(String[] args) {
//		Student s1=new Student();
//		Student s2=new Student(101,"Rushi");
		Student s3=new Student(101,"Rohit",87.9f);
	}
}
