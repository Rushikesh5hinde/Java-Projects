package com.demo1;

public class EqualityCheck {
	public static void main(String[] args) {
		String s1="java";
		String s2="java";
		
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));//true
		
		System.out.println("------------------------");
		
		String s3=new String("java");
		
		System.out.println(s2==s3);//false
		System.out.println(s2.equals(s3));//true
	}
}
