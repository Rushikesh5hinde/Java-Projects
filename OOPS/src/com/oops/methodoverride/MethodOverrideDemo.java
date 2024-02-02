package com.oops.methodoverride;

//cannot decrease scope of access modifier
//parameters should be same
//method signature should be same
//static methods cannot be overriden
//static methods are associated with class and it gets loaded when class is loaded
//method overriding is runtime polymorphism
//static methods gets loaded at compile time

class Person{
	String name;
	 void display(String name) {
		System.out.println("I am a person:"+name);
	}
	 static void show() {
		 System.out.println("static method person");
	 }
}
class Employee extends Person{
	String name;
	public void display(String name) {
		
		System.out.println("I am an employee:"+name);
		System.out.println("Organization:HCL");
	}
	static void show() {
		 System.out.println("static method employee");
	 }
}
class Trainee extends Person{
	String name;
	void display(String name) {
		super.display(name);
		System.out.println("I am a trainee:"+name);
		System.out.println("Probation Period:6 Months");
	}
}
public class MethodOverrideDemo {
	public static void main(String[] args) {
		Person p1=new Person();
		p1.display("Amit");
		System.out.println("--------------");
		Employee e=new Employee();
		e.display("Rakesh");
		
		System.out.println("--------------");
		Trainee t=new Trainee();
		t.display("Ravi");
	}
}
