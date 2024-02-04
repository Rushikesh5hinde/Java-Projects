package com.method_ifelse;

import java.util.Scanner;

public class ProfitLoss9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int costPrice,sellPrice;
		System.out.println("Enter Cost Price");
		costPrice=sc.nextInt();
		System.out.println("Enter Sell Price");
		sellPrice=sc.nextInt();
		checkProfitLoss(costPrice, sellPrice);
	}
	public static void checkProfitLoss(int costPrice,int sellPrice) {
		if(costPrice-sellPrice>0) {
			System.out.println("Loss:"+(costPrice-sellPrice));
		}else if(costPrice-sellPrice<0) {
			System.out.println("Profit:"+(sellPrice-costPrice));
		}
	}
}
