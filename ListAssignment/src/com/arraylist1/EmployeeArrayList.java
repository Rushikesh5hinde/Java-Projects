package com.arraylist1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class EmployeeArrayList {
	
	
	//5.	WAP to print Emp who have highest number of salary
	
	static void highestSalary(ArrayList<Employee> e) {
		Employee temp=new Employee();
		double maxsal=e.get(0).getSalary();
		for(Employee emp:e) {
			if(emp.getSalary()>maxsal) {
				maxsal=emp.getSalary();
				temp=emp;
			}
		}
		System.out.println("Employee:"+temp);
		System.out.println("MaxSalary:"+maxsal);
	}
	static void showArrayList(ArrayList<Employee> e) {
		for(Employee emp:e) {
			System.out.println(emp);
		}
	}
	
	//4.	WAP to print Emp who have name "Sachin"
	
	static void checkName(ArrayList<Employee> e,String name) {
		boolean flag=false;
		for(Employee emp:e) {
			if(emp.getName().equals(name)) {
				flag=true;
			}
		}
		if(flag) {
			System.out.println("Name is present");
		}else {
			System.out.println("Name not found");
		}
	}
	//3.	WAP to print Emp whose salary is > 10000
	
	static void compareSalary(ArrayList<Employee> e,double salary) {
		for(Employee emp:e) {
			if(emp.getSalary()>salary) {
				System.out.println(emp);
			}
		}
	}
	public static void main(String[] args) {
		ArrayList<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(101, "Kunal", 2000));
		emp.add(new Employee(104, "Neha", 25000));
		emp.add(new Employee(102, "Harshal", 20000));
		emp.add(new Employee(103, "Pooja", 18000));
		
//		System.out.println(emp);
//		for(Employee e:emp) {
//			System.out.println(e);
//		}
		showArrayList(emp);
		System.out.println("----------------");
//		double salary=10000;
//		compareSalary(emp, salary);
//		checkName(emp, "Sachin");
//		highestSalary(emp);
		
//		Collections.sort(emp);
		
//		Collections.sort(emp, new EmployeeIdComparator());
//		Collections.sort(emp, new EmployeeNameComparator());
//		Collections.sort(emp, new EmployeeSalaryComparator());
		
		
		//8.	WAP to copy one ArrayList into another
		System.out.println("---------------------------");
		
		ArrayList<Employee> emp1=new ArrayList<Employee>();
		
		emp1.addAll(emp);
		showArrayList(emp1);
		
		System.out.println("---------------------------");
		//10.	WAP to join two ArrayLists
		
		ArrayList<Employee> emp2=new ArrayList<Employee>();
		emp2.add(new Employee(105, "Mohan", 2000));
		emp2.add(new Employee(106, "Sagar", 25000));
		
		emp2.addAll(2, emp);
		
		System.out.println(emp2);
		
		System.out.println("---------------------------");
		
		//13.	WAP to trim the capacity of an ArrayList the current list size
		
		ArrayList<Employee> emp3=new ArrayList<Employee>(3);
		emp3.add(new Employee(101, "Kunal", 2000));
		emp3.add(new Employee(104, "Neha", 25000));
		
		System.out.println(emp3.size());
		System.out.println("---------------------------");
		emp3.trimToSize();
		
		System.out.println(emp3);
		System.out.println("---------------------------");
		
		//17.	WAP to shuffle elements in an ArrayList
		System.out.println(emp);
		Collections.shuffle(emp);
		System.out.println(emp);
		
		System.out.println("-----------------------------");
		
		//18.	WAP to reverse elements in an ArrayList
		System.out.println(emp);
		Collections.reverse(emp);
		System.out.println(emp);
		
		System.out.println("-----------------------------");
		
		//19.	WAP to extract a portion of an ArrayList
		
		System.out.println(emp.subList(1, 3));
		
		System.out.println("-----------------------------");
		
		//20.	WAP to print all the elements of an ArrayList using the position of the elements
//		for(int i=0;i<emp.size();i++) {
//			System.out.println(emp.get(i));
//		}
		
		ListIterator<Employee> itr=emp.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
