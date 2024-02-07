package com.arraysobject0602;

import java.util.Scanner;

public class EmployeeDemo {
	static Scanner sc=new Scanner(System.in);
	public static void enterEmployeeDetails(Employee e) {
		System.out.println("Enter employee id:");
		e.setEid(sc.nextInt());
		System.out.println("Enter employee name:");
		e.setEname(sc.next());
		System.out.println("Enter salary:");
		e.setSalary(sc.nextDouble());
		
		e.setDepartment(new Department());
		System.out.println("Enter dept id:");
		e.getDepartment().setId(sc.nextInt());
		System.out.println("Enter dept name");
		e.getDepartment().setName(sc.next());
		System.out.println("Enter dept location:");
		e.getDepartment().setLocation(sc.next());
		
	}
	public static void displayEmployees(Employee[] emp) {
		for(Employee e:emp) {
			System.out.println(e);
		}
		
	}
	public static void sortEmployees(Employee[] emp) {
		Employee temp=new Employee();
		for(int i=0;i<emp.length;i++) {
			for(int j=i+1;j<emp.length;j++) {
				if(emp[i].getSalary()>emp[j].getSalary()) {
					temp=emp[i];
					emp[i]=emp[j];
					emp[j]=temp;
				}
			}
		}
		
	}
	public static void maxSalaryEmployee(Employee[] emp) {
		double maxsal=emp[0].getSalary();
		Employee temp=new Employee();
		for(Employee e:emp) {
			if(maxsal<e.getSalary()) {
				temp=e;
			}
		}
		System.out.println(temp);
		
	}
	public static void main(String[] args) {
		Employee[] emp=new Employee[3];
		
		for(int i=0;i<emp.length;i++) {
			emp[i]=new Employee();
			enterEmployeeDetails(emp[i]);
		}
		
		displayEmployees(emp);
		System.out.println("------------------------");
		sortEmployees(emp);
		displayEmployees(emp);
		System.out.println("----------------------------");
		maxSalaryEmployee(emp);
	}
	

	

	
}
