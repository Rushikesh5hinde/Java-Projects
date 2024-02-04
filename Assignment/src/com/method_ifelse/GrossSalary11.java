package com.method_ifelse;

import java.util.Scanner;

public class GrossSalary11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double sal;
		System.out.println("Enter basic salary");
		sal=sc.nextDouble();
		System.out.println(grossSalary(sal));
	}
	public static double grossSalary(double sal) {
		double totalSal=0;
		if(sal<=10000) {
			totalSal=sal+(sal*0.2)+(sal*0.8);
		}else if(sal<=20000) {
			totalSal=sal+(sal*0.25)+(sal*0.9);
		}else if(sal>20000) {
			totalSal=sal+(sal*0.3)+(sal*0.95);
		}
		return totalSal;
	}
}
