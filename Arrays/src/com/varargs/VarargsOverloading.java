package com.varargs;

public class VarargsOverloading {
	static void display(int ...a1) {
		System.out.println("in int");
		for(int x:a1) {
			System.out.println(x);
		}
	}
	static void display(double ...a1) {
		System.out.println("in double");
		for(double x:a1) {
			System.out.println(x);
		}
	}
	//ambiguity
	static void displayMe(int x,char ...ch) {
		System.out.println(x);
		for(char c:ch) {
			System.out.println(c);
		}
	}
	static void displayMe(char ch,int ...x) {
		System.out.println(ch);
		for(int i:x) {
			System.out.println(i);
		}
	}
	//ambiguity
//	static void display(Integer ...a2) {
//		
//	}
	static void show(Integer ...a2) {
		System.out.println("in wrapper int");
		for(int x:a2) {
			System.out.println(x);
		}
	}
	static void show(Character ...ch2) {
		System.out.println("in wrapper ch");
		
	}
	public static void main(String[] args) {
		display(1,2,3);
		display(3.3,2.2,1.5);
		System.out.println("--------------");
//		displayMe(4, 5);	ambiguity
		displayMe('a', 'b',8);    
		displayMe(8,'a', 'b');
		System.out.println("---------------");
		show(4,5,6);
	}
}
