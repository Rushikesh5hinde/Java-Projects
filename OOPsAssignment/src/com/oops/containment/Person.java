package com.oops.containment;

public class Person {
	private String pname;
	private String gender;
	private int age;
	private Address address;
	
	public Person() {
		
	}
	public Person(String pname,String gender,int age,Address address) {
		this.pname=pname;
		this.gender=gender;
		this.age=age;
		this.address=address;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String toString() {
		return "Person:"+pname+" "+gender+" "+age+" "+address;
	}
}
