package com.oops.classobject;

class Calculator{
	public int add(int a,int b) {
		return a+b;
	}
	public int subtract(int a,int b) {
		return a-b;
	}
	public int multiply(int a,int b) {
		return a*b;
	}
	public int division(int a,int b) {
		return a/b;
	}
}
public class CalTest {
	public static void main(String[] args) {
		Calculator c1=new Calculator();
		System.out.println(c1.add(10, 20));
		System.out.println(c1.subtract(10, 20));
		System.out.println(c1.multiply(10, 20));
		System.out.println(c1.division(10, 20));
	}
}
