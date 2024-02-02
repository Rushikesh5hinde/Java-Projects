package com.oops.inheritance1;

import com.oops.inheritance.AccessDemo;

//outside package with inheritance
//without creating object of derived class-only public is accessible
//creating object of derived class-protected public is accessible
//important-extends-create object of derived class

public class Demo3 extends AccessDemo{
	public static void main(String[] args) {
//		AccessDemo obj=new AccessDemo();
//		
//		obj.a=100;
//		obj.b=100;
//		obj.c=100;
//		obj.d=100;
//		
//		obj.test1();
//		obj.test2();
//		obj.test3();
//		obj.test4();
		
		//for protected, we need to create object of derived class
		
		Demo3 obj=new Demo3();
		
//		obj.a=100;
//		obj.b=100;
		obj.c=100;//protected is accessible
		obj.d=100;//public is accessible
		
//		obj.test1();
//		obj.test2();
		obj.test3();
		obj.test4();
	}
}
