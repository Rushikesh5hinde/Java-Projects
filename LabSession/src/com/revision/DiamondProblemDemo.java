package com.revision;
interface A1{
	
}
interface B extends A1{
	default void learning() {
		System.out.println("default B learning()");
	}
}
interface C extends A1{
	default void learning() {
		System.out.println("default C learning()");
	}
}
class D implements B,C{
	public void learning() {
		System.out.println("Lets learn!");
	}
}
public class DiamondProblemDemo {
	public static void main(String[] args) {
		B obj;
		
		obj=new D();
		obj.learning();
	
	}
}
