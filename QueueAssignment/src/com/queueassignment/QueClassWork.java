package com.queueassignment;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueClassWork {
public static void main(String[] args) {
	//1.	WAP to create a Queue with Integer objects without using generics
	
	PriorityQueue pq=new PriorityQueue();
	pq.offer(101);
	pq.offer(102);
	pq.offer(103);
	
	System.out.println(pq);
	
	//2.	WAP to create a Queue with some colors (String) &amp; using generics
	
	ArrayDeque<String> colors=new ArrayDeque<String>();
	colors.offer("Red");
	colors.offer("Yellow");
	colors.offer("Blue");
	colors.offer("Green");
	colors.offer("Black");
	
	
	System.out.println(colors);
	//4.	Use 2 different method calls to add elements to a queue.
	
	colors.add("Pink");
	
	System.out.println(colors);
	
	//5.	WAP to check if a queue has values
	System.out.println(colors.isEmpty());
	
}
}
