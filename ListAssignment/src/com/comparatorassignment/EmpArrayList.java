package com.comparatorassignment;

import java.util.ArrayList;
import java.util.Collections;

public class EmpArrayList {
	static void showArrayList(ArrayList<Emp> emp) {
		for(Emp e:emp) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		ArrayList<Emp> emp=new ArrayList<Emp>();
		emp.add(new Emp(101, "Pradip", new Profile("MH", "India")));
		emp.add(new Emp(102, "Jack", new Profile("Wales", "United Kingdom")));
		emp.add(new Emp(103, "Rehan", new Profile("Sydney", "Australia")));
		emp.add(new Emp(104, "Smith", new Profile("UP", "India")));
		
		showArrayList(emp);
		System.out.println("-------------------------------");
		Collections.sort(emp);
		
		showArrayList(emp);
	}
}
