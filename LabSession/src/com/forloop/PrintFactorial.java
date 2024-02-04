package com.forloop;

public class PrintFactorial {
	public static void main(String[] args) {
		int i;
		long fact=1;
		for(i=5;i>0;i--) {
			fact=fact*i;
		}
		System.out.println("Factorial:"+fact);
	}
}
