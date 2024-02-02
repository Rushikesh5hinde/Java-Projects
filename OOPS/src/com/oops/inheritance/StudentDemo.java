package com.oops.inheritance;

import java.util.Scanner;

class Student{
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
	public String toString() {
		return "Student:"+sid+" "+sname;
	}
}
class SchoolStudent extends Student{
	protected String course;
	protected double fees;
	
	public SchoolStudent() {
		super();
	}
	public SchoolStudent(int sid,String sname,String course,double fees) {
		super(sid,sname);
		this.course=course;
		this.fees=fees;
	}
	public String toString() {
		return "School Student:"+getSid()+" "+getSname()+" "+course+" "+fees;
	}
}
class CollegeStudent extends Student{
	protected double marks;
	protected String grades;
	public CollegeStudent() {
		super();
	}
	public CollegeStudent(int sid,String sname,double marks,String grades) {
		super(sid,sname);
		this.marks=marks;
		this.grades=grades;
	}
	public String toString() {
		return "College Student:"+getSid()+" "+getSname()+" "+marks+" "+grades;
	}
}
public class StudentDemo {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		SchoolStudent s1=new SchoolStudent(1, "Rohit", "Java", 50000);
		System.out.println(s1);
		SchoolStudent s2=new SchoolStudent(2, "Priya", "Automation", 40000);
		System.out.println(s2);
		
		SchoolStudent s3=new SchoolStudent();
		System.out.println("Enter student id:");
		s3.setSid(sc.nextInt());
		System.out.println("Enter student name");
		s3.setSname(sc.next());
		System.out.println("Enter course name");
		s3.course=sc.next();
		System.out.println("Enter fees");
		s3.fees=sc.nextDouble();
		System.out.println(s3);
		
		System.out.println("-------------------------------------------------------");
		CollegeStudent c1=new CollegeStudent(101, "Akash", 87, "A");
		System.out.println(c1);
		CollegeStudent c2=new CollegeStudent(102, "Supriya", 95, "A");
		System.out.println(c2);
	
		CollegeStudent c3=new CollegeStudent();
		System.out.println("Enter student id:");
		c3.setSid(sc.nextInt());
		System.out.println("Enter student name");
		c3.setSname(sc.next());
		System.out.println("Enter marks");
		c3.marks=sc.nextDouble();
		System.out.println("Enter grades");
		c3.grades=sc.next();
		System.out.println(c3);
	}
}
