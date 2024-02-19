package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
	static void reverseList(ArrayList<Double> al) {
		int j=al.size()-1;
		for(int i=0;i<al.size();i++) {
			if(i<j) {
				double temp=al.get(i);
				al.set(i, al.get(j));
				al.set(j, temp);
			}
			j--;
		}
	}
	public static void main(String[] args) {
		
		ArrayList<Double> marks=new ArrayList<Double>();
		
		marks.add(90.8);
		marks.add(40.2);
		marks.add(78.0);
//		marks.add(null);
		marks.add(56.4);
		marks.add(56.4);
		marks.add(87.5);
		marks.add(92.6);
		
		System.out.println("Before:"+marks);
		reverseList(marks); 
//		Collections.reverse(marks);
		System.out.println("After:"+marks);
	}
}
