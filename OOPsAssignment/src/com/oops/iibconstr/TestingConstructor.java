package com.oops.iibconstr;

public class TestingConstructor {
	void TestingConstructor() {		//method
		System.out.println("Amsterdam");
	}
	TestingConstructor(){			//constructor
		System.out.println("Antarctica");
	}
	public static void main(String[] args) {
		TestingConstructor tc=new TestingConstructor();//antarctica
	}
}
