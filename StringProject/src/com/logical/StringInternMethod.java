package com.logical;

public class StringInternMethod {
	public static void main(String[] args) {
		String s1="java";
		String s2="java";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println("---------------");
		String s3=new String("java");
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println("---------------");
		String s4=new String("java");
		s4=s4.intern();
		System.out.println(s4==s1);
		System.out.println(s4.equals(s1));
		System.out.println("---------------");
		
		String str2="java";
		str2=str2.concat("Programs");
		
		String str3="javaPrograms";
		
		str2=str2.intern();
		System.out.println(str2==str3);
		System.out.println(str2.equals(str3));
	}
}
