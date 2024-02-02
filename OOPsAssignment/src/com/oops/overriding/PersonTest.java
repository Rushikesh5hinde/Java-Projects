package com.oops.overriding;
class Person{
	void readScript() {
		System.out.println("provide details");
	}
}
class Actor extends Person{
	@Override
	void readScript() {
		System.out.println("Actor is reading a script");
	}
}
public class PersonTest {
	public static void main(String[] args) {
		Person p;
		p=new Actor();
		p.readScript();
	}
}
