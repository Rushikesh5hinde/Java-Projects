package com.oops.staticvariable;

public class Employee {
	private static int empid;
	private String empname;
	private double empsal;
	
	{
		empid++;
	}
	public Employee() {
		
	}
	public Employee(String empname,double empsal) {
		this();
		this.empname=empname;
		this.empsal=empsal;
	}
	public void setEmpName(String empname) {
		this.empname=empname;
	}
	public String getEmpName() {
		return empname;
	}
	public void setEmpSal(double empsal) {
		this.empsal=empsal;
	}
	public double getEmpSal() {
		return empsal;
	}
	public String toString() {
		return "id:"+empid+" name:"+empname+" Salary:"+empsal;
	}
}
