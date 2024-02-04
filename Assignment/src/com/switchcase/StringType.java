package com.switchcase;

import java.util.Scanner;

public class StringType {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String choice;
		System.out.println("------------Hotel Menu-------");
		System.out.println("A.Veg\nB.Non-veg");
		System.out.println("Enter your choice");
		choice=sc.next();
		switch(choice) {
		case "A":
			System.out.println("-----------Veg Menu---------");
			System.out.println("a.Paneer\nb.Mix-Veg");
			System.out.println("Enter choice");
			choice=sc.next();
			switch(choice) {
			case "a":
				System.out.println("Paneer=100rs");
				break;
			case "b":
				System.out.println("Mix-Veg=150rs");
				break;
			default:
				System.out.println("Invalid Input");
			}
			break;
		case "B":
			System.out.println("-----------Non-Veg Menu---------");
			System.out.println("a.Butter Chicken\nb.Chicken Biryani");
			System.out.println("Enter choice");
			choice=sc.next();
			switch(choice) {
			case "a":
				System.out.println("Butter Chicken=100rs");
				break;
			case "b":
				System.out.println("Chicken Biryani=150rs");
				break;
			default:
				System.out.println("Invalid Input");
			}
			break;
		default:
			System.out.println("Invalid Input");
		}
		
	}
}
