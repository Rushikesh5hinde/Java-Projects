package com.oops.dimondproblem;
interface One{
	default void print() {
		System.out.println("one");
	}
	abstract void show();
}
interface Two extends One{
	@Override
	default void print() {
		
		One.super.print();
		System.out.println("Two");
	}
}
interface Three extends One{
	@Override
	default void print() {
		
		One.super.print();
		System.out.println("Three");
	}
}
class Main1 implements Two,Three{

	@Override
	public void print() {
//		One.super.print();
		Two.super.print();
		Three.super.print();
		System.out.println("Main");
	}

	@Override
	public void show() {
		
		System.out.println("show()");
	}	
	
}
public class DiamondProblem {
	public static void main(String[] args) {
		Main1 obj=new Main1();
		obj.print();
	}
}
