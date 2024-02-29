package com.map1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EmpDeptArrayList {
	static void showDeptEmployees(ArrayList<Employee> emp) {
		HashMap<Department, ArrayList<Employee>>hm=new HashMap<Department, ArrayList<Employee>>();
		ArrayList<Employee> e1;
		for(Employee e:emp) {
			Department d=e.getDepartment();
			
			if(hm.containsKey(d)) {
				e1=hm.get(d);
				e1.add(e);
				hm.put(d, e1);
			}else {
				e1=new ArrayList<Employee>();
				e1.add(e);
				hm.put(d, e1);
			}
		}
		for(Map.Entry<Department, ArrayList<Employee>>e:hm.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println("-----------------------------------");
		}
	}
	static void showEmployeeDetails(ArrayList<Employee> emp) {
		HashMap<Department, Integer>hm=new HashMap<Department, Integer>();
		
		Iterator<Employee> itr=emp.iterator();
		while(itr.hasNext()) {
			
			Department dept=itr.next().getDepartment();
			
				if(hm.containsKey(dept)) {
					
				hm.put(dept, hm.get(dept)+1);
				}else {
					hm.put(dept, 1);
				}
			
		}
		for(Map.Entry<Department, Integer>e:hm.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
	}
	static void showSalaryDetails(ArrayList<Employee> emp) {
		HashMap<Department, Double>hm=new HashMap<Department, Double>();
		
		Iterator<Employee> itr=emp.iterator();
		while(itr.hasNext()) {
			double salary=0.0;
			Employee e1=itr.next();
			Double sal=e1.getSalary();
			Department d1=e1.getDepartment();
				if(hm.containsKey(d1)) {
					salary=hm.get(d1);
					
				hm.put(d1, salary+sal);
				}else {
					
					hm.put(d1, sal);
				}
			
		}
		for(Map.Entry<Department, Double>e:hm.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
	}
	public static void main(String[] args) {
		ArrayList<Employee> emp=new ArrayList<Employee>();
		
		emp.add(new Employee(101, "Pooja", 17000.0, new Department(1, "HR")));
		emp.add(new Employee(102, "Neha", 21000.0, new Department(2, "Finance")));
		emp.add(new Employee(103, "Mandar", 18000.0, new Department(1, "HR")));
		emp.add(new Employee(104, "Pravin", 23000.0, new Department(1, "HR")));
		emp.add(new Employee(105, "Disha", 20000.0, new Department(3, "Sales")));
		
		for(Employee e:emp) {
			System.out.println(e);
		}
		System.out.println("=================================================");
//		showEmployeeDetails(emp);
//		showSalaryDetails(emp);
		showDeptEmployees(emp);
	}
}
