package com.oops.inheritance;
class Employee{
	protected int id;
	protected String name;
	protected double salary;
	
	Employee(){
		
	}
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString() {
		return "Employee:"+id+" "+name+" "+salary;
	}
}
class Manager extends Employee{
	protected String role;
	protected String wing;
	
	Manager(){
		
	}
	Manager(int id,String name,double salary,String role,String wing){
		super(id,name,salary);
		this.role=role;
		this.wing=wing;
	}
	public String toString() {
		return "Manager:"+super.toString()+" "+role+" "+wing;
	}
}
public class SuperKeywordDemo2 {
	public static void main(String[] args) {
		Manager m1=new Manager(1, "rushi", 45000, "TL", "Developments");
		System.out.println(m1);
	}
}
