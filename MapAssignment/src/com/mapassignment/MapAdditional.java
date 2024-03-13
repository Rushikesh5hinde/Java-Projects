package com.mapassignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*1.	Create class Department (contains id, name, listofStudents)
a.	Create class Student (contains rollNo and Name)
b.	Create 4 Departments objects with different ids and add n number (atleast 4) of Students to each of the dept.
c.	Create a Map to add all the 4 Department objects with Dept id as key and Dept obj as  

d.	Now iterate through each of the dept, print its id and name and the Students within it (ie the rollNo and name).
*/
public class MapAdditional {
	public static void main(String[] args) {
		Student s1=new Student(101, "Kunal");
		Student s2=new Student(102, "Medha");
		Student s3=new Student(103, "Ravi");
		Student s4=new Student(104, "Bharat");
		
		ArrayList<Student> list1=new ArrayList<Student>();
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		
		ArrayList<Student> list2=new ArrayList<Student>();
		list2.add(s2);
		list2.add(s3);
		list2.add(s4);
		
	
		Dept d1=new Dept(1, "Science", list1);
		Dept d2=new Dept(2, "History", list2);
		Dept d3=new Dept(3, "Arts", list1);
		Dept d4=new Dept(4, "Geography", list2);
		
		HashMap<Integer, Dept> hmap1=new HashMap<Integer, Dept>();
		hmap1.put(d1.getDid(), d1);
		hmap1.put(d2.getDid(), d2);
		hmap1.put(d3.getDid(), d3);
		hmap1.put(d4.getDid(), d4);
		
		for(Map.Entry<Integer, Dept>e:hmap1.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println("----------------------------------------------------------------");
		}
		
		/*2.	(continuation of 1)
	a.	Create 1 Department object with already used id and add Students to the dept.
	b.	Add the Department object with Dept id as key and Deptobj as value.
	c.	Observe how many elements are present in the Map. Iterate through the elements in the Map.
		 */
		
		Dept d5=new Dept(3, "Maths", list1);
		
		hmap1.put(d5.getDid(), d5);
		
		System.out.println("====================================================================");
		for(Map.Entry<Integer, Dept>e:hmap1.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println("----------------------------------------------------------------");
		}
		System.out.println("=====================================================================");
		
		/*3.	(continuation of 2)
	a.	Over-ride hashcode method from Object class in the Department class
	b.	Create 1 Department object with already used id and add Students to the dept.
	c.	Add the Department object with Dept id as key and Deptobj as value.
	d.	Observe how many elements are present in the Map. Iterate through the elements in the Map
		 */
		
		Dept d6=new Dept(1, "Commerce", list1);
		
		hmap1.put(d6.getDid(), d6);
		
		System.out.println("====================================================================");
		for(Map.Entry<Integer, Dept>e:hmap1.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println("----------------------------------------------------------------");
		}
		System.out.println("=====================================================================");
		
//		6.	What do you conclude from exercise 1
		/*
		 * keys are always unique
		 * there can be only one null value
		 * values can be duplicate
		 * values can be null*/
		
		/*7.	WAP to get the portion of a HashMap whose keys range from a given key (inclusive), 
		 * to another key (exclusive).*/
		HashMap<Integer, String>hmap2=new HashMap<Integer, String>();
		hmap2.put(1, "Kunal");
		hmap2.put(2, "Rekha");
		hmap2.put(3, "Mandar");
		hmap2.put(4, "Bharat");
		hmap2.put(5, "Neha");
		
		
	}
}
