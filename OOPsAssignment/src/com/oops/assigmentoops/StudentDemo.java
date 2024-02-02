package com.oops.assigmentoops;

public class StudentDemo {
	int marks1;
	int marks2;
	int marks3;
	
	public void displayGrade(int m1,int m2,int m3) {
		marks1=m1;
		marks2=m2;
		marks3=m3;
		
		int total=marks1+marks2+marks3;
		double per=(total*100)/300;
		if(per>=75) {
			System.out.println("First Class with distinction");
		}else if(per>=60 && per<75) {
			System.out.println("First Class");
		}else if(per>=35 && per<60) {
			System.out.println("Second Class");
		}else
			System.out.println("fail");
	}
	public static void main(String[] args) {
		StudentDemo d1=new StudentDemo();
		d1.displayGrade(65, 75, 60);
	}
	
}
