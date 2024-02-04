package com.accesspackage1;
//check access modifier visibility in same class
public class Demo1 {
	private int a;
	int b;
	protected int c;
	public int d;
	
	private void test1() {
		System.out.println("private");
	}
	 void test2() {
		System.out.println("default");
	}
	 protected void test3() {
		 System.out.println("protected");
	 }
	 public void test4() {
		 System.out.println("public");
	 }
	 public static void main(String[] args) {
		Demo1 obj=new Demo1();
		
		obj.a=100;
		obj.b=10;
		obj.c=40;
		obj.d=30;
	}
}
