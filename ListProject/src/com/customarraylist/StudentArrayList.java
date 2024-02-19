package com.customarraylist;

import java.util.ArrayList;
import java.util.Collections;

public class StudentArrayList {
	public static void main(String[] args) {
		ArrayList<Student> slist=new ArrayList<Student>();
		
		slist.add(new Student(1, "Akash", 90.5));
		slist.add(new Student(2, "Shreyash", 90.5));
		slist.add(new Student(3, "Rahul", 89.3));
		slist.add(new Student(4, "Bharat", 90.5));
		slist.add(new Student(5, "Onkar", 87.6));
		slist.add(new Student(6, "Rushikesh", 94.5));
		
//		System.out.println(slist);
		
		for(Student s:slist) {
			System.out.println(s);
		}
		System.out.println("--------------------------------");
		
		Collections.sort(slist);
		for(Student s:slist) {
			System.out.println(s);
		}
	}
}
