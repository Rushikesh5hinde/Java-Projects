package com.oops.oopsmethods;

public class CheckSquare {
	int num;
	
	public void displaySquare() {
		System.out.println("Square:"+(num*num));
	}
	public int showSquare() {
		return num*num;
	}
	public int isSquare(int n) {
		num=n;
		return num*num;
	}
	public void checkSquare(int n) {
		num=n;
		System.out.println("Cube:"+(num*num));
	}
}
