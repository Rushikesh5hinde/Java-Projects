package com.method_ifelse;

import java.util.Scanner;

public class CompareGrades10 {
	public static void main(String[] args) {
		checkGrades();
	}
	public static void checkGrades() {
		Scanner sc=new Scanner(System.in);
		double phMarks,bMarks,chMarks,maMarks,cMarks,per;
		System.out.println("Enter marks of Physics");
		phMarks=sc.nextDouble();
		System.out.println("Enter marks of Biology");
		bMarks=sc.nextDouble();
		System.out.println("Enter marks of Chemistry");
		chMarks=sc.nextDouble();
		System.out.println("Enter marks of Maths");
		maMarks=sc.nextDouble();
		System.out.println("Enter marks of Computer");
		cMarks=sc.nextDouble();
		per=(phMarks+bMarks+chMarks+maMarks+cMarks)/5;
		if(per>=90) {
			System.out.println("Grade A");
		}else if(per>=80) {
			System.out.println("Grade B");
		}else if(per>=70) {
			System.out.println("Grade C");
		}else if(per>=60) {
			System.out.println("Grade D");
		}else if(per>=40) {
			System.out.println("Grade E");
		}else if(per<40) {
			System.out.println("Grade F");
		}
	}
}
