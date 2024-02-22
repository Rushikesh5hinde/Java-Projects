package com.linkedlistdemo;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> comp=new LinkedList<String>();
		//when list is empty
//		System.out.println(comp.getFirst());	java.util.NoSuchElementException
		
		System.out.println(comp.peekFirst());//null
		
//		System.out.println(comp.removeFirst());	java.util.NoSuchElementException
		
		System.out.println(comp.pollFirst());//null
		
		comp.add("Capgemini");
		comp.addFirst("TCS");
		System.out.println(comp.offerFirst("HCL"));
		comp.add(1, "Infosys");
		comp.addLast("Wipro");
		
		System.out.println(comp);
		
		System.out.println(comp.getFirst());
		System.out.println(comp.element());
		
		System.out.println(comp.getLast());
		
		System.out.println("---------------------------------------");
		System.out.println(comp.remove());
		System.out.println(comp.remove(2));
		
	}
}
