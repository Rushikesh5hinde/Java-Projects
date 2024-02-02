package com.oops.constructor;
//pojo- plain old java object
public class Student {
	private int sid;
	private String sname;
	
	public Student() {
		
	}
	public Student(int sid,String sname) {
		this.sid=sid;
		this.sname=sname;
	}
	public void setSid(int sid) {
		this.sid=sid;
	}
	public int getSid() {
		return sid; 
	}
	public void setSname(String sname) {
		this.sname=sname;
	}
	public String getSname() {
		return sname;
	}
	public void show() {
		System.out.println("Student id:"+sid);
		System.out.println("Student name:"+sname);
	}
}
