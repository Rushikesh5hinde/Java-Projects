package com.comparatorassignment;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeArrayList {
	static void showArrayList(ArrayList<Employee> emp) {
		for(Employee e:emp) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		ArrayList<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(101, "Kunal", "Analyst", 24));
		emp.add(new Employee(103, "Neha", "Manager", 34));
		emp.add(new Employee(102, "Vinay", "Team Lead", 27));
		emp.add(new Employee(104, "Gauri", "Consultant", 33));
		emp.add(new Employee(106, "Smita", "Developer", 24));
		
		showArrayList(emp);
		System.out.println("---------------------------");
		
		Collections.sort(emp);
		
		
		showArrayList(emp);
	}
}
