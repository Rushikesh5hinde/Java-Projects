package com.demo1;

public class StringImmutable {
	public static void main(String[] args) {
		String s1="java";
		System.out.println(s1.hashCode());//3254818
		//when a string object is returned then the object is only 
		//created in heap not in SCP
		s1.concat("Programs");
		System.out.println(s1);//java
		
		String s2="java";
		s2=s2.concat("Programs");//here object first created in heap and then it will stored in heap
		System.out.println(s2);//javaPrograms
		System.out.println(s2.hashCode());//707624625
		
		String s3="javaPrograms";
		System.out.println(s3.hashCode());//707624625
		System.out.println("--------------------------");
		
		System.out.println(s2==s3);//false-->it checks or compare references
		System.out.println(s2.equals(s3));//true-->it checks values or content
	}
}
