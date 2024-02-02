package com.oops.wrapperclasses;

public class WrapperDemo {
	public static void main(String[] args) {
		//Boxing: primitive to wrapper
		
		int num=23;
		Integer i1=Integer.valueOf(num); 
		Integer i2=num;	//valueOf() added by compiler--------auto boxing
		
		System.out.println(i1);
		System.out.println(i2);
		
		//object creation
		
		Integer i3=new Integer(45);
		System.out.println(i3);
		//Unboxing: wrapper to primitive
		
		Float f1=8.34f;
		float f=f1.floatValue();
		
		float f2=f1;	//floatValue() added by compiler ------auto unboxing
		
		System.out.println(f);
		System.out.println(f2);
	}
}
