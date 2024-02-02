package com.oops.interfacedemo;
interface Student{
	void show();
	
	default void display() {
		System.out.println("I am a student");
	}
}
interface Teacher{
	void show();
	
	default void display() {
		System.out.println("I am a teacher");
	}
}
public class DiamondProblemDemo implements Student,Teacher{
	
	@Override
	public void show() {
		System.out.println("School:ZCOER Business School");
		
	}
	//compulsory override default method which causes ambiguity
	public void display() {
		System.out.println("IN School");
		
		//to call display method of student interface
		Student.super.display();
		//to call display method of teacher interface
		Teacher.super.display();
	}
	public static void main(String[] args) {
		Student s;
		s=new DiamondProblemDemo();
		
		s.show();
		s.display();
		System.out.println("----------------------------------");
		s=new DiamondProblemDemo();
		
		s.show();
		s.display();
	}

	
}
