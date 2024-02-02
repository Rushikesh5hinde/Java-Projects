package com.oops.oopsmethods;

public class Arithmatic {
	int num1;
	int num2;
	
	public void add() {
		System.out.println("Sum:"+(num1+num2));
	}
	public void subtract() {
		System.out.println("Subtraction:"+(num1-num2));
	}
	public void multiply() {
		System.out.println("Multiplication:"+(num1*num2));
	}
	public void divide() {
		System.out.println("Division:"+(num1/num2));
	}
	public int showAdd() {
		return num1+num2;
	}
	public int showSubtract() {
		return num1-num2;
	}
	public int showMultiply() {
		return num1*num2;
	}
	public int showDivide() {
		return num1/num2;
	}
	public int checkAdd(int n1,int n2) {
		num1=n1;
		num2=n2;
		return num1+num2;
	}
	public int checkSubtract(int n1,int n2) {
		num1=n1;
		num2=n2;
		return num1-num2;
	}
	public int checkMultiply(int n1,int n2) {
		num1=n1;
		num2=n2;
		return num1*num2;
	}
	public int checkDivide(int n1,int n2) {
		num1=n1;
		num2=n2;
		return num1/num2;
	}
	public void addition(int n1,int n2) {
		num1=n1;
		num2=n2;
		System.out.println("addition:"+(num1+num2));
	}
	public void subtraction(int n1,int n2) {
		num1=n1;
		num2=n2;
		System.out.println("subtraction:"+(num1-num2));
	}
	public void multiplication(int n1,int n2) {
		num1=n1;
		num2=n2;
		System.out.println("multiplication:"+(num1*num2));
	}
	public void division(int n1,int n2) {
		num1=n1;
		num2=n2;
		System.out.println("division:"+(num1/num2));
	}
	
}
