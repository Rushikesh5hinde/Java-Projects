package com.varargs;

public class VaragsWrapper {
	public static void display(Object ...s) {
		System.out.println("in object");
		for(Object x:s) {
			System.out.println(x);
		}
	}
	public static void display(Number ...s) {
		System.out.println("in Number");
		for(Number x:s) {
			System.out.println(x);
		}
	}
	public static void display(Double ...s) {
		System.out.println("in Double");
		for(Double x:s) {
			System.out.println(x);
		}
	}
	public static void display(Character ...s) {
		System.out.println("in Character");
		for(Character x:s) {
			System.out.println(x);
		}
	}
	public static void display(Integer ...s) {
		System.out.println("in Integer");
		for(Integer x:s) {
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		display(1.1f,2.2f);    // Float:Number:Object
		display('A','B','C');  //Character:Object
	}
}
