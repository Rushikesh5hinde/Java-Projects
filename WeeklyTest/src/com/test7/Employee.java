package com.test7;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private double salary;

	public Employee(){
	}
	public Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString(){
		return "Id:"+id+" Name:"+name+" Salary:"+salary;
	}
	@Override
	public int compareTo(Employee e){
		if(this.salary==e.salary)
		return this.name.compareTo(e.name);
		else if(this.salary>e.salary)
		return 1;
		else
		return -1;
	}
}
