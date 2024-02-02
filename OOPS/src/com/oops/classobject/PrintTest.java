package com.oops.classobject;

public class PrintTest {
	//instance method
	public void printMessage(String name) {
		System.out.println("Good afternoon "+name);
	}
	//main method
	public static void main(String[] args) {
		//object creation
		
		//without ref
		new PrintTest().printMessage("Rushikesh");
		
		//with ref
		PrintTest p1=new PrintTest();
		p1.printMessage("Rushi");
	}
}
