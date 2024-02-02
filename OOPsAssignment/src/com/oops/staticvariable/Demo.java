package com.oops.staticvariable;

public class Demo {
	int a=10;//instance var
	static int y=20;//static var
	
	void instanceMethod() {
		y=30;
		a=20;
	}
	static void staticMethod()
	{
		y=40;
//		a=50;
	}
	
	static 
	{
		System.out.println("static block");
	}
	{
		System.out.println("instance block");
	}
	
}
