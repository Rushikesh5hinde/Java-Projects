package com.arraylistdemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		//size()--returns int value
		//isEmpty()---returns boolean value
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		list.add("Rakesh");
		list.add("Kunal");
		list.add("Abhi");
		list.add("Rekha");
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		System.out.println(list);
		
		list.add(1, "Mandar");//it will add element on given index without replacing element
		
		System.out.println(list);
		
		
		System.out.println(list.set(2, "Neha"));////it will replace element on given index
		
		System.out.println(list);
		
//		System.out.println(list.set(6, "Neha"));//throw ArrayIndexOutOfBound if index is not present
//		
//		System.out.println(list);
		
		//contains()----return boolean
		
		System.out.println(list.contains("Kunal"));
		System.out.println(list.contains("Rakesh"));
		
		System.out.println("-----------------------------");
		System.out.println(list);
		System.out.println(list.remove("Rakesh"));//return true if element is present and remove
		System.out.println(list);
		
		System.out.println(list.remove("Jack"));//return false if element is not present
		System.out.println(list);
		
		System.out.println("--------------------------------");
		
		System.out.println(list.add("Smith"));
		System.out.println(list);
	}
}
