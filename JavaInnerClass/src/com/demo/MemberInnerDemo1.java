package com.demo;

class Outer{
	void outerMethod() {
		System.out.println("Outer method");
	}
	
	class Inner{
		
		void innerMethod() {
			System.out.println("Inner Method");
		}
		static void show() {
			System.out.println("static show()");
		}
	}
}
public class MemberInnerDemo1 {
	public static void main(String[] args) {
		Outer o1=new Outer();
		
		Outer.Inner i1=o1.new Inner();
		i1.innerMethod();
		
		Outer.Inner i2=new Outer().new Inner();
		i2.innerMethod();
		
		Outer.Inner.show();
	}
}
