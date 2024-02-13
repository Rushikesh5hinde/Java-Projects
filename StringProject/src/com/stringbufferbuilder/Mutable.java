package com.stringbufferbuilder;

public class Mutable {
	public static void main(String[] args) {
		//mutable
		StringBuffer sb=new StringBuffer("Hello");
		sb.append("World");
		System.out.println(sb);//HelloWorld
		
		//Immutable
		String s=new String("Hello");
		s.concat("World");
		System.out.println(s);//Hello
	}
}
