package com.linkedlist1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListAdditional {
	static void showLinkedList(LinkedList<Integer>list) {
		for(Integer i:list) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		LinkedList<Integer>list=new LinkedList<Integer>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(60);
		list.add(50);
		list.add(80);
		
		//1.	WAP to shuffle the elements in a linked list.
		
		showLinkedList(list);
//		Collections.shuffle(list);
		System.out.println("---------------------");
		showLinkedList(list);
		System.out.println("---------------------");
//		2.	WAP to join two linked lists.
		LinkedList<Integer>list2=new LinkedList<Integer>();
		list2.add(101);
		list2.add(102);
		
		showLinkedList(list2);
		System.out.println("----------------");
		list2.addAll(list);
		showLinkedList(list2);
		System.out.println("----------------");
		
		//4.	WAP to remove and return the first element of a linked list.
		System.out.println(list.removeFirst());
		System.out.println("---------------------");
		//5.	WAP to retrieve but does not remove, the first element of a linked list.
		System.out.println(list.peek());
		System.out.println(list);
		System.out.println("---------------------");
		//6.	WAP to retrieve but does not remove, the last element of a linked list.
		System.out.println(list.peekLast());
		System.out.println(list);
		System.out.println("----------------------");
		//7.	WAP to check if a particular element exists in a linked list.
		System.out.println(list.contains(60));
		System.out.println("------------------------");
		//8.	WAP to convert a linked list to array list.
		
		ArrayList<Integer> ar=new ArrayList<Integer>(list);
		System.out.println(ar);
		
		//9.	WAP to compare two linked lists.
		
		System.out.println(list);
		System.out.println(list2);
		System.out.println(list.containsAll(list2));
		System.out.println(list.equals(list2));
		
		System.out.println("------------------------");
		//10.	WAP to test a linked list is empty or not.
		System.out.println(list2.isEmpty());
		//11.	WAP to replace an element in a linked list.
		System.out.println(list2.set(1, 220));
		System.out.println(list2);
		
		System.out.println("------------------------");
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		
		LinkedList<Integer> l2=new LinkedList<Integer>();
		l2.add(10);
		l2.add(30);
		l2.add(20);
		l2.add(40);
		
		System.out.println(l1.containsAll(l2));
		System.out.println(l1.equals(l2));
		
		System.out.println("----------------");
		
		//3.	WAP to clone a linked list to another linked list.
		LinkedList<Integer> l3=(LinkedList<Integer>) l2.clone();
		System.out.println(l3);
	}
}
