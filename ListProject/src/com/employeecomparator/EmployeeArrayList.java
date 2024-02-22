package com.employeecomparator;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeArrayList {
	public static void main(String[] args) {
		ArrayList<Employee> elist=new ArrayList<Employee>();
		elist.add(new Employee(101, "Ram", 20000));
		elist.add(new Employee(103, "Onkar", 16000));
		elist.add(new Employee(102, "Shreyash", 25000));
		elist.add(new Employee(104, "Namrata", 30000));
		elist.add(new Employee(105, "Dinesh", 15000));
		elist.add(new Employee(107, "Tejas", 12000));
		elist.add(new Employee(106, "Yash", 12000));
		
		for(Employee e:elist) {
			System.out.println(e);
		}
		
//		Collections.sort(elist,new EmployeeSalaryComparator());
		
		Collections.sort(elist, Collections.reverseOrder(new EmployeeSalaryComparator()));
		System.out.println("--------------------------------");
		for(Employee e:elist) {
			System.out.println(e);
		}
	}
}
