package com.map1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentDemo {
	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student(101, "Pooja", 89.0f));
		list.add(new Student(102, "Ajay", 65.5f));
		list.add(new Student(103, "Manjusha", 95.1f));
		list.add(new Student(104, "Gaurav", 34.0f));
		
		for(Student s:list) {
			System.out.println(s);
		}
		System.out.println("---------------------");
		HashMap<String, String>details=new HashMap<String, String>();
		
		Iterator<Student> itr=list.iterator();
		
		while(itr.hasNext()) {
			Student s=itr.next();
			if(s.getPer()>35) {
				
				details.put(s.getSname(), "Pass");
			}else {
				details.put(s.getSname(), "Fail");
			}
		}
		
		for(Map.Entry<String, String> e:details.entrySet()) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		
		System.out.println("------------------------");
		
		Set<String> s=details.keySet();
		for(String s1:s) {
			System.out.println(s1);
		}
		
		System.out.println("------------------------");
		Collection<String> c=details.values();
		for(String c1:c) {
			System.out.println(c1);
		}
		
		System.out.println("------------------------------");
		
	}
}
