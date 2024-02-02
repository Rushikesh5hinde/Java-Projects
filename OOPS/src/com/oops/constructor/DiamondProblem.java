package com.oops.constructor;
interface One{
	void show();
}
interface Two extends One{
	default void display() {
		System.out.println("Interface Two display()");
	}
}
interface Three extends One{
	default void display() {
		System.out.println("Interface Three display()");
	}
}
class Demo implements Two,Three{

	@Override
	public void show() {
		System.out.println("Demo show() method");
	}

	@Override
	public void display() {
		System.out.println("Demo overriden method");
		Two.super.display();
		Three.super.display();
	}
	
}
public class DiamondProblem {
	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.display();
	}
}
