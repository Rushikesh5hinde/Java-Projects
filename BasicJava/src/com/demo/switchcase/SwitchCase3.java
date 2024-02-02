package com.demo.switchcase;

import java.util.Scanner;

public class SwitchCase3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String choice;
		System.out.println("----------WELCOME----------");
		System.out.println("A.Tea\nB.Poha\nC.Coffee");
		System.out.println("Enter choice");
		choice=sc.next();
		
		switch(choice) {
		case "A":
		case "a":
			System.out.println("Tea for 10rs");
			break;
		case "B":
		case "b":
			System.out.println("Poha for 25rs");
			break;
		case "C":
		case "c":
			System.out.println("Coffee for 20rs");
			break;
		default:
			System.out.println("This option is not available!");
		}
	}
}
