package com.oops.staticvar;

public class StatVariable {
	int x=10;
	static int y=20;
	
	static void isStatic() {
//		System.out.println(x); instance variable
		System.out.println(y);
	}
	void isInstance() {
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		isStatic();//static method
		
		StatVariable s1=new StatVariable();
		s1.isInstance();
	}
}
