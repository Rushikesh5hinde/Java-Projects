package com.oops.inheritance1;

import com.oops.inheritance.AccessDemo;

//outside package without inheritance
//only public is accessible
public class Demo2 {
	public static void main(String[] args) {
		AccessDemo obj=new AccessDemo();
		
//		obj.a=100;
//		obj.b=100;
//		obj.c=100;
		obj.d=100;//only public is accessible 
		
//		obj.test1();
//		obj.test2();
//		obj.test3();
		obj.test4();
	}
}
