package com.arraylist1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

//1.	WAP to add elements to arraylist without using generics (no <>) and 
//print content of it where Integer is used. In second arraylist String is used.
public class Que1 {
	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		
		list1.add(101);
		list1.add("Rahul");
		list1.add("HR");
		list1.add(25000);
		
		System.out.println(list1);
		
		//2.	WAP add elements to arraylist without using generics, 
		//0th location keep Integer, 1st location String now print each element and display contents
		
		ArrayList list2=new ArrayList();
		list2.add(0, 102);
		list2.add(1, "Neha");
		
		System.out.println(list2);
		
		//3.	WAP to use add operation of ArrayList
		
		ArrayList<String>comp=new ArrayList<String>();
		comp.add("TCS");
		comp.add("Infosys");
		comp.add("Wipro");
		comp.add("Dell");
		
		System.out.println(comp);
		
		//4.	WAP to print all elements of ArrayList using iterator
		
		Iterator<String> itr=comp.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//5.	WAP to iterate through all elements in an ArrayList using for loop
		
		for(int i=0;i<comp.size();i++) {
			System.out.println(comp.get(i));
		}
		
		//6.	WAP to iterate through all elements in an ArrayList using for each
		for(String s:comp) {
			System.out.println(s);
		}
		
		//7.	WAP to create a new ArrayList, add some colors (string) and print the collection.
		ArrayList<String>colors=new ArrayList<String>();
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Green");
		colors.add("White");
		
		System.out.println(colors);
		
		//8.	WAP to remove element from ArrayList
		colors.remove(2);
		System.out.println(colors);
		
		//9.	WAP to remove all elements from ArrayList
//		colors.removeAll(colors);
		
		//10.	WAP to retain all elements from ArrayList
		colors.retainAll(colors);
		System.out.println(colors);
		
		//11.	WAP to know how many elements in ArrayList
		System.out.println(colors.size());
		
		//12.	WAP to test an ArrayList is empty or not
		System.out.println(colors.isEmpty());
		
		//13.	WAP to empty ArrayList
//		colors.removeAll(colors);
		
//		14.	WAP to search an element from ArrayList
		System.out.println(colors.contains("Red"));
		
		//15.	WAP to search the specified collection in this collection
		
		ArrayList<String> color2=new ArrayList<String>();
		color2.add("Red");
		color2.add("White");
		
		System.out.println(colors);
		System.out.println(colors.containsAll(color2));
		
//		16.	WAP to retrieve an element (at a specified index) from a given ArrayList
		System.out.println(colors.get(0));
		
//		17.	WAP to insert an element into the ArrayList at the first position
		colors.add(1, "Black");
		
		//18.	WAP to add 1 to 50 numbers in ArrayList and print only even numbers (using iterator)
		ArrayList<Integer> num=new ArrayList<Integer>();
		
		for(int i=1;i<=50;i++) {
			num.add(i);
		}
//		for(Integer i:num) {
//			System.out.print(i+" ");
//		}
		Iterator<Integer> numitr=num.iterator();
		while(numitr.hasNext()) {
			Integer a=numitr.next();
			if(a%2==0) {
				System.out.println(a);
			}
		}
		System.out.println("---------------------------");
		ListIterator<Integer> litr=num.listIterator();
		while(litr.hasNext()) {
			Integer a=litr.next();
			if(a%2==0) {
				System.out.println(a);
			}
		}
		System.out.println("-------------------------------");
		ListIterator<Integer> litr2=num.listIterator(num.size());
		while(litr.hasPrevious()) {
			Integer a=litr.previous();
			if(a%2==0) {
				System.out.println(a);
			}
		}
		
		//19.	WAP to match two collections
		
		ArrayList<Integer> id1=new ArrayList<Integer>();
		id1.add(1);
		id1.add(2);
		id1.add(3);
		id1.add(4);
		
		ArrayList<Integer> id2=new ArrayList<Integer>();
		id2.add(1);
		id2.add(2);
		id2.add(3);
		id2.add(4);
		
		System.out.println(id1.containsAll(id2));
		
		//20.	WAP to check if collection is empty
		
		System.out.println(id1.isEmpty());
		
		//21.	WAP to convert collection into array
		
		//type unsafe
		Object[] obj=id1.toArray();
		//type safe
		Integer[] arr=new Integer[id1.size()];
		id1.toArray(arr);
		
		//22.	WAP of swap two elements in an ArrayList
		System.out.println(id1);
//		Collections.swap(id1, 0, 3);
//		System.out.println(id1);
		
//		Integer temp=id1.get(3);
//		id1.set(3, id1.get(0));
//		id1.set(0, temp);
		
		System.out.println(id1);
		
		//23.	WAP to replace the second element of an ArrayList with the specified element
		id1.set(2, 10);
		System.out.println(id1);
	}
}
