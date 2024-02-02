package com.oops.lab;

public class Student {
	private int rollno;
	private String name;
	private int sub1;
	private int sub2;
	private int sub3;
	private int sub4;
	private int sub5;
	private double percentage;
	private double total;
	private char grade;
	
	public Student() {
		
	}
	public Student(int rollno,String name,int sub1,int sub2,int sub3,int sub4,int sub5) {
		this();
		this.rollno=rollno;
		this.name=name;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.sub4=sub4;
		this.sub5=sub5;
	}
	public double calculatePercentage() {
		total=sub1+sub2+sub3+sub4+sub5;
		percentage=total/5;
		return percentage;
	}
	public void calculateGrade() {
		percentage=calculatePercentage();
		System.out.println("Percentage:"+percentage);
		if(percentage>75) {
			System.out.println("Grade A");
		}else if(percentage>60 && percentage<=75) {
			System.out.println("Grade B");
		}else if(percentage>35 && percentage<=60) {
			System.out.println("Grade C");
		}else {
			System.out.println("Fail");
		}
	}
	public void displayStudent() {
		System.out.println("Student rollno:"+rollno);
		System.out.println("Student Name:"+name);
		calculateGrade();
	}
	public void comparePercentage(Student s) {
		this.percentage=calculatePercentage();
		if(this.percentage==s.percentage) {
			System.out.println("Same Percentage");
		}else if(this.percentage<s.percentage) {
			System.out.println(s.name+" has higher percentage");
		}else {
			System.out.println(this.name+" has higher percntage");
		}
	}
}
