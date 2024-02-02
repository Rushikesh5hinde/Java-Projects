package com.oops.constructor;

public class Employee {
	private int emp_id;
	private String name;
	private double sal;
	
	public Employee() {
		
	}
	public Employee(int emp_id,String name,double sal) {
		this.emp_id=emp_id;
		this.name=name;
		this.sal=sal;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id=emp_id;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSal(double sal) {
		this.sal=sal;
	}
	public double getSal() {
		return sal;
	}
}
