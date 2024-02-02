package com.oops.iibconstr;

public class A3 {
	int i;
	{
		System.out.println("IIB-1");
		i=100;
	}
	{
		System.out.println("IIB-2");
		System.out.println(i);//100
		i=200;
	}
	public static void main(String[] args) {
		System.out.println("main");
		A3 a=new A3();
		System.out.println(a.i);//200
		//main
		//IIB-1
		//IIB-2
		//100
		//200
	}
}
