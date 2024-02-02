package com.oops.covarientreturntype;
class First{
	Number value;
//	Number displayValue() {
//		value=10;
//		return value;
//	}
	
	Object displayValue() {
		value=10;
		return value;
	}
}
class Second extends First{
	Integer myVal;
//	Number displayValue() {
//		myVal=20;
//		return myVal;
//	}
	Integer displayValue() {
		myVal=20;
		return myVal;
	}
}
class Third extends First{
	char ch;
	Object displayValue() {
		ch='A';
		return ch;
	}
}
public class CovarientWrapperDemo {
	public static void main(String[] args) {
		
		First f1=new First();
		System.out.println(f1.displayValue());
		
		First f;
		f=new Second();
//		System.out.println(((int)(f.displayValue())+10));
		
		Second s1=new Second();
		System.out.println(s1.displayValue()+10);
		
		
	}
}
