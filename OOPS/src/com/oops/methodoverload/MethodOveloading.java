package com.oops.methodoverload;

public class MethodOveloading {
	
	static void display(float n) {
		System.out.println("In float");
		System.out.println(n);
	}
//	static void display(long n) {
//		System.out.println("In long");
//		System.out.println(n);
//	}
	
//	static void display(int n) {
//		System.out.println("in int");
//		System.out.println(n);
//	}
	
	static void display(int n1,double d1) {
		System.out.println("In method 1");
		System.out.println(n1+d1);
	}
	static void display(long l1,float f1) {
		System.out.println("In method 2");
		System.out.println(l1+f1);
	}
	public static void main(String[] args) {
//		display('A');
//		display(8,5.5f);   ambiguity
		
		display(8,9.8);
	}
}
