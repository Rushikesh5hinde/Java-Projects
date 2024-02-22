package com.vectordemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorIterate {
	public static void main(String[] args) {
		Vector<Integer>num=new Vector<Integer>();
		
		num.add(10);
		num.add(20);
		num.add(10);
		num.add(null);
		num.add(-30);
		num.add(40);
		
		System.out.println(num);
		
		for(int i=0;i<num.size();i++) {
//			System.out.println(num.get(i));
			System.out.println(num.elementAt(i));
		}
		
		System.out.println("--------------------");
		
		for(Integer i:num) {
			System.out.println(i);
		}
		
		System.out.println("--------------------");
		Iterator<Integer> itr=num.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("--------------------");
		ListIterator<Integer> ltr1=num.listIterator();
		while(ltr1.hasNext()) {
			System.out.println(ltr1.next());
		}
		System.out.println("----------------------");
		ListIterator<Integer> ltr2=num.listIterator(num.size());
		while(ltr2.hasPrevious()) {
			System.out.println(ltr2.previous());
		}
		System.out.println("----------------------");
		
		Enumeration<Integer> etr=num.elements();
		while(etr.hasMoreElements()) {
			System.out.println(etr.nextElement());
		}
	}
}
