package com.oops.classobject;
//two classes in same file
//public access modifier which class has main method(executable class)

//compilable class
class MathDemo {
	//instance method
	public int findSquare(int n) {
		return n*n;
	}
	//instance method
	public int findCube(int n) {
		return n*n*n;
	}
}
//executable class
public class MathTest {
	public static void main(String[] args) {
		MathDemo m1=new MathDemo();
		int sq=m1.findSquare(5);
		System.out.println(sq);
		int cube=m1.findCube(5);
		System.out.println(cube);
	}
}
