package com.arraylistdemo;

import java.util.ArrayList;

public class NonGeneric {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		
		list.add(10);
		list.add("Rushi");
		list.add(94.5f);
		list.add('A');
		
		System.out.println(list);
		System.out.println("--------------------------");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			int data=(int)list.get(i)+10;//ClassCastExeption
			list.set(i, data);
		}
		System.out.println("--------------------------");
	}
}
