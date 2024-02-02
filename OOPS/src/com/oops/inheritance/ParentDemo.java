package com.oops.inheritance;
class Parent1{
	
	String msg;
	public Parent1() {
		msg="Hello";
	}
	public Parent1(String msg) {
		this();
		this.msg="Hello";
	}
	void display() {
		System.out.println("Msg:"+msg);
	}
}
class Child1 extends Parent1{
	String value;
	int data;
	String msg="Bye";
	public Child1() {
		super();
	}
	public Child1(String msg,String value,int data) {
		super(msg);
		this.value=value;
		this.data=data;
	}
	void display() {
		String msg="Hii";
		System.out.println(msg);
		System.out.println(this.msg);
		System.out.println(super.msg);
	}
}
public class ParentDemo {
	public static void main(String[] args) {
		Child1 obj=new Child1();
		obj.display();
	}
	
}
