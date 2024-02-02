package com.oops.classobject;
/*
 * instance variable-which is inside class but outside method
 * instance variable can be accessed by any method present inside class
 * instance variable have copy per object
 */
public class Student {
	//instance variables
	String name="Rushi";
	int rollNo=101;
	//instance method
	public void learn() {
		System.out.println("Student is learning!");
	}
	public void show() {
		System.out.println("Name:"+name);
		System.out.println("RollNo:"+rollNo);
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.learn();//accessing instance method
//		s1.show();
		System.out.println(s1.name);//accessing instance variable
		System.out.println(s1.rollNo);
	}
}
