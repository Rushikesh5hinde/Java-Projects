package com.revision;
class Flower{
	void m1() {
		System.out.println("m1()");
	}
	static void m2() {
		System.out.println("m2()");
	}
	void m4() {
		System.out.println("m4()");
	}
}
class Rose extends Flower{
	void m1() {
		System.out.println("child m1()");
	}
	void m3() {
		System.out.println("child m3()");
	}
}
public class DynamicDispatchDemo {
	public static void main(String[] args) {
		Flower f1;
		f1=new Rose();
		
		f1.m1();
		f1.m2();	//warning:access in static way
//		f1.m3();
		f1.m4();
	}
}
