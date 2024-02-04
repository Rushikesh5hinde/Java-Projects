package com.ifelseextra;

import java.util.Scanner;

public class GrossSalary11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double sal;
		double totalSal=0;
		System.out.println("Enter basic salary");
		sal=sc.nextDouble();
		if(sal<=10000) {
			totalSal=sal+(sal*0.2)+(sal*0.8);
		}else if(sal<=20000) {
			totalSal=sal+(sal*0.25)+(sal*0.9);
		}else if(sal>20000) {
			totalSal=sal+(sal*0.3)+(sal*0.95);
		}
		System.out.println("Gross Salary:"+totalSal);
	}
}
