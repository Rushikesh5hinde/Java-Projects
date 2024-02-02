package com.demo.method;

public class Method_Test_1 {
	//without return type,without parameter
	public static void show() {		//method declaration
		System.out.println("hello");
	}
	//without return type, with parameter
	public static void add(int a,int b) {
		System.out.println("Sum:"+(a+b));
	}
	public static void main(String[] args) {
		System.out.println("method demo");
		show();		//method calling
		
//		for(int i=1;i<=5;i++) {
//			show();
//		}
		add(12, 13);
	}
}
