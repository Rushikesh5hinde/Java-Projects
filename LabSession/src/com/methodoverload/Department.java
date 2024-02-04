package com.methodoverload;

public class Department {
	private int did;
	private String deptName;
	
	public Department() {
		
	}
	public Department(int did,String deptName) {
		this.did=did;
		this.deptName=deptName;
	}
	public void setDid(int did) {
		this.did=did;
	}
	public int getDid() {
		return did;
	}
	public void setDeptName(String deptName) {
		this.deptName=deptName;
	}
	public String getDeptName() {
		return deptName;
	}
	public String toString() {
		return "Id:"+did+" Dept Name:"+deptName;
	}
}
