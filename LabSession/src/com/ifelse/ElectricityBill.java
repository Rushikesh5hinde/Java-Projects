package com.ifelse;

import java.util.Scanner;

public class ElectricityBill {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int units;
		double bill=0.0;
		System.out.println("Enter units");
		units=sc.nextInt();
		if(units<=50) {
			bill=100+(units*2);
		}else if(units<=80) {
			bill=100+(50*2)+(units-50)*3;
		}else if(units<=100) {
			bill=100+(50*2)+(30*3)+(units-80)*4;
		}else if(units>100) {
			bill=100+(50*2)+(30*3)+(20*4)+(units-100)*7;
		}
		System.out.println("Electricity Bill:"+bill);
	}
}
