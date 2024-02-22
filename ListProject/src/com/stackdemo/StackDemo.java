package com.stackdemo;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String>names=new Stack<String>();
		
		names.push("Kunal");
		names.push("Neha");
		names.push("Dinesh");
		
		System.out.println(names);
		
		System.out.println(names.peek());
		
		System.out.println(names);
		
		System.out.println(names.pop());
		
		System.out.println(names);
		
		System.out.println(names.search("Neha"));
		System.out.println(names.search("Rahul"));
	}
}
