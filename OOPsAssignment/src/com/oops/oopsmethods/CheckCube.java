package com.oops.oopsmethods;

public class CheckCube {
	int num;
	
	public void displayCube() {
		System.out.println("Cube:"+(num*num*num));
	}
	public int showCube() {
		return num*num*num;
	}
	public int isCube(int n) {
		num=n;
		return num*num*num;
	}
	public void checkCube(int n) {
		num=n;
		System.out.println("Cube:"+(num*num*num));
	}
	
}
