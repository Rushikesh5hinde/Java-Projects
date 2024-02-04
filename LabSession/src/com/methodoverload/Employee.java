package com.methodoverload;

public class Employee {
	private int eid;
	private String empName;
	private double salary;
	private Department dept;
	
	public Employee() {
		
	}
	public Employee(int eid,String empName,double salary,Department dept) {
		this.eid=eid;
		this.empName=empName;
		this.salary=salary;
		this.dept=dept;
	}
	public void setEid(int eid) {
		this.eid=eid;
	}
	public int getEid() {
		return eid;
	}
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	public String getEmpName() {
		return empName;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setDepartment(Department dept) {
		this.dept=dept;
	}
	public Department getDepartment() {
		return dept;
	}
	public String toString() {
		return "Emp id:"+eid+" Name:"+empName+" Salary:"+salary+" Dept:"+dept;
	}
}
