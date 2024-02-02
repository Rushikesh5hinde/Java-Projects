package com.oops.staticvar;

public class Demo {
	public static void main(String[] args) {
		System.out.println(StatVariable.y);//static variable using class name
		
		StatVariable s1=new StatVariable();
		System.out.println(s1.x);// instance variable using object creation
		
		
	}
}
