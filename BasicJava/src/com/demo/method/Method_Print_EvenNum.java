package com.demo.method;

public class Method_Print_EvenNum {
	
	public static boolean isEven(int num) {
		if(num%2==0) 
			return true;
		else
			return false;
	}
	public static void checkEven(int num) {
		if(num%2==0)
			System.out.println(num+" is Even");
		else
			System.out.println(num+" is Odd");
	}
	public static void checkOdd(int num) {
		if(num%2!=0)
			System.out.println(num+" is Odd");
		else
			System.out.println(num+" is Even");
	}
	public static void main(String[] args) {
//		System.out.println(isEven(5));
//		checkEven(4);
		checkOdd(5);
	}
}
