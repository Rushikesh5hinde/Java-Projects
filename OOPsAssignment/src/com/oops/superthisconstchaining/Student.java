package com.oops.superthisconstchaining;

public class Student {
	private int id;
	private String name;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setId(11);
//		this.id=100;
		Student s2=new Student();
		s2.setId(21);
	}
}
