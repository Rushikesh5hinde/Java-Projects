package com.linkedlistdemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterate {
	public static void main(String[] args) {
		LinkedList<String> fruits=new LinkedList<String>();
		fruits.addFirst("Mango");
		fruits.add("Pinapple");
		fruits.add("Apple");
		fruits.add("Watermelon");
		fruits.add("Orange");
		
		System.out.println(fruits);
		
		for(int i=0;i<fruits.size();i++) {
			System.out.println(fruits.get(i));
		}
		System.out.println("------------------------");
		for(String s:fruits) {
			System.out.println(s);
		}
		System.out.println("------------------------");
		Iterator<String> itr=fruits.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------------------------");
		Iterator<String> itr2=fruits.descendingIterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("------------------------");
		ListIterator<String> litr=fruits.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("------------------------");
		ListIterator<String> litr2=fruits.listIterator(fruits.size());
		while(litr2.hasPrevious()) {
			System.out.println(litr2.previous());
		}
	}
}
