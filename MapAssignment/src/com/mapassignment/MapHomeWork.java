package com.mapassignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapHomeWork {
	public static void main(String[] args) {
		/*1.	WAP to copy all of the mappings from the specified HashMap to another map*/
		
		HashMap<Integer, String> hs3=new HashMap<Integer, String>();
		hs3.put(1, "India");
		hs3.put(2, "UK");
		hs3.put(3, "USA");
		hs3.put(4, "Russia");
		
		LinkedHashMap<Integer, String> map=new LinkedHashMap<Integer, String>();
		map.putAll(hs3);
		
		for(Map.Entry<Integer, String>e:map.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
//		2.	WAP to test a HashMap is empty or not
		System.out.println(map.isEmpty());
		
//		3.	WAP to test if a HashMap contains a mapping for the specified key
		System.out.println(map.containsKey(1));
		
//		4.	WAP to search for an element from HashMap using key
		System.out.println(map.get(3));
		
//		5.	WAP to test if a HashMap contains a mapping for the specified value
		System.out.println(map.containsValue("India"));
		
//		6.	WAP to remove an element from HashMap using key
		System.out.println(map.remove(4));
		
//		7.	WAP to empty Map. (Hint - Get keys and iterate through the keys to remove entries from Map)
//		for(Map.Entry<Integer, String>e:map.entrySet()) {
//			System.out.println(map.remove(e.getKey()));
//		}
		
		System.out.println(map);
		
//		8.	WAP to create a map using Custom class as key and any other JDK provided object as value
		HashMap<Employee, Integer> hmap=new HashMap<Employee, Integer>();
		
		hmap.put(new Employee(101, "Kunal", 17000.0), 1);
		hmap.put(new Employee(102, "Neha", 19000.0), 2);
		hmap.put(new Employee(103, "Maandar", 15000.0), 3);
		hmap.put(new Employee(104, "Abhi", 21000.0), 4);
		
		for(Map.Entry<Employee, Integer>e:hmap.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
		/*9.	WAP to create a map using Custom class as key and any other Custom class as value*/
		
		HashMap<Employee, Department> hmap2=new HashMap<Employee, Department>();
		hmap2.put(new Employee(101, "Kunal", 17000.0), new Department(11, "HR"));
		hmap2.put(new Employee(102, "Neha", 19000.0), new Department(12, "Finance"));
		hmap2.put(new Employee(103, "Maandar", 15000.0), new Department(11, "HR"));
		hmap2.put(new Employee(104, "Abhi", 21000.0), new Department(12, "Finance"));
		
		for(Map.Entry<Employee, Department>e:hmap2.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		/*10.	WAP to create a map which stores an arraylist as a value*/
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Red");
		list1.add("Blue");
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("White");
		list2.add("Black");
		
		HashMap<Integer, ArrayList<String>>hmap3=new HashMap<Integer, ArrayList<String>>();
		hmap3.put(1, list1);
		hmap3.put(2, list2);
		
//		11.	WAP to iterate the elements in the arraylist stored in the above Map.
		
		for(Map.Entry<Integer, ArrayList<String>>e:hmap3.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
//		12.	WAP to create a Map which stores another Map as a value.
		HashMap<Integer, String> hs4=new HashMap<Integer, String>();
		hs4.put(1, "India");
		hs4.put(2, "UK");
		
		HashMap<Integer, String> hs5=new HashMap<Integer, String>();
		hs5.put(3, "Russia");
		hs5.put(4, "USA");
		HashMap<Integer, HashMap<Integer, String>> hmap4=new HashMap<Integer, HashMap<Integer,String>>();
		hmap4.put(1, hs4);
		hmap4.put(2, hs5);
//		13.	WAP to iterate the elements in the Map stored in the above Map
		for(Map.Entry<Integer, HashMap<Integer, String>>e:hmap4.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
//		14.	WAP to get the portion of a HashMap whose keys are strictly less than a given key
		TreeMap<Integer, String> tmap1=new TreeMap<Integer, String>();
		tmap1.put(1, "Java");
		tmap1.put(3, "SQL");
		tmap1.put(4, "MongoDB");
		tmap1.put(5, "Spring");
		tmap1.put(6, "Angular");
		tmap1.put(8, "SpringBoot");
		tmap1.put(4, "c++");
		
		System.out.println(tmap1.lowerKey(4));
		
		/*15.	WAP to get the portion of this HashMap whose keys are less than 
		 * (or equal to, if inclusive is true) a given key*/
		
		System.out.println(tmap1.floorKey(4));
		
//		16.	WAP to get the least key strictly greater than the given key.
//		Return null if there is no such key
		System.out.println(tmap1.higherKey(4));
		
//		17.	WAP to get a key-value mapping associated with the greatest key strictly 
//		less than the given key. Return null if there is no such key
		
		System.out.println(tmap1.ceilingKey(4));
		
//		18.	WAP to get the greatest key strictly less than the given key. 
//		Return null if there is no such key.
		
		System.out.println(tmap1.lastEntry());
	}
}
