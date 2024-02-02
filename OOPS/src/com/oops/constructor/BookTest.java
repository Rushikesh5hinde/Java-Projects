package com.oops.constructor;

public class BookTest {
	public static void main(String[] args) {
		Book b1=new Book(101,"Java",500);
		System.out.println(b1);
		
		
		System.out.println("hello"+10);//hello10
		System.out.println(10+20+"hello");//30hello
		System.out.println("hello"+10+20);//hello1020
		System.out.println("hello"+10*20);//hello200
		System.out.println(10-20+"hello");//-10hello
//		System.out.println("hello"+10-20);CTE
	}
}
