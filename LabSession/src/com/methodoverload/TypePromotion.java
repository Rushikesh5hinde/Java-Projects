package com.methodoverload;
//Create a program to show how type promotion
//can create ambiguity in method overloading
public class TypePromotion {
	
	public static void display(int n1,double d1) {
		System.out.println("Ans:"+(n1+d1));
	}
	public static void display(long l,float f) {
		System.out.println("Ans:"+(l+f));
	}
	public static void main(String[] args) {
//		display(8, 8.8f);----------->ambiguity
		display((long)8, 8.8f);
		display(8, (double)8.8f);
	}
}
