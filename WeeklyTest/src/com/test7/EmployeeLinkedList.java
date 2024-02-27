package com.test7;

import java.util.Collections;
import java.util.LinkedList;

public class EmployeeLinkedList {
	public static void main(String[] args)
    {
        LinkedList<Employee> list = new LinkedList<>();
        list.add(new Employee(1,"Kunal",17000.0));
        list.add(new Employee(2,"Neha",25000.0));
        list.add(new Employee(3,"Mandar",21000.0));
        list.add(new Employee(4,"Akshay",21000.0));
	
	for(Employee e:list){
		System.out.println(e);
	}

	Collections.sort(list);

	System.out.println("-------------------------------");
	for(Employee e:list){
		System.out.println(e);
		}
    }
}
