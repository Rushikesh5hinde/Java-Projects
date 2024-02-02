package com.oops.assigmentoops;

public class Student {
	int sId=101;
	String sName="Rushi";
	int sMarks=68;
	
	public void setDetails(int sid,String sname,int smarks) {
		sId=sid;
		sName=sname;
		sMarks=smarks;
	}
	public void display() {
		System.out.println("Student Id:"+sId);
		System.out.println("Student Name:"+sName);
		System.out.println("Student Marks:"+sMarks);
		System.out.println("--------------");
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.sId=101;
		s1.sName="Rohit";
		s1.sMarks=75;
		
		s1.display();
		Student s2=new Student();
		s2.sId=102;
		s2.sName="Supriya";
		s2.sMarks=85;
		s2.display();
	}
}
