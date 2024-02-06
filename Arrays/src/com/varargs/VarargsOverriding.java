package com.varargs;
class Parent{
	
	void show(int ...a) {
		System.out.println("In parent");
	}
}
class Child extends Parent{
	@Override
	void show(int ...a) {
		System.out.println("In parent");
	}
}
public class VarargsOverriding {
	public static void main(String[] args) {
		Parent obj;
		Child c1=new Child();
		c1.show(1,2,3);
	}
}
