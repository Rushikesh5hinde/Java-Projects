package com.demo.conditionalstatement;

import java.util.Scanner;

public class CheckProduct {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int quantity,price=50;
		double total=0,totalBill=0;
		
		System.out.println("Enter quantity");//60
		quantity=sc.nextInt();
		total=quantity*price;//3000
		
		if(quantity<=10) {
			System.out.println("No discount!");
			totalBill=total;
		}else if(quantity>10 && quantity<=25) {
			System.out.println("5% discount");
			totalBill=total-(0.05*total);
			
		}else if(quantity>25 && quantity<=50) {
			System.out.println("10% discount");
			totalBill=total-(0.1*total);
		}else if(quantity>50) {
			System.out.println("20% discount");
			totalBill=total-(0.2*total);//3000-(0.2*3000)
		}else {
			System.out.println("Invalid Input");
		}
		System.out.println("Total Bill:"+total);//3000
		System.out.println("Amount to Pay:"+totalBill);//2400
		
	}
}
