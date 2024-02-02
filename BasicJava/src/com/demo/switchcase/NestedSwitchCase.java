package com.demo.switchcase;

import java.util.Scanner;

public class NestedSwitchCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		
		System.out.println("-------Welcome to Amazon----------");
		System.out.println("1.Men\n2.Women\n3.Kids");
		System.out.println("Enter choice");
		
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("----Welcome to Mens Section-----");
			System.out.println("1.Tshirt\n2.Shirts\n3.Footwear");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("you selected Tshirt!");
					break;
				case 2:
					System.out.println("you selected Shirt!");
					break;
				case 3:
					System.out.println("you selected Footwear!");
					break;
				default:
					System.out.println("This option is not available");
				}
			break;
		case 2:
			System.out.println("------Welcome to Women's Section-----");
			System.out.println("1.Jwellary\n2.Clothes\n3.Makeup");
			System.out.println("Enter choice");
			choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("you choice is Jwellery");
					break;
				case 2:
					System.out.println("you choice is Clothes");
					break;
				case 3:
					System.out.println("you choice is Makeup");
					break;
				default:
					System.out.println("This option is not available");
				}
			break;
		case 3:
			System.out.println("---------Welcome to Kids Section-------");
			System.out.println("1.Clothes\n2.Toys\n3.Books");
			System.out.println("Enter choice");
			choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("you choice is Clothes");
					break;
				case 2:
					System.out.println("you choice is Toys");
					break;
				case 3:
					System.out.println("you choice is Books");
					break;
				default:
					System.out.println("This option is not available");
				}
			break;
		}
	}
}
