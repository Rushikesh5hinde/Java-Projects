package com.demo.method;

public class Method_Test_Power {
	public static int calSquare(int num) {
		return num*num;
	}
	public static int calCube(int num) {
		return num*num*num;
	}
	public static void showCubes(int range) {
		for(int i=1;i<=range;i++) {
			System.out.println(calCube(i));
		}
	}
	public static void main(String[] args) {
//		int i;
//		for(i=1;i<=10;i++) {
//			System.out.println(calSquare(i));
//			System.out.println(calCube(i));
//		}
		showCubes(10);
	}
}
