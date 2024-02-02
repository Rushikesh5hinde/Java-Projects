package com.oops.iibconstr;

public class A2 {
	{
		System.out.println(1);
	}
	public A2()
	{
		System.out.println(2);
	}
	public static void main(String[] args) {
		System.out.println(3);
		A2 a=new A2();
		//3
		//1
		//2
	}
}
