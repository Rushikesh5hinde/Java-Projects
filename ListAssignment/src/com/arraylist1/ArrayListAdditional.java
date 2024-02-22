package com.arraylist1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListAdditional {
	/*5.	Create arraylist of characters. Remove duplicate characters from the list. 
	 * 		E.g. list – { ‘d’ , ‘g’ , ‘h’ , ‘d’ , ‘d’ . ‘h’ , ‘g’}Output should be {‘d’ , ‘g’ , ‘h’}*/
	static void removeDuplicates(ArrayList<Character>ch) {
		for(int i=0;i<ch.size();i++) {
			
			for(int j=i+1;j<ch.size();j++) {
				
				if(ch.get(i)==ch.get(j)) {
					
					ch.remove(j);
					j--;
				}
			}
		}
	}
	static void removeDuplicate(ArrayList<Character>ch,ArrayList<Character>ch2) {
		Iterator<Character>itr=ch.iterator();
		
		int i=0;
		while(itr.hasNext()) {
			Character c1=itr.next();
			ListIterator<Character>ltr=ch.listIterator(i+1);
			while(ltr.hasNext()) {
				Character c2=ltr.next();
				if(c1==c2) {
					ch2.remove(i);
					break;
//					ltr.remove();
				}
			}
			i++;
		}
	}
	/*3.	Create arraylist of string. Add 7 days to list 
	( Monday , Sunday etc) Remove elements from list for which string length is more than 7	*/
	
	static void printDays(ArrayList<String> s) {
		ListIterator<String>itr=s.listIterator();
		while(itr.hasNext()) {
			if(itr.next().length()>7)
			itr.remove();
		}
	}
	static void showArrayList(ArrayList<String> s) {
		for(String str:s) {
			System.out.println(str);
		}
	}
	public static void main(String[] args) {
		ArrayList<String>days=new ArrayList<String>();
		days.add("Sunday");
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		
		showArrayList(days);
		System.out.println("------------------------------------");
		printDays(days);
		showArrayList(days);
		
		ArrayList<Character>ch=new ArrayList<Character>();
		ch.add('d');
		ch.add('g');
		ch.add('h');
		ch.add('d');
		ch.add('d');
		ch.add('h');
		ch.add('g');
		
		System.out.println(ch);
		System.out.println("---------------");
//		removeDuplicate(ch);
		System.out.println(ch);
		
		ArrayList<Character>ch2=new ArrayList<Character>(ch);
		removeDuplicate(ch, ch2);
		System.out.println(ch2);
	}
}
