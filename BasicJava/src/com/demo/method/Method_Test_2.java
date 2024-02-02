package com.demo.method;

public class Method_Test_2 {
	//with return type,with parameter
	public static int add(int a,int b) {
//		return a+b;
		int sum=a+b;
		return sum;
	}
	public static int sendAge() {
		int age=10;
		return age;
	}
	//with return type,without parameter
	public static String display() {
		return "hello";
	}
	public static void main(String[] args) {
		int sum=add(10, 20);
		System.out.println(sum);
		System.out.println(display());
		int age=sendAge();
		System.out.println(age);
		
		double age1=sendAge();//implicit typecasting
		short age2=(short) sendAge();//explicit typecasting
	}
}
