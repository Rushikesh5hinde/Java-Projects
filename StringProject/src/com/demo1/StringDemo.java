package com.demo1;

public class StringDemo {
	public static void main(String[] args) {
		
		//using literals
		//id same hash code same
		//created in SCP
		
		String s1="java";//java id=23
		System.out.println(s1.hashCode());//3254818 
		String s2="java";//java id=23
		System.out.println(s2.hashCode());//3254818 
		
		//using new keyword
		//id different hash code same
		//id created in heap and object created in SCP
		
		String s3=new String("java");//java id=34
		System.out.println(s3.hashCode());//3254818 
		
		String s4=new String("code");//java id=35
		System.out.println(s4.hashCode());//3059181
		
		String s5=new String("code");//java id=36
		System.out.println(s5.hashCode());//3059181
		
		
	}
}
