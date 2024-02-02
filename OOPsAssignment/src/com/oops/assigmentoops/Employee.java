package com.oops.assigmentoops;

public class Employee {
	int empId;
	String empName;
	double empSal;
	String designation;
	
	public void setData(int empId,String empName,double empSal,String designation) {
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;
		this.designation=designation;
	}
	public double calHra() {
		double hra=empSal*0.1;
		return hra;
	}
	public double calDA() {
		double da=empSal*0.15;
		return da;
	}
	public double basicSal() {
		double basic =empSal-calHra()-calDA();
		return basic;
	}
	public void display() {
		System.out.println("Employee Id:"+empId);
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee Salary:"+empSal);
		System.out.println("HRA:"+calHra());
		System.out.println("DA:"+calDA());
		System.out.println("Basic Salary:"+basicSal());
	}
}
