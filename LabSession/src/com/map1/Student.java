package com.map1;

public class Student {
	private int sid;
	private String sname;
	private float per;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, float per) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.per = per;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", per=" + per + "]";
	}
	
	
}
