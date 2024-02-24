package com.comparatorassignment;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private String designtion;
	private int age;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String designtion, int age) {
		super();
		this.id = id;
		this.name = name;
		this.designtion = designtion;
		this.age = age;
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
	public String getDesigntion() {
		return designtion;
	}
	public void setDesigntion(String designtion) {
		this.designtion = designtion;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designtion=" + designtion + ", age=" + age + "]";
	}
	
	public int compareTo(Employee e) {
		if(this.id==e.id)
			return 0;
		else if(this.id<e.id)
			return 1;
		else
			return -1;
	}
	
}
