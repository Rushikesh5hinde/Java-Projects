package com.oops.inheritance;
//same package different class
//private is not accessible outside class
public class Demo1 {
	public static void main(String[] args) {
		AccessDemo obj=new AccessDemo();
		
//		obj.a=100; private is not accessible in same package diff class
		obj.b=100;
		obj.c=100;
		obj.d=100;
		
//		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
	}
}
