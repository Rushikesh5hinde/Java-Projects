package com.oops.staticvar;

import java.util.Scanner;

public class GroceryShop {
	static Scanner sc=new Scanner(System.in);
	public static void enterItemDetails(Item i) {
		System.out.println("Enter item id:");
		i.setItemid(sc.nextInt());
		System.out.println("Enter item name:");
		i.setIname(sc.next());
		System.out.println("Enter cost:");
		i.setCost(sc.nextDouble());
		System.out.println("Enter quantity");
		i.setQty(sc.nextInt());
	}
	
	public static void main(String[] args) {
		Item i1=new Item();
		enterItemDetails(i1);
//		
//		Item i2=new Item();
//		enterItemDetails(i2);
//		
//		System.out.println(i1);
//		System.out.println("Amount to pay:"+i1.calDiscountPrice(10));
//		System.out.println(i2);
//		
//		System.out.println("Amount to pay:"+i2.calDiscountPrice(20));
//		
//		System.out.println("Items added:"+Item.icount);
	}
}
