package com.stringbufferbuilder;

public class CapacityDemo {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("Hello");
		System.out.println(sb.capacity());//16
		
		StringBuilder sb1=new StringBuilder("Hello");
		System.out.println(sb1.capacity());//16+5=21
		
		StringBuffer sb2=new StringBuffer(5);
		sb2.append("Java");
		System.out.println(sb2.capacity());//5
		
		sb2.append("SQL");
		System.out.println(sb2.capacity());//(5*2)+2=12
	}
}
