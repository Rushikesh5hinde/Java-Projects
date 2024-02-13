package com.stringbufferbuilder;

public class StringBufferMethods {
	public static void main(String[] args) {
		//no concat method
		
		StringBuffer sb=new StringBuffer();
		sb.append("Programming");
		sb.reverse();
		System.out.println(sb);
		
		String s="Java is fun";
		StringBuilder sb2=new StringBuilder(s);
		sb2.reverse();
		System.out.println(sb2);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.replace(2, 5, "Java");
		System.out.println(sb);
		
		sb.insert(1, "Code");
		System.out.println(sb);
		
		sb.delete(1, 3);
		System.out.println(sb);
		
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
		
		System.out.println(sb.length());
		System.out.println(sb.charAt(0));
		
		System.out.println(sb.indexOf("Java"));
		
		sb.setCharAt(1, 'P');
		System.out.println(sb);
	}
}
