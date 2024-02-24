package com.queueassignment;

import java.util.ArrayDeque;

public class QueueHomeWork {
	public static void main(String[] args) {
		ArrayDeque<String> colors=new ArrayDeque<String>();
		colors.offer("Red");
		colors.offer("Yellow");
		colors.offer("Blue");
		colors.offer("Green");
		colors.offer("Black");
		colors.add("Safron");
		colors.add("Pink");
		colors.add("White");
		
		//1.	WAP to check the top element in a queue
		System.out.println(colors.peek());
		
		//2.	WAP to remove an element from a queue
		System.out.println(colors.poll());
		
		//3.	Use 2 different method calls to remove elements from a queue
		System.out.println(colors.removeFirst());
		System.out.println(colors.poll());
		
		//4.	WAP to attempt to remove non-existing elements from a queue
		System.out.println(colors.remove("Neon"));
		
		//5.	Use 2 different method calls to remove non-existing elements from a queue
		System.out.println(colors.remove("Neon"));
		System.out.println(colors.poll());
		
		
	}
}
