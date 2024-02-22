package com.arraylist1;

public class Emp implements Comparable<Emp>{
	private int id;
	private String name;
	private double salary;
	private Dept dept;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int id, String name, double salary, Dept dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return (int) (this.salary-o.salary);
	}
	
	
}
