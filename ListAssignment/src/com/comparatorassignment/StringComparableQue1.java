package com.comparatorassignment;

import java.util.ArrayList;
import java.util.Collections;

public class StringComparableQue1{
	static void showArrayList(ArrayList<String> names) {
		for(String n:names) {
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Kunal");
		names.add("Neha");
		names.add("Pranav");
		names.add("Ganesh");
		names.add("Mohini");
		names.add("Dinesh");
		names.add("Rekha");
		names.add("Pooja");
		
		showArrayList(names);
		System.out.println("----------------");
		Collections.sort(names);
		showArrayList(names);
	}

	
}
