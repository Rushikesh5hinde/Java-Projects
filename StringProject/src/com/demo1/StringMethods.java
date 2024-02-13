package com.demo1;

public class StringMethods {
	public static void main(String[] args) {
		String str="java is fun.";
		System.out.println(str.length());//12
		
		//charAt
		System.out.println(str.charAt(1));//a
		System.out.println(str.charAt(str.length()-1));//.
		
		//concat , +
		String s1="Hello";
		String s2="World";
		//2 different object will be created "HelloWorld" in heap only
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		//substring
		
		System.out.println(str.substring(1));//print from 1 till length
		System.out.println(str.substring(1, 6));//print from 1 to 5
		
		//contains
		
		System.out.println(str.contains("ava"));//true
		System.out.println(str.contains("orl"));//false
		
		String w1="Hi";
		String w2="hi";
		
		System.out.println(w1==w2);//false
		System.out.println(w1.equals(w2));//false
		
		System.out.println(w1.equalsIgnoreCase(w2));//true
		
		//uppercase
		
		System.out.println(str.toUpperCase());
		
		//lowercase
		System.out.println(str.toLowerCase());
		
		//indexOf, lastIndexOf
		
		System.out.println(str.indexOf('a'));//first occurance
		System.out.println(str.lastIndexOf('a'));//last occurance
		
		System.out.println(str.indexOf("fun"));
		
		//isEmpty isBlank
		
		String str1="    ";
		System.out.println(str1.isBlank());//true
		System.out.println(str1.isEmpty());//false
		
		//trim-->only remove leading and trailing spaces 
		String st="  j ava  ";
		System.out.println(st+st.length());
		
		st=st.trim();
		System.out.println(st+st.length());
		
		//replace
		
		System.out.println(st.replace('a', 'z'));
		System.out.println(st);
	}
}
