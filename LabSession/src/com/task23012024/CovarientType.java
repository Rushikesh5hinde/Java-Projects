package com.task23012024;
class A{
	public A display() {
		return new A();
	}
}
class B extends A{
//	public A display() {
//		return new B();
//	}
	public B display() {
		return new B();
	}
}
public class CovarientType {
	public static void main(String[] args) {
		B obj=new B();
//		B b1=(B)obj.display();
		B b1=obj.display();
	}
}
