package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateArrayList {
	public static void main(String[] args) {
		List<String> al=new ArrayList<>();
		
		al.add("Shreyash");
		al.add("Akshata");
		al.add("Mandar");
		al.add("Gunjan");
		
		//1st way:
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("-------------------------");
		//2nd way:
		
		for(String s:al) {
			System.out.println(s);
		}
		System.out.println("-------------------------");
		
		//3rd way:forward
		
		Iterator<String> itr=al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-------------------------");
		
		//4th way:forward
		
		ListIterator<String> litr=al.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		
		System.out.println("-------------------------");
		
		//5th way:backward
		
		ListIterator<String> litr2=al.listIterator(al.size());
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
	}
}
