package com.demo1;

public class CompairToMethod {
	public static void main(String[] args) {
		//compare lexicographically
		//compares the unicode of characters
		//if two string content are exactly same then returns 0
		
		String s1="Abha";
		String s2="Abha";
		System.out.println(s1.compareTo(s2));//0
		System.out.println(s2.compareTo(s1));//0
		
		String s3="Rahul";
		String s4="rahul";
		System.out.println(s3.compareTo(s4));//-32
		System.out.println(s4.compareTo(s3));//32
	}
}
