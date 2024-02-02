package com.oops.inheritance;
//same package same class
//all access modifiers are accessible
public class AccessDemo {
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
		AccessDemo obj=new AccessDemo();
		
		obj.a=100;
		obj.b=100;
		obj.c=100;
		obj.d=100;
		
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
	}
}
