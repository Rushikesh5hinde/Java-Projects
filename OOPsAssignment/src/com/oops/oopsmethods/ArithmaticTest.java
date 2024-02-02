package com.oops.oopsmethods;

public class ArithmaticTest {
	public static void main(String[] args) {
		Arithmatic a1=new Arithmatic();
		a1.num1=20;
		a1.num2=10;
//		a1.add();
//		a1.subtract();
//		a1.multiply();
//		a1.divide();
		
//		System.out.println(a1.showAdd());
//		System.out.println(a1.showSubtract());
//		System.out.println(a1.showMultiply());
//		System.out.println(a1.showDivide());
		
//		System.out.println(a1.checkAdd(5, 4));
//		System.out.println(a1.checkSubtract(45, 15));
//		System.out.println(a1.checkMultiply(2, 3));
//		System.out.println(a1.checkDivide(2, 4));
		
		a1.addition(55, 55);
		a1.subtraction(35, 25);
		a1.multiplication(15, 15);
		a1.division(25, 13);
	}
}
