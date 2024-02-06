package com.varargs;

public class VaragsRulesDemo {
	//Rule 1: we can have only 1 varags in method
	
//	static void display(int ...a,String ...s) {		CTE
//		
//	}
	
	//Rule 2:varags should be last argument in method
//	static void method2(int n1,int ...n2,int a) {	CTE
//		
//	}
	static void method1(int n1,int n2,int ...a) {
		System.out.println(n1);
		System.out.println(n2);
		
		for(int x:a) {
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		
	}
}
