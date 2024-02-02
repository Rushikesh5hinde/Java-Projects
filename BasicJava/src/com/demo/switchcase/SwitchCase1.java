package com.demo.switchcase;

import java.util.Scanner;

public class SwitchCase1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("----------WELCOME----------");
		System.out.println("1.Tea\n2.Coffee\n3.Sandwitch\n4.Vadapaav");
		
		System.out.println("Enter choice");
		choice=sc.nextInt();
		//Long choice1=120l;
		//float choice1=2.3f;
		//double choice1=3.3;
		//boolean choice1=false;
		switch(choice) {	//------------------------long,float,double,boolean is not applicable
		case 1:
			System.out.println("Tea for 20 rs");
			break;
		case 2:
			System.out.println("Cofee for 50 rs");
			break;//--------------------------------------------break is not compulsory
		case 3:
			System.out.println("Sandwitch for 50 rs");
			break;
		case 4:
			System.out.println("Vadapaav for 25 rs");
			break;
		default:
			System.out.println("This option is not available");
		}

	}

}
