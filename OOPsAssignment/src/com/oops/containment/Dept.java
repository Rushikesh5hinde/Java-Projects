package com.oops.containment;

public class Dept {
	private int dept_id;
	private String dept_name;
	public Dept() {
	
	}
	public Dept(int dept_id, String dept_name) {
		this.dept_id = dept_id;
		this.dept_name = dept_name;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String toString() {
		return "Dept:"+dept_id+" "+dept_name;
	}
	
}
