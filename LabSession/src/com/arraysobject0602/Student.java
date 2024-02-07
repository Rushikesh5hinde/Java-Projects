package com.arraysobject0602;

import java.util.Arrays;

public class Student {
	private int id;
	private String name;
	private double[] marks;
	private double percentage;
	public Student() {
		super();
		
	}
	public Student(int id, String name, double[] marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		percentage=getPercentage();
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
	public double[] getMarks() {
		return marks;
	}
	public void setMarks(double[] marks) {
		this.marks = marks;
	}
	
	public double getPercentage() {
		double total=0.0;
		for(double m:marks) {
			total+=m;
		}
		percentage=(total/marks.length);
		return percentage;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks) + ", percentage="
				+ percentage + "]";
	}
	
	
}
