package com.oops.staticfinal;
class Parent{
	//Que-7
	static int id=100;
	//Que-9
	final int value=100;
//	value=101;
	//Que-6
	public static void show() {
		System.out.println("Parent show()");
	}
	//Que-9
	public final void display() {
		System.out.println("Parent display()");
	}
}
class Child extends Parent{
	//Que-8
//	@Override
//	public static void show() {
//		System.out.println("Parent show()");
//	}
	//Que-7
//	static void showId() {
//		System.out.println(Parent.id);
//	}
	
	//Que-9
//	@Override
//	public  void display() {
//		System.out.println("Parent display()");
//	}
	
}
//Que-9
//final class Parent1{
//	
//}
//class Child1 extends Parent1{
//	
//}
public class OverrideDemo {
	public static void main(String[] args) {
		
	}
	
}
