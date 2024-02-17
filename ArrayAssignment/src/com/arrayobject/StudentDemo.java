package com.arrayobject;
class Student{
	private int rollno;
	private String name;
	private int age;
	private double marks;
	public Student() {
		super();
	}
	public Student(int rollno, String name, int age, double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
	
}
public class StudentDemo {
	static void displayStudentDetails(Student[] st) {
		for(Student s:st) {
			System.out.println(s);
		}
	}
	static void compareMarksAndAge(Student[] st,double marks,int age) {
		for(int i=0;i<st.length;i++) {
			if(st[i].getMarks()>marks && st[i].getAge()<age) {
				System.out.println(st[i]);
			}
		}
	}
	public static void main(String[] args) {
		Student[] st=new Student[4];
		st[0]=new Student(101, "Rohit", 17, 78);
		st[1]=new Student(102, "Kavya", 13, 90);
		st[2]=new Student(103, "Dinesh", 14, 56);
		st[3]=new Student(104, "Kriti", 15, 90);
		
		displayStudentDetails(st);
		System.out.println("-------------------------------------------------");
		compareMarksAndAge(st, 60, 15);
	}
}
