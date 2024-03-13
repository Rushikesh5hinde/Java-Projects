package com.hashmapdemo;

import java.util.ArrayList;

public class EmployeeArrayList {
	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee(101, "Pooja", 12000, new Department(1, "HR")));
		al.add(new Employee(102, "Ram", 12000, new Department(2, "IT")));
		al.add(new Employee(103, "Rupal", 12000, new Department(1, "HR")));
		
		
	}
}
