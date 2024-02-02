package com.demo.method;

import java.util.Scanner;

public class ProductPrice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int qty;
		System.out.println("Enter Quantity:");
		qty=sc.nextInt();
		priceProduct(qty);
	}
	public static void priceProduct(int qty) {
		int pPrice=100,finalBill=0;
		
		if(qty>50) {
			finalBill=pPrice*qty;
		}else if(qty>30 && qty<=50) {
			pPrice=125;
			finalBill=pPrice*qty;
		}else if(qty<=30) {
			pPrice=140;
			finalBill=pPrice*qty;
		}
		System.out.println("Amount to pay:"+finalBill);
	}
}
