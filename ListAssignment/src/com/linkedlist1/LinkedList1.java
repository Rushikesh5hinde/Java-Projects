package com.linkedlist1;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		
		for(Integer i:list) {
			System.out.println(i);
		}
		System.out.println("-------------------------");
		//1.	WAP to append the specified element to the end of a linked list.
		list.addLast(16);
		
		for(Integer i:list) {
			System.out.println(i);
		}
		System.out.println("---------------------------");
		//3.	WAP to iterate through all elements in a linked list starting at the specified position.
		for(int i=2;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-------------------------");
		
		//4.	WAP to iterate a linked list in reverse order.
		ListIterator<Integer>ltr=list.listIterator(list.size());
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
		System.out.println("-------------------------");
		//5.	WAP to insert the specified element at the specified position in the linked list.
		list.add(2, 33);
		for(Integer i:list) {
			System.out.println(i);
		}
		System.out.println("--------------------------");
		//6.	WAP to insert elements into the linked list at the first and last position.
		list.addFirst(45);
		list.addLast(90);
		for(Integer i:list) {
			System.out.println(i);
		}
		System.out.println("------------------------");
		//10.	WAP to get the first and last occurrence of the specified elements in a linked list.
		System.out.println(list.removeFirstOccurrence(10));
		System.out.println(list.removeFirstOccurrence(10));
		
		System.out.println("-----------------------------");
		//11.	WAP to display the elements and their positions in a linked list.
		for(int i=0;i<list.size();i++) {
			System.out.println(i+":"+list.get(i));
		}
		
//		ListIterator<Integer> ltr2=list.listIterator();
//		while(ltr2.hasNext()) {
//			System.out.println();
//		}
		System.out.println("-----------------------");
		//12.	WAP to remove a specified element from a linked list.
		for(Integer i:list) {
			System.out.println(i);
		}
		
		list.remove(1);
		System.out.println("-----------------------");
		for(Integer i:list) {
			System.out.println(i);
		}
		System.out.println("-----------------------");
		//13.	WAP to remove first and last element from a linked list.
		list.removeFirst();
		list.removeLast();
		for(Integer i:list) {
			System.out.println(i);
		}
		System.out.println("--------------------------");
		//14.	WAP to remove all the elements from a linked list.
		list.removeAll(list);
		System.out.println(list);
	}
}
