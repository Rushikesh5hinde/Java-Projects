package com.containment;

public class Driver {
	private int driverid;
	private String name;
	private long aadharNo;
	private double salary;
	
	public Driver() {
		
	}
	public Driver(int driverid,String name,long aadharNo,double salary)
	{
		this();
		this.driverid=driverid;
		this.name=name;
		this.aadharNo=aadharNo;
		this.salary=salary;
	}
	public void setDriverId(int driverid) {
		this.driverid=driverid;
	}
	public int getDriverId() {
		return driverid;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo=aadharNo;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
	public String toString() {
		return "Driver:"+driverid+" "+name+" "+aadharNo+" "+salary;
	}
}
