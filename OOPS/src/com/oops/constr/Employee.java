package com.oops.constr;

public class Employee {
	private int eid;
	private String ename;
	private double esal;
	
	Employee(){
		System.out.println("default constructor");
	}
	Employee(int eid,String ename){
		this();
		System.out.println("Para..1");
		this.eid=eid;
		this.ename=ename;
		
	}
	Employee(int eid,String ename,double esal){
		this(eid,ename);
		System.out.println("Para..2");
		this.esal=esal;
	}
	public String toString() {
		return "Employee: "+"[ ID:"+eid+" Name:"+ename+" Sal:"+esal+"]";
	}
	public void setEid(int eid) {
		this.eid=eid;
	}
	public int getEid() {
		return eid;
	}
	public void setEname(String ename) {
		this.ename=ename;
	}
	public String getEname() {
		return ename;
	}
	public void setEsal(double esal) {
		this.esal=esal;
	}
	public double getEsal() {
		return esal;
	}
}
