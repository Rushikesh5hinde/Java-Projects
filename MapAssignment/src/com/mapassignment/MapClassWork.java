package com.mapassignment;

import java.util.HashMap;
import java.util.Map;

public class MapClassWork {
	public static void main(String[] args) {
		/*WAP to add elements to a HashMap without using generics (ie do not use <>) 
		 * and print content of it. Use Integer as Key and String as Value. In second 
		 * HashMap add elements of String type as Key and Integer as Value*/
		
		HashMap hs=new HashMap();
		hs.put(1, "India");
		hs.put(2, "UK");
		hs.put(3, "USA");
		hs.put(4, "Russia");
		
		System.out.println(hs);
		
		/*2.	WAP add elements to HashMap without using generics, 0th location use String as key
		 *  and Integer as value, on 1st location use String as key String and Integer as value.*/
		HashMap hs2=new HashMap();
		hs2.put(1, "India");
		hs2.put(2, "UK");
		System.out.println(hs2);
		
		/*3.	WAP to add elements to a HashMap using generics with Integer as Key and String as value. 
		 * And 4 key-value Map.Entry*/
		HashMap<Integer, String> hs3=new HashMap<Integer, String>();
		hs3.put(1, "India");
		hs3.put(2, "UK");
		hs3.put(3, "USA");
		hs3.put(4, "Russia");
		
		for(Map.Entry<Integer, String> e:hs3.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
		/*4.	WAP to create a map using Wrapper class as key and value same as keys’ data type 
		 * WAP to count the number of key-value (size) mappings in a map.*/
		HashMap<String, String> hs4=new HashMap<String, String>();
		hs4.put("Kunal", "Present");
		hs4.put("Neha", "Absent");
		hs4.put("Prashant", "Present");
		hs4.put("Rohan", "Absent");
		int ct=0;
		
		/*5.	WAP to get all the entries from a HashMap. Iterate the entries and 
		 * print the Key & Value values*/
		for(Map.Entry<String, String> e:hs4.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
			ct++;
		}
		System.out.println("Count:"+ct);
		
//		6.	WAP to get only the Keys from a HashMap
		for(Map.Entry<String, String> e:hs4.entrySet()) {
			System.out.println(e.getKey());
			
		}
		
//		7.	WAP to get only the Values from a HashMap
		for(Map.Entry<String, String> e:hs4.entrySet()) {
			System.out.println(e.getValue());
			
		}
	}
}
