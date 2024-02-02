package com.oops.oopsmethods;

public class Student {
	int sId=101;
	String sName="Rushikesh";
	public void setCustomData(int customid,String customName) {
		sId=customid;
		sName=customName;
	}
	public int getId() {
		return sId;
	}
	public void displayData() {
		sId=getId();
		System.out.println("Student Id:"+sId);
		System.out.println("Student Name:"+sName);
		
//		sId=102;
//		sName="Rohit";
		
//		System.out.println("Student Id:"+sId);
//		System.out.println("Student Name:"+sName);
		
	}
}
